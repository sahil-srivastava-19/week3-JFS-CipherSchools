import java.util.ArrayList;

public class Test0 {

    public static void change(String m) {
        System.out.println(m.toUpperCase());
        
    }
    public static void main(String[] args){
        //forEach - this method helps us in accessing the elemnts of a given collection
        //and call a collection a common method on all elements

        //stream is wrapper around your data source do that we perform
        //bulk processing conviniently and fast

        ArrayList<String> lang = new ArrayList<String>();

        lang.add("Java");
        lang.add("Sharp");
        lang.add("Python");
        lang.add("PHP");

       // lang.forEach(System.out::println);

       lang.forEach(Test0::change);

       for(String t : lang){
        change(t);
       }
       change(lang.get(0));
       change(lang.get(1));
       change(lang.get(2));
       change(lang.get(3));
        //lang.forEach(class::method)
        //forEach method is calling 
    }
}