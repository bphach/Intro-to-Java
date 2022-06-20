package Lesson05_If_Statements;

public class main {
    public static void main(String[] args) {
        //if statemnet = performs a block of code if it's condition evaluates to be true 
        //java reads from top to bottom so formatting must be correct 

        int age = 18;

        if(age==70) {

            System.out.println("You are older then slice bread!");
        }
        else if(age>=18){
            System.out.println("You are an adult!");

        }
        else if(age>=13){
            System.out.println("You are a kid!");
        }
        else {
            System.out.println("You are not an adult!");
        }


    }
}
