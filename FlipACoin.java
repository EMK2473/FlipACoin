package FlipACoin;

import java.util.Scanner;
import java.util.Random;

public class FlipACoin {
   
   public static String coinFlip(Random rand) {
    int result = rand.nextInt(2);
    if(result == 1){
        return "Heads";
    }
    else {
        return "Tails";
    }

   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Unique seed
      
      int numFlips = scnr.nextInt();
      for(int i = 0; i < numFlips; ++i){
        System.out.println(coinFlip(rand));
      }
      scnr.close();
   }
}
