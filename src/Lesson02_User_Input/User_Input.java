package Lesson02_User_Input;

import java.util.Scanner;//scanner class is found in this package

public class User_Input {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);//this is an scanner object 

        System.out.println("What is your name?");
        String name = scanner.nextLine();
       
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();//Without this, the scanner will read the new line character and think it is at the end
       
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello  " + name);
       
        System.out.println("You are "+age+" years old");
        
        System.out.println("You enjoy eating "+food);
    }

    }
   