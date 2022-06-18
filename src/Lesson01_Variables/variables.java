package Lesson01_Variables;

public class variables {

    public static void main(String[] args){
     
     int x = 123; //integers 
     double y = 3.14; //allow you to store decimals 
     boolean z = true; //can only be true or false 
     char symbol = '@'; // characters must be place in single quotes
     String name = "Bryan"; // Start with an capital letter since it is an reference data type 
     
     System.out.println();
     
    String a = "pizza";
    String b = "fries"; 
    String temp=null; // allows variable a and b to be switch as it is a temporay value 

    temp = a;// pizza is now fill in temp
    a=b; // fries are now in variable a
    b=temp; // pizza is now fill in variable b

    System.out.println("a: "+a);
    System.out.println("b: "+b);


    }
   }