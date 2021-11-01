/*
9. Create a HashMap object called people that will store String keys and Integer values:
And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;

public class Program_9 {

    public static void main(String[] args) {

        // HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Players name & runs)
        people.put("Kohli", 9);
        people.put("Rahul", 18);
        people.put("Rohit", 14);
        people.put("Hardik", 23);
        people.put("Jadeja", 26);

        for (String i : people.keySet()) {
            System.out.println("Key: " + i + " value: " + people.get(i));
        }
    }
}
