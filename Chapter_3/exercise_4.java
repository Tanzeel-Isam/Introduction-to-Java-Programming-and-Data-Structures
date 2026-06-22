/*
 * Exercise 3.4: Random Month Generator
 *
 * Write a program that randomly generates an integer between 1 and 12 and displays the English month name (e.g. 1 for January, 2 for February...). The class name must be Exercise03_04.

 * Expected Output:
 *   [Month]
 */

public class Exercise03_04 {
    public static void main(String[] args) {
        // Generate random number 1 to 12, print month
         int number = (int)(Math.random()*12)+1;
        
        if (number==1)
            System.out.println("January");
        else if (number==2)
           System.out.println("February"); 
        else if (number==3)
           System.out.println("march"); 
        else if (number==4)
           System.out.println("april"); 
        else if (number==5)
           System.out.println("may"); 
        else if (number==6)
           System.out.println("june"); 
        else if (number==7)
           System.out.println("july"); 
        else if (number==8)
           System.out.println("august"); 
        else if (number==9)
           System.out.println("september"); 
        else if (number==10)
           System.out.println("october"); 
        else if (number==11)
           System.out.println("november"); 
        else if (number==12)
           System.out.println("december"); 
       
        
    }
    
}

        
    
