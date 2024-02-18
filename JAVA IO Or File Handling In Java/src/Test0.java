import java.io.File;
import java.io.IOException;

public class Test0{
    public static void main(String[] args) {

        //Lab1 : Creating empty files

        File f= new File("E:\\VS-code-for-Java\\Week3_JFS_CipherSchools\\myTextFile.txt");

        //For creating file we will call createNewFile() method

        try{
            f.createNewFile();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("File created successfully!!");
    }
}