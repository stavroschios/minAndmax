import java.util.Scanner;

public class maxandmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max, min;
        max = 0;
        min = 0;
        // enter number to read
        boolean first = true;


        while (true) {
            System.out.println("Enter Number ");
            boolean hasnextInt = scanner.hasNextInt();


            if (hasnextInt) {
                int number = scanner.nextInt();

                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }


                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine();


        }

        System.out.println("The max is " + max + " and the min is " + min);
    }
}
