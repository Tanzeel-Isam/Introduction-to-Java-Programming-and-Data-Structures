/*
 * Exercise 3.5: Find Future Dates
 *
 * Prompt user for today's day of week (0 for Sun, 1 for Mon, ..., 6 for Sat) and elapsed days, then print today's day and the future day of the week. The class name must be Exercise03_05.

 * Sample Input:
 *   1 3

 * Expected Output:
 *   Today is Monday and the future day is Thursday
 */
import java.util.Scanner;

public class Exercise03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Write code here
        System.out.println("0 for Sun, 1 for Mon, ..., 6 for Sat");
          int today = input.nextInt();
          System.out.println("Enter the number of elapsed days:");
          int elapsedDays = input.nextInt();
          futureDay = (today +elapsedDays  )  %7;
          String todayName = " ";
        String futureName = " ";
          switch (today){
              case 0 : todayName = "sunday";
              break;
               case 1 : todayName = "Monday " ;      
              break; 
               case 2 : todayName = "Tuesday ";
              break;
               case 3: todayName = "Wednesday ";
              break;
               case 4: todayName = "Thursday ";
              break;
               case 5 : todayName = "Friday ";
              break;
               case 6 : todayName = "Saturday ";
              break;
          }
              
    switch (futureDay){
        case 0 :futureName = "sunday";
              break;
               case 1 : futureName = "Monday " ;      
              break; 
               case 2 : futureName = "Tuesday ";
              break;
               case 3:futureName = "Wednesday ";
              break;
               case 4: futureName = "Thursday ";
              break;
               case 5 :futureName = "Friday ";
              break;
               case 6 :futureName = "Saturday ";
              break;
    }
    System.out.println("Today is " + todayName + " and the future day is " + futureName);
        
    }
}