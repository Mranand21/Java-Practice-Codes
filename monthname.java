import java.util.Scanner;

 

public class monthname {

      public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("Enter month's number: ");

            int monthNumber;

            monthNumber = in.nextInt();

            switch (monthNumber) {

            case 1:

                  System.out.println("January");

                  break;

            case 2:

                  System.out.println("February");

                  break;

            case 3:

                  System.out.println("March");

                  break;

            case 4:

                  System.out.println("April");

                  break;

            default:

                  System.out.println("Invalid month.");

                  break;

            }

      }

}