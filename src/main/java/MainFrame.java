import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JButton btnGameDir,btnModDir,btnExport;
    private JLabel labInfo;
    private SpriteTypeManager manager;

    public MainFrame(){
        super("HOI4-QuickInsertGFX");

        manager = new SpriteTypeManager();

        setLayout(new GridLayout(4,1,10,10));

        btnGameDir = new JButton("[1.Input] Click to Set Game Directory");
        btnModDir = new JButton("[2.Output] Click to Set Mod Directory");
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
                    btnModDir.setText(modPath);
                }
            }
        });

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
                        String message;

                        if(manager.isReadyToExport()){
                            message = manager.exportAll();
                            manager.clearData();
                            btnGameDir.setText("[1.Input] Click to Set Game Directory");
                            btnModDir.setText("[2.Output] Click to Set Mod Directory");

                        } else {
                            message = "<html>"+manager.getMessage()+"</html>";
                        }

                        labInfo.setText(message);
                        return null;
                    }
                }.execute();
            }
        });

        add(btnGameDir);
        add(btnModDir);
        add(btnExport);
        add(labInfo);


        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
