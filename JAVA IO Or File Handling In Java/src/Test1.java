import java.io.File;

public class Test1 {
    //Checking if FIle exists and fetching file details

    public static void main(String[] args) {
        File f= new File("E:\\VS-code-for-Java\\Week3_JFS_CipherSchools\\myTextFile.txt");

        //using exists() to check if file exists or not

        if(f.exists()){
            System.out.println("Printing file deyails:- ");
            System.out.println("-------------------------------------");

            System.out.println("File Name: "+f.getName());
            System.out.println("File Size: "+f.length());
            System.out.println("File Path: "+f.getAbsolutePath());
            System.out.println("is file readable? : "+f.canRead());
            System.out.println("is file writable? : "+f.canRead());
        }
        //Creating direactory in Java
        File f1= new File("E:\\VS-code-for-Java\\Week3_JFS_CipherSchools");
        f1.mkdir();

    }
}
