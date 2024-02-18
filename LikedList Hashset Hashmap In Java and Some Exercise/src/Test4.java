import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public static void main(String[] args) {
        HashMap<String, String> states = new HashMap<String, String>();

        //put() method

        states.put("tx", "Texas");
        states.put("al", "Alabama");
        states.put("ar", "Arizona");
        states.put("ca", "California");

        System.out.println(states);

        for(Map.Entry<String, String> e : states.entrySet()){
            System.out.println(e.getKey()+" -------- "+e.getValue());
        }
    }
}
