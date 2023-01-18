package ApnaCollegeDSA;

import java.util.*;

public class Video_35_HashMap {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();

        //insertion
        map.put("india",120);
        map.put("us",30);
        map.put("china",150);
        System.out.println(map);
        map.put("china",180);
        System.out.println(map);

        //search
        System.out.println(map.containsKey("china"));
        System.out.println(map.containsValue(150));
        System.out.println(map.containsValue(180));

        //key ke corresponding value prapt krna
        System.out.println(map.get("china"));


        //using iteration in HashMap
        for ( Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }

        for ( Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" ");
        }
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        //delete
        System.out.println(map);
        map.remove("china");
        System.out.println(map);


    }
}
