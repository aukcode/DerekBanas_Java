package Lessons;

import javax.swing.JFrame;
import java.io.*;
/**
 * Created by auk on 11.05.17.
 */
public class _31_Files extends JFrame {

    static String filepath,parentDirectory;

    static File randomDir,randomFile,randomFile2;

    public static void main(String[] args) {

        randomDir = new File("/home/auk/IdeaProjects/banas/filefolder");

        randomDir.mkdir();

        randomFile = new File("random.txt");

        randomFile2 = new File("/home/auk/IdeaProjects/banas/filefolder/random.txt");

        try{

            randomFile.createNewFile();

            randomFile2.createNewFile();

            filepath = randomFile.getCanonicalPath();

        }catch (IOException e){
            e.printStackTrace();
        }


        if(randomFile.exists()){
            System.out.println("File exists");

            System.out.println("File Readable " + randomFile.canRead());

            System.out.println("File Writable " + randomFile.canWrite());

            System.out.println("File Located " + filepath);

            System.out.println("File Name " + randomFile.getName());

            System.out.println("File Executable " + randomFile.canExecute());

            String[] filesInDir = randomDir.list();
            System.out.println("Files in Directory\n");
            for(String fileName : filesInDir){
                System.out.println(fileName + "\n");
            }


            //isFile()
            //isHidden()
            //list()
            //lastModified()
            //fileSize() - in bytes

            randomFile.renameTo(new File("/home/auk/IdeaProjects/banas/filefolder/randomChange.txt"));
        }



    }
}
