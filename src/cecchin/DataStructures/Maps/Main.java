package cecchin.DataStructures.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    private HashMap marks;

    public Main() {

        // create a HashMap
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        // key/value pairs put into map
        map.put("Nick", 17);
        map.put("Nick2", 18);
        map.put("Nick3", 19);

        // print value of key Nick
        System.out.println(map.get("Nick"));

        // print keys
        System.out.println("Key/Value Pairs:");
        // keySet returns a Set of the keys in the map
        for (String str : map.keySet()) {
            System.out.println("key: " + str + " value: " + map.get(str));
        }


        // Print out all key/value pairs in the HashMap in another way
        // Get a set of the entries
        Set set = map.entrySet();
        // get an iterator
        Iterator i = set.iterator();
        // Display elements
        System.out.println("Key/Value Pairs:");
        while (i.hasNext()) {
            // Map.Entry is a key-value pair
            // Only way to get a map entry is from the iterator
            Map.Entry me = (Map.Entry) i.next();
            System.out.println("Key: " + me.getKey() + " Value: " + me.getValue());


        }

        // clear the whole map
        map.clear();


    }

    public static void main(String[] args) {
        new Main();
    }
}
