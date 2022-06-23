package Lesson07_Logical_Operators;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
    // logical operators = used to connect two or more expressions 
    //  && = (AND) both conditions must be true 
    //  || = (OR) either condtions must be true 
    //  ! = (NOT) reverses boolean value of condition

        //int temp = 12;

        //if(temp>90) {

            //System.out.println("It is hot outside");
      //  }
      //  else if(temp>=80 && temp<=90) {
            //System.out.println("It is warm outside");
      //  }
       // else {
            //System.out.println("It is freezing!");
       // }


        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");

        String response = scanner.next(); 

        if(response.equals("q") || !response.equals(null) {
            System.out.println("You quit the game");
        }
        else {
            System.out.println("You are still playing *pew pew* rascal!");
        }






    }
}
