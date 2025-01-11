package Assignment.FlowOfProgram;

import java.util.HashMap;

public class HashmapQue4 {
    public static String getStart(HashMap<String, String> tick){
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tick.keySet()){
            revMap.put(tick.get(key), key);
            }
        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennau", "bengaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");

        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.println(start);
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
