
// 7. Write a Java program to test an array list is empty or not. Define array list with underground tube names


import java.util.ArrayList;

public class Program_7 {

    public static void main(String[] args) {

        // ArrayList of String type
        ArrayList<String> list = new ArrayList<>();

        // Checking whether the list is empty
        System.out.println("Is ArrayList Empty: " + list.isEmpty());

        // Adding Integer elements
        list.add("Victoria");
        list.add("Alperton");
        list.add("Marble Arch");
        list.add("Oxford Circus");
        list.add("Green Park");
        list.add("Waterloo");

        // Checking again for the list is empty or not
        System.out.println("Is Arraylist Empty: " + list.isEmpty());

        // Displaying elements of the list
        for (String str : list) {
            System.out.println(str);
        }
    }

}
