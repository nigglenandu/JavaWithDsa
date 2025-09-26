package CodeSheet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args){
        // Create a HashMap with country as key and population as value
        HashMap<String, Integer> map = new HashMap<>();

        // 1. Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map); // {US=30, China=150, India=120}

        // If key already exists → value will be updated (overwritten)
        map.put("China", 180);
        System.out.println(map); // {US=30, China=180, India=120}

        // 2. Search for key
        if(map.containsKey("China")){
            System.out.println("key present");
        } else {
            System.out.println("not present");
        }

        // 3. Get value
        System.out.println(map.get("China")); // 180
        System.out.println(map.get("indo"));  // null (since key not present)

        // Example: iterating normal array
        int arr[] = {12, 15, 16};
        for(int val : arr){
            System.out.print(val + " "); // 12 15 16
        }
        System.out.println();

        // 4. Iteration over HashMap (Method 1: using entrySet)
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        // Method 2: using keySet
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        // 5. Remove a key-value pair
        map.remove("China");
        System.out.println(map); // {US=30, India=120}
    }
}
