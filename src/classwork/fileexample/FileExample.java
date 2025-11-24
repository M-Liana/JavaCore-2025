package classwork.fileexample;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import static javax.print.attribute.standard.MediaSizeName.C;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\IdeaProjects\\JavaCore-2025\\src\\classwork\\fileexample\\");
        System.out.println(file.exists());

        File file1= new File(file,"poxosFolder\\petrosFolder");
        Date date = new Date();
        System.out.println(file1.mkdirs());
        System.out.println(date);
        System.out.println(file.getUsableSpace());
        System.out.println(file.getFreeSpace());
//        System.out.println(File.separator);
//        System.out.println(file.isFile());
//        if (file.isDirectory()){
//            String[] list = file.list();
//            for (String s : list) {
//                System.out.println(s);
//
//            }
//        }
        
        
//        if (!file.exists()){
//
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                System.out.println("cannot creat new file");
//            }
//        }
//        System.out.println(file.lastModified());
//        Date date = new Date(file.lastModified());
//        System.out.println(date);
//        System.out.println(file.isFile());
   }
}
