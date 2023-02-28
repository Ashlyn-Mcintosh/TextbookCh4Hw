/**
 * @class: AverageGrades
 * @date: February 27, 2023
 * @version: 7.5
 * description: This program will prompt the user for student grades then calculate and display the average grade in the class.
 */

//make sure add program information including class name, author name, date, version, and description


// Got help from tutor Brighten J
import java.util.Scanner;
public class AverageGrades {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int average; //initialize the average variable and change the type to
        // double
        int count = 0;  //number of students?
        int sum = 0; //change type to double

        System.out.print("Enter a list of grades followed by a character:"); //User inputs the class grades
        input = scanner.nextInt(); //fix this line
        //read this site: https://www.javatpoint.com/post/java-scanner-hasnextdouble-method

        //here is the while loop you will need to use.

        while(input.hasNextDouble()){ //this means as long as the user inputs
            // a double value, this loop will continue to run.

            //this is the part to complete.


        }

        //your logic is correct but syntax is wrong. so use this logic and
        // put it in the while loop.
//        if (input >= 0) {
//            sum += input;
//            count++;
//        }
//
//        {
//            while (input >= 0) ;
//
//            double average = (double) sum / count;
            System.out.println("Average of the class is :" + average);

        }
    }
}