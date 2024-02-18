import java.io.BufferedReader;
import java.io.FileReader;

public class Test0{
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("E:\\VS-code-for-Java\\Week3_JFS_CipherSchools\\myTextFile.txt");

        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        //System.out.println(line);

        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        fr.close();
    }
}