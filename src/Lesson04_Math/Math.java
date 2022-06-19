package Lesson04_Math;

import java.util.Random;

public class Math {

    public static void main(String[] args){

       
      Random random = new Random();

      int x = random.nextInt(6)+1;//I'm limiting this to the numbers on a dice. Since computers starts with 0, if you want 6 you must add 1
      double y = random.nextDouble();
      boolean z = random.nextBoolean();

      System.out.println(x);

      //These will randomize for you 

    }

    }
   