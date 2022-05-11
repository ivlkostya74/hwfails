package Homwork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder log = new StringBuilder();
        File rot = new File("c://Game");
        if (rot.mkdir()) {
            log.append("\n Make DIR --   " );
            log.append(rot);
        }
                List<String> names = Arrays.asList("src", "res", "savegames", "temp");
        for (String file : names) {
            File dir = new File("c://Game", file);
            if (dir.mkdir()) {
                log.append("\n Make DIR --   " );
                log.append(dir);
                          }
        }
        List<String> src = Arrays.asList("maine", "test");
        for (String dir1 : src) {
            File dir = new File("c://Game/src", dir1);
            if (dir.mkdir()) {
                log.append("\n Make DIR --   " );
                log.append(dir);
            }
        }
        List<String> main = Arrays.asList("Main.java", "Utils.java");
        for (String m : names) {
              File myFile = new File("C://Game/src/maine",m);

            try {
                if (myFile.createNewFile())
                     log.append("\n creat fale   ");
                log.append(myFile);
            } catch (IOException ex)
            { System.out.println(ex.getMessage(
            ));
            }
        }
        List<String> res = Arrays.asList("drawables", "vectors", "icons");
        for (String dir3 : res) {
            File dir = new File("c://Game/res", dir3);
            if (dir.mkdir()) {
                log.append("\n creat fale  ");
                log.append(dir3);
            }
        }
        File myFile = new File("c://Game/temp","temp.txt");

        try {
            if (myFile.createNewFile())
                log.append("/n creat fale ");
                   } catch (IOException ex) {
            System.out.println(ex.getMessage() );
        }
        try (FileWriter writer = new FileWriter("c://Game/temp/temp.txt", false)) {
                       writer.write(String.valueOf(log));
//            writer.close();log
        } catch (IOException ex) {  System.out.println(ex.getMessage());
    }



        System.out.println(log);
    }
}

