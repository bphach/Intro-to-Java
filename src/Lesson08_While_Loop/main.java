package Lesson08_While_Loop;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       

        //while loop = executes a block of code as long as it's condition remains true. It's like an if statement but it will continue that block of code continuously
        //do loop = will always perform the block of code at least once and then we check the condition after


        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.print("Enter your name");
            name = scanner.nextLine();
        }
        System.out.println("Hello"+name);
   
    }
        

}
