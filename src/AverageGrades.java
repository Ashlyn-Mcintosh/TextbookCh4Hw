/**
 * @class: AverageGrades
 * @date: February 27, 2023
 * @version: 7.5
 * description: This program will prompt the user for student grades then calculate and display the average grade in the class.
 */
// Got help from tutor Brighten J
import java.util.Scanner;
public class AverageGrades {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int average;
        int count = 0;
        int sum = 0;

        System.out.print("Enter a list of grades followed by a character:"); //User inputs the class grades
        input = scanner.nextInt();
        if (input >= 0) {
            sum += input;
            count++;
        }

        {
            while (input >= 0) ;

            double average = (double) sum / count;
            System.out.println("Average of the class is :" + average);

        }
    }
}