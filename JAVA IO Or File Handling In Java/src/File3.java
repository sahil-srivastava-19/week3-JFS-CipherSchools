import java.io.File;

public class File3 {
    public static void main(String[] args) {
        //listing files
        File f = new File("E:\\VS-code-for-Java\\Week3_JFS_CipherSchools\\deletingfilesdemo");

        String[] files = f.list();

        for(String file : files){
            System.out.println(file);
        }
        File[] files_arr = f.listFiles();
        for(File ff : files_arr){
            ff.delete();
        }
    }
}
