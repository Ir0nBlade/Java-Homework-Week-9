import java.util.HashMap;
import java.util.Scanner;

/*
10. Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name.
 */
public class Program_10 {

    public static void main(String[] args) {
        char result;

        System.out.println("London Underground Zone 1 stations: ");
        System.out.println("Marble Arch, Bond Street, Green Park, Piccadilly Circus, Leicester Square, Old Street, Knightbridge, Holland Park, Westminister, Waterloo");

        // HashMap object for zone
        HashMap<String, String> zone = new HashMap<String, String >();

        zone.put("Marble Arch", "Central line");
        zone.put("Bond Street", "Central line & Jubile line");
        zone.put("Green Park", "Victoria line & Picadilly line & Jubile line");
        zone.put("Piccadilly Circus", "Piccadilly line & Bakerloo line");
        zone.put("Leicester Square", "Northern line & Piccadilly line");
        zone.put("Old Street", "Northern line");
        zone.put("Knightbridge", "Piccadilly line");
        zone.put("Holland Park", "Central line");
        zone.put("Westminister", "Jubilee line, Circle line, District line");
        zone.put("Waterloo", "Bakerloo line & Jubilee line & Northern line");

        do
        {
            Scanner scanner = new Scanner(System.in); //
            System.out.print("Enter any station name : ");
            String stationName = scanner.nextLine();

            // for-Each loop to display station name and tube lines
            for (String str : zone.keySet())
            {
                if (stationName.equals(str))
                {
                    System.out.println("Tube Lines: " + zone.get(str));
                }
            }
            System.out.println(" ");
            System.out.print("Do you want to try again 'Y' or 'N': ");
            result = scanner.next().charAt(0);

        }while (result == 'Y' || result == 'y');

    }

}
