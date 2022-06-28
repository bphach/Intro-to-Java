package Lesson12_2D_Arrays;

public class main {
    public static void main(String[] args) {
      
        // 2d arrays = an arrays of arrays. Think of a 2d array as having rows and columns 
        
        String[][] cars = new String[3][3];

        //another way to write is by assinging all of the values right away to this 2d array 
        
        // String[][] cars = {"Camaro","corvette","Silverado"},
        //                   {"mustang","ranger", "F-150" },
        //                   {"Ferrari", "Civic", "Tesla"}}; 
        
        // This an example of how to do it another way

        cars[0][0] = "Camaro";
        cars[0][1] = "corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "mustang";
        cars[1][1] = "ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Civic";
        cars[2][2] = "Tesla";

        for (int i=0; i<cars.length; i++){ //outer for loop is in charge of the rows. This is the nested for loop
            System.out.println();
            for(int j=0; j<cars[i].length; j++) { //inner for loop is in charge of the columns 
            System.out.println(cars[i][j]+ " ");
            }
        }


    }
}
