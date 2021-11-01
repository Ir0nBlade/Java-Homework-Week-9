/* 4. Write a Java program to create a new array list,
add some colours (string) and printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Program_4 {

    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>();

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

        for (String data : colours) {
            System.out.println(data);
        }

    }
}
