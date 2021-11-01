import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and  English marks
 * (marks is between 0 to 100 and if it is out of range print error message “Invalid  Input, Marks should between 0 to 100”)
 * and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35)
 * and also give them grade if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

public class Program_2 {

    public static void main(String[] args) {

        String result, grade = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        String stuname = scanner.next();

        System.out.print("Enter Student roll no: ");
        int rollno = scanner.nextInt();

        System.out.print("Enter marks for Maths: ");
        int maths = scanner.nextInt();
        while (maths > 100 || maths < 0) {
            System.out.println("Invalid Input, Maths marks should be between 0 to 100");
            maths = scanner.nextInt();
        }

        System.out.print("Enter marks for Science: ");
        int science = scanner.nextInt();
        while (science > 100 || science < 0) {
            System.out.println("Invalid Input, Science marks should be between 0 to 100");
            science = scanner.nextInt();
        }

        System.out.print("Enter marks for English: ");
        int english = scanner.nextInt();
        while (english > 100 || english < 0) {
            System.out.println("Invalid Input, Maths marks should be between 0 to 100");
            english = scanner.nextInt();
        }

        float total = maths + science + english;
        System.out.println("Total marks for Maths + Science + English is: " + total);

        float percentage = total / 300 * 100;
        System.out.println("Percentage of all three subjects is: " + percentage);

        if (percentage >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }
        System.out.println(result);

        if (percentage>=80){
            grade="A+";
            System.out.println("Grade"+grade);
        }else if (percentage>=60 && percentage<80){
            grade="A";
            System.out.println("Grade: "+ grade);
        } else if (percentage>=50 && percentage<60){
            grade = "B";
            System.out.println("Grade: "+ grade);
        }else if (percentage>=35 && percentage<50){
            grade = "C";
            System.out.println("Grade: "+grade);
        }else{
            grade = "";
        }

        System.out.println("|---------------------------------|");
        System.out.println("|         Mark Sheet              |");
        System.out.println("|---------------------------------|");
        System.out.println("| Name:       " + stuname + "\t\t\t\t|");
        System.out.println("| Roll No:    " + rollno + "                  |");
        System.out.println("|---------------------------------|");
        System.out.println("|  Subjects        Marks          |");
        System.out.println("|---------------------------------|");
        System.out.println("|  Maths           " + maths + " \t\t\t  |");
        System.out.println("|  Science         " + science + " \t\t\t  |");
        System.out.println("|  English         " + english + " \t\t\t  |");
        System.out.println("|---------------------------------|");
        System.out.println("|  Total:          " + total + "\t      |");
        System.out.println("|---------------------------------|");
        System.out.println("|  Percentage:     " + percentage + "\t\t      |");
        System.out.println("|  Result:         " + result + " \t\t  |");
        System.out.println("|  Grade:          " + grade + " \t\t\t  |");
        System.out.println("|---------------------------------|");

    }


}
