import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JButton btnGameDir,btnModDir,btnExport, btnAddMod,btnRemoveMod;
    private JPanel modsPanel,modsCommandPanel;
    private JLabel labInfo;
    private SpriteTypeManager manager;
    private boolean isLookingToRemoveMod =false;

    public MainFrame(){
        super("HOI4-QuickInsertGFX");

        manager = new SpriteTypeManager();

        setLayout(new GridLayout(6,1,10,10));

        btnGameDir = new JButton("[1.Input] Click to Set Game Directory");
        btnModDir = new JButton("[2.Output] Click to Set Mod Directory");
        btnAddMod = new JButton("[Option] Add Mod");
        btnRemoveMod = new JButton("Remove Mod");
        btnExport = new JButton("[3.Export]");
        labInfo = new JLabel("<html>Status: <font color='black'>Ok</font></html>");
        labInfo.setHorizontalAlignment(JLabel.CENTER);

        btnGameDir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final JFileChooser fc = new JFileChooser();
                fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                fc.setDialogTitle("Select Game Folder");
                int response = fc.showOpenDialog(getContentPane());
                if(response == JFileChooser.APPROVE_OPTION){
                    String gamePath = (fc.getSelectedFile().toString());
                    String message = manager.setGamePath(gamePath);
                    labInfo.setText(message);
                    btnGameDir.setText(gamePath);
                }
            }
        });

        btnModDir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final JFileChooser fc = new JFileChooser();
                fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                fc.setDialogTitle("Select Mod Folder");
                int response = fc.showOpenDialog(getContentPane());
                if(response == JFileChooser.APPROVE_OPTION){
                    String modPath = (fc.getSelectedFile().toString());
                    String message = manager.setModPath(modPath);
                    labInfo.setText(message);
                    btnModDir.setText(fc.getSelectedFile().getName());
                }
            }
        });

        btnAddMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final JFileChooser fc = new JFileChooser();
                fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                fc.setDialogTitle("Select Mod Folder");
                int response = fc.showOpenDialog(getContentPane());
                if(response == JFileChooser.APPROVE_OPTION){
                    String modPath = (fc.getSelectedFile().toString());
                    String modName = fc.getSelectedFile().getName();
                    manager.addExtraMod(new ModData(modName, modPath), new EventHandler() {
                        @Override
                        public void onSuccess(String message) {
                            addModToPanel(modName);
                            labInfo.setText(message);
                        }

                        @Override
                        public void onError(String message) {
                            labInfo.setText(message);
                        }
                    });


                }
            }
        });

        btnRemoveMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isLookingToRemoveMod = true;
                labInfo.setText("Click mod button in below panel to remove.");
            }
        });

        //Panel
        modsCommandPanel = new JPanel();
        modsCommandPanel.setLayout(new GridLayout(1,2,5,5));
        modsCommandPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        modsCommandPanel.setBorder(BorderFactory.createMatteBorder(
                1, 5, 1, 1, Color.BLUE));
        modsCommandPanel.add(btnAddMod);
        modsCommandPanel.add(btnRemoveMod);

        modsPanel = new JPanel();
        modsPanel.setLayout(new GridLayout(0,3,3,3));
        modsPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        TitledBorder title;
        title = BorderFactory.createTitledBorder("[Option] Mods");
        modsPanel.setBorder(title);
        //Panel

        btnExport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new SwingWorker(){
                    @Override
                    protected Object doInBackground() throws Exception {
                        //do staff in other thread
                        labInfo.setText("Working...");

                        //check path game & mod
                        //import game source files to make a list of tokens for create list of SpriteType Object
                        //import mod *.dds files to create list of Sprite Object
                        //merge list of Sprite Object
                        //export to the mod folder

                        if(manager.isReadyToExport()){
                            manager.exportAll(new EventHandler() {
                                @Override
                                public void onSuccess(String message) {
                                    labInfo.setText(message);
                                    manager.clearData();
                                    btnGameDir.setText("[1.Input] Click to Set Game Directory");
                                    btnModDir.setText("[2.Output] Click to Set Mod Directory");
                                    modsPanel.removeAll();
                                    modsPanel.validate();
                                    modsPanel.repaint();
                                }

                                @Override
                                public void onError(String message) {
                                    labInfo.setText(message);
                                }
                            });

                        } else {
                            String message = "<html>"+manager.getMessage("")+"</html>";
                            labInfo.setText(message);
                        }

                        return null;
                    }
                }.execute();
            }
        });

        add(btnGameDir);
        add(btnModDir);
        add(modsCommandPanel);
        add(modsPanel);
        add(btnExport);
        add(labInfo);


        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addModToPanel(String name){

        JButton button = new JButton(name);
        button.setActionCommand(name);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isLookingToRemoveMod){
                    if(e.getSource() instanceof JButton){
                        String message;
                        message = manager.removeExtraMod(name);
                        labInfo.setText(message);
                        modsPanel.remove((Component) e.getSource());
                        modsPanel.validate();
                        modsPanel.repaint();
                    } else {
                        JOptionPane.showMessageDialog(MainFrame.this , "This is " + e.getActionCommand());
                    }
                }
            }
        });

        modsPanel.add(button);
        modsPanel.validate();
        isLookingToRemoveMod = false;

    }

}
