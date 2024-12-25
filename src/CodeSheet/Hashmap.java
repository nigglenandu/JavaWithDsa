package javaclass;
import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        //country(key), populations(value)
        HashMap<String, Integer> map = new HashMap<>();

        // insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        //search
        if(map.containsKey("China")){
            System.out.println("key present");
        }
        else {
            System.out.println("not present");
        }

        // get value
        System.out.println(map.get("China"));
        System.out.println(map.get("indo"));

        int arr[] = {12, 15,16};
        for(int val : arr){
            System.out.print(val + " ");
        }

        // iteration
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        // or
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        map.remove("China");
        System.out.println(map);
    }
}
