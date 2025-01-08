package CodeSheet;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //size
        System.out.println("size of set is" + set.size());
        // print all elements
        System.out.println(set);
        //Search - contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contain");
        }

        // delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.print("doesnot contain 1");
        }

        //Iterator
        Iterator it = set.iterator();
        //hasNext Next
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}