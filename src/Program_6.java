
// 6. Write a Java program to retrieve an element (at a specified index) from a given array list


import java.util.ArrayList;
import java.util.List;

public class Program_6 {

    public static void main(String[] args) {

        // Create a list and add some colours to the list
        List<String> colours = new ArrayList<>();

        colours.add("Red");
        colours.add("Blue");
        colours.add("White");
        colours.add("Black");
        colours.add("Purple");
        colours.add("Orange");
        colours.add("Yellow");
        colours.add("Grey");
        colours.add("Turquoise");
        colours.add("Maroon");

        // Print the list
        System.out.println(colours);

        // Retrive first element from the list
        String element = colours.get(0);
        System.out.println("\nFirst element: " + colours);

        //Retrive sixth element from the list
        element = colours.get(6);
        System.out.println("Sixth element: " + element);
    }
}
