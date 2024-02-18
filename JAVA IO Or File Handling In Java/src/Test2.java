import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) throws IOException {
        //writing data in the file
        FileWriter fw = new FileWriter("E:\\VS-code-for-Java\\Week3_JFS_CipherSchools\\myTextFile.txt",true);

        //.write() method to write data in the file
        fw.write("I am the Earth\n");
        fw.write("I am the Forest Green\n");
        fw.write("I am the Four winds Blowing\n");
        fw.write("I am the Universe");

        fw.flush();
        //flush clears the data in the buffer memory and writes in the file

        fw.close();
        //closing the connection with file

        System.out.println("File prepared successfully");

    }
}
