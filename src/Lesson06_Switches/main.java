package Lesson06_Switches;

public class main {
    public static void main(String[] args) {


        //Switches  = A statement that allows a variable to be tested for equality against a list of values
        //Unlike if-then statements, switch statement can have a number of possible execution paths, work with byte,short,char,int,and enumerated types
        
        //break; are needed or else the computer will follow the subset of codes that come after our matching case

        String day = "Sushi";

        switch(day) {
        case "Sunday": System.out.println("It is Sunday!");
        break;
        case "Monday": System.out.println("It is Monday!");
        break;
        case "Tuesday": System.out.println("It is Tuesday!");
        break;
        case "Wednesday": System.out.println("It is Wednesday!");
        break;
        case "Thursday": System.out.println("It is Thursday!");
        break;
        case "Friday": System.out.println("It is Friday!");
        break;
        case "Saturday": System.out.println("It is Saturday!");
        break;
        default: System.out.println("That is not a day you silly goose!");
        }



    }
}
