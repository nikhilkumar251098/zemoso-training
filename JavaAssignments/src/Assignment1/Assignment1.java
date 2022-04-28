package Assignment1;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Assignment1 {

    public static void main( String [] args) {
        Scanner sc= new Scanner(System.in);
        File file= new File("/home/nikhilk/zemoso-training");
        File [] files= file.listFiles();
        String regex= sc.nextLine();
        boolean matched= getPath(file, regex);
        if(!matched)
            System.out.println("file not found.");
    }

    public static boolean getPath(File file,String regex) {
        File[] listOfFiles = file.listFiles();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        int count =0;
        for (File name : listOfFiles){
            matcher = pattern.matcher(name.getName());
            if(name.isDirectory()){
                if(getPath(name, regex)){
                    count++;
                }
            }
            else {
                if(matcher.find() && matcher.group().equals(name.getName())) {
                    System.out.println("File found and its path is :" + name.getAbsolutePath());//prints absolute path
                    count++;
                }
            }
        }
        if(count>0)
            return true;
        return false;
    }
}
