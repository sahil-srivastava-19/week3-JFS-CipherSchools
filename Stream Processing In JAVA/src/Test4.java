//filter

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
       // List<Integer> numbers = Arrays.asList(12,-44,19,21,-55,77);
      //  List<Integer> result = numbers.stream().filter(e -> e<0).collect(Collectors.toList());
      //  System.out.println(result);


        List<Object> mylist = Arrays.asList(true,100,"hello",200,false,"welcome",300,true,false);

        List<Object> result = mylist.stream().filter(e -> e.getClass().getSimpleName().equals("Integer")).collect(Collectors.toList());

        System.out.println(result);

        mylist.forEach(m ->{
            System.out.println(m+ " -> "+m.getClass().getSimpleName() );
        });

        int totalIntegers = (int) mylist.stream().filter(e->e.getClass().getSimpleName().equals("Integer")).count();
        System.out.println("Total Integers: "+totalIntegers);

        List<String> colors =Arrays.asList("red", "green", "red", "orange","green", "red");

        List<String> result2 = colors.stream().map(e->e.toUpperCase()).distinct().collect(Collectors.toList());
        System.out.println(result2);
    }
}
