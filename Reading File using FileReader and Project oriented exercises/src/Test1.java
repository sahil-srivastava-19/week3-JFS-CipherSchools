import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("E:\\VS-code-for-Java\\Week3_JFS_CipherSchools\\pokemon.csv");

        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        ArrayList<String> pokemons = new ArrayList<String>();
        while((line=br.readLine())!=null){
           // System.out.println(line);
            pokemons.add(line);
        }

        Scanner sc = new Scanner(System.in);
        String type = sc.next();

        for(String pok: pokemons){
            String ptype = pok.split(",")[1];
            if(ptype.equals(type)){
                System.out.println(pok);
            }
        }
    }
}
