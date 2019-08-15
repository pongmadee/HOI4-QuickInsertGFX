[![Build Status](https://travis-ci.org/pongmadee/HOI4-QuickInsertGFX.svg?branch=master)](https://travis-ci.org/pongmadee/HOI4-QuickInsertGFX)
![GitHub release](https://img.shields.io/github/release/pongmadee/HOI4-QuickInsertGFX.svg)
![GitHub top language](https://img.shields.io/github/languages/top/pongmadee/HOI4-QuickInsertGFX.svg)
![GitHub](https://img.shields.io/github/license/pongmadee/HOI4-QuickInsertGFX.svg)

# HOI4-QuickInsertGFX
This program was created to work with [FocusTreeAndEventManager](https://github.com/pongmadee/FocusTreeAndEventManager), help to add mod's images file information (event pictures & goal/focus images) to GFX files in the mod's interface directory. However, you can apply it to your mod without FocusTreeAndEventManager tool.

## Requirements
- Java 8+

## [Download the lastest release](https://github.com/pongmadee/HOI4-QuickInsertGFX/releases)

## How to run
#### 1. Run with terminal(Mac/Linux) , command prompt(Windows) e.g.:
 ```
 java -jar HOI4-QuickInsertGFX-1.0.0-beta1.jar
 ```
#### 2. Run with Jar Launcher (Mac) 
```
 Jar Launcher is the program in Mac OS X that launches Java JAR files into the Aqua/Java runtime environment when the JAR file is double clicked.
```
#### 3. Run with Java(TM) Platform SE binary (Windows) launches a JAR files when the JAR file is double clicked.
```
 3.1. Right-click the Jar file and select Open with from the context menu, then click Choose another app.
 3.2. Check the box that says "Always use this app to open .jar files".
 3.3. Click More app, then select look for another app on this PC at the bottom.
 3.4. Select javaw.exe in your JRE e.g.: 'C:\Program Files\Java\jre1.8.0_221\bin\javaw.exe', then click Open.
```

## How to use
| --- | Description |
| --- | --- |
| <img src="images/screenshot01.png"> | 1. Click to set game directory <br /> e.g. "C:\steamapps\common\Hearts of Iron IV" <br /><br />  2. Click to set mod directory <br /> e.g. "C:\steamapps\common\Hearts of Iron IV\mod\mod_name" <br /><br /> 3. Click Export to create new *.gfx files in mod's interface directory. <br /> |


## How does it work
<img src="images/HOI4-QuickInsertGFX-Concept.png">


## Used libraries
- ANTLR4 : A powerful parser generator. 

## License
This project is licensed under the terms of the MIT license.
