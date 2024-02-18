
import java.util.LinkedList;
import java.util.Iterator;

public class Test0 {
    public static void main(String[] args){
        LinkedList myll = new LinkedList();

       // myll.add("Ironman");
        //myll.add("Thor");
        //myll.add("Loki");
        //myll.add("Hawkeye");

        myll.push("Ironman");
        myll.push("Thor");
        myll.push("Loki");
        myll.push("Hawkeye");

        //System.out.println(myll.get(1));

        myll.addLast("Gamora");

        myll.addFirst("AntMan");

        myll.add(2,"Natasha");

        Iterator it = myll.iterator();
        
        while(it.hasNext()){
            //it.remove();
            System.out.println(it.next());
        }

        System.out.println("===========================");
        System.out.println("Who is at the top? "+myll.peek());
        System.out.println("Hey first one got out "+myll.poll());

        System.out.println("Who is there at the end? "+myll.pop());
        System.out.println("=============================");

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
