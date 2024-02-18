import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args){
        //HashSet

        HashSet myset = new HashSet();

        myset.add("green");
        myset.add("red");
        myset.add("orange");
        myset.add("red");
        myset.add("orange");

        System.out.println(myset);

        LinkedHashSet lhs = new LinkedHashSet();

        //maintains the insertion order

        lhs.add("green");
        lhs.add("red");
        lhs.add("orange");
        lhs.add("red");
        lhs.add("orange");

        System.out.println(lhs);


        TreeSet ts = new TreeSet();

        //treeset does not allow nulls
        //sorts the data in ascending order

        ts.add("green");
        ts.add("red");
        ts.add("orange");
        ts.add("red");
        ts.add("orange");
        //ts.add();

        System.out.println(ts);


    }
}
