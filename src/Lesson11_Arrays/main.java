package Lesson11_Arrays;

public class main {
    public static void main(String[] args) {
        
        // array = used to store multiple values in a single variable
        // To make an array, next to the data type. Add a set of straight brackets next to it. Surrond the values with a set of curly braces
        
        String[] cars = {"Mustang","Corvette","Camaro","M3"};

        cars[0] = "Camaro";

        System.out.println(cars[0]);

        //With arrays, when you assign values, they have to be the same data type and consistent. Example you can't add "123". In this case you can only add strings and not integers 
    
        String[] cars = new String[3];//assigning a total of 3 strings to the array of cars 
    
        cars[0] = "Camaro";
        cars[1] = "Mustang";
        cars[2] = "Corvette";

        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);// This will display all of the elements in 'Cars'

        }
    }
}
