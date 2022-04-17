package Study.streamIO.task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static StringBuilder sb = new StringBuilder( );

    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("D:/Users/GitTest/Study/Block1/streamIO/Games/temp/temp.txt")) {
            File gamesSrc = new File("D:/Users/GitTest/Study/Block1/streamIO/Games/src");
            getStatus(gamesSrc, gamesSrc.mkdir( ));
            File gamesRes = new File("D:/Users/GitTest/Study/Block1/streamIO/Games/res");
            getStatus(gamesRes, gamesRes.mkdir( ));
            File gamesSavegames = new File("D:/Users/GitTest/Study/Block1/streamIO/Games/savegames");
            getStatus(gamesSavegames, gamesSavegames.mkdir( ));
            File gamesTemp = new File("D:/Users/GitTest/Study/Block1/streamIO/Games/temp");
            getStatus(gamesTemp, gamesTemp.mkdir( ));
            File gamesSrcMain = new File("D:/Users/GitTest/Study/Block1/streamIO/Games/src/main");
            getStatus(gamesSrcMain, gamesSrcMain.mkdir( ));
            File gamesSrcTest = new File("D:/Users/GitTest/Study/Block1/streamIO/Games/src/test");
            getStatus(gamesSrcTest, gamesSrcTest.mkdir( ));
            File gamesSrcMainMain = new File(gamesSrcMain, "Main.java");
            getStatus(gamesSrcMainMain, gamesSrcMainMain.createNewFile( ));
            File gamesSrcMainUtils = new File(gamesSrcMain, "Utils.java");
            getStatus(gamesSrcMainUtils, gamesSrcMainUtils.createNewFile( ));
            File gamesResDrawables = new File("D:/Users/GitTest/Study/Block1/streamIO/Games/res/drawables");
            getStatus(gamesResDrawables, gamesResDrawables.mkdir( ));
            File gamesResVectors = new File("D:/Users/GitTest/Study/Block1/streamIO/Games/res/vectors");
            getStatus(gamesResVectors, gamesResVectors.mkdir( ));
            File gamesResIcons = new File("D:/Users/GitTest/Study/Block1/streamIO/Games/res/icons");
            getStatus(gamesResIcons, gamesResIcons.mkdir( ));
            File gamesTempTemp = new File(gamesTemp, "temp.txt");
            getStatus(gamesTempTemp, gamesTempTemp.createNewFile( ));
            fw.write(sb.toString( ));


        } catch (IOException e) {
            e.printStackTrace( );
        }
    }

    public static void getStatus(File file, Boolean b) {
        if (file.isDirectory( ) && b) {
            String s = "Каталог по пути " + file.getAbsolutePath( ) + " создан успешно";
            sb.append(s);
            sb.append("\n");
        } else if (file.isDirectory( ) && !b) {
            String s = "Каталог по пути " + file.getAbsolutePath( ) + " не создан";
            sb.append(s);
            sb.append("\n");
        } else if (file.isFile( ) && b) {
            String s = "Файл по пути " + file.getAbsolutePath( ) + " создан успешно";
            sb.append(s);
            sb.append("\n");
        } else {
            String s = "Файл по пути " + file.getAbsolutePath( ) + " не создан";
            sb.append(s);
            sb.append("\n");

        }

    }
}
