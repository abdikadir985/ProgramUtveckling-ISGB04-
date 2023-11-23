/*
 * 
 */
package mvcpackage;

import java.util.Random;

public class lottorad {
	/*
	 * 
	 */
   
   
    public lottorad(){
	   
	   
   }

    public static void shuffleAndPrint(StringBuilder result) {
        int[] lotto = new int[35];
        int i, tal, antal;
        Random rand = new Random();

        for (i = 0; i < 35; i++) {
            lotto[i] = 0;
        }

        for (antal = 0; antal < 7; antal++) {
            tal = rand.nextInt(35) + 1;

            while (lotto[tal - 1] == 1) {
                tal = rand.nextInt(35) + 1;
            }

            lotto[tal - 1] = 1;
            result.append(tal).append(" ");
        }

        result.append("\n");

        for (i = 0; i < 35; i++) {
            if (lotto[i] == 1) {
                result.append(i + 1).append(" ");
            }
        }

        result.append("\n");
        
        
        for (i = 0; i < 35; i++) {
            lotto[i] = 0;
        }

        for (antal = 0; antal < 7; antal++) {
            tal = rand.nextInt(35) + 1;

            while (lotto[tal - 1] == 1) {
                tal = rand.nextInt(35) + 1;
            }

            lotto[tal - 1] = 1;
            result.append(tal).append(" ");
        }

        result.append("\n");

        for (i = 0; i < 35; i++) {
            if (lotto[i] == 1) {
                result.append(i + 1).append(" ");
            }
        }

        result.append("\n");
        
        
    } 
    public static void main(String[] args) {
        // Example usage in the main method
        StringBuilder lottoNumbers = new StringBuilder();
        shuffleAndPrint(lottoNumbers);
        System.out.println("Shuffled Lotto Numbers: " + lottoNumbers.toString());
    }
}



















/*
package mvcpackage;
import java.util.Random;

public class lottorad{
 public static void main(String [] args) {
     int[] lotto = new int[35];
     int i, tal, antal;
     Random rand = new Random();
   */  

//for loopen iterarar medans rand slumpar random tal.  
//forsta tva raderna i konsolen kors har.
/*
     for (i = 0; i < 35; i++) {
         lotto[i] = 0;
     }
     
     for (antal = 0; antal < 7; antal++) {
         tal = rand.nextInt(35) + 1;
         
         while (lotto[tal - 1] == 1) {
             tal = rand.nextInt(35) + 1;
         }
         
         lotto[tal - 1] = 1;
         System.out.print(tal + " ");
     }
     
     
     System.out.println();
     
    
     for (i = 0; i < 35; i++) {
         if (lotto[i] == 1) {
             System.out.print(i + 1 + " ");
         }
     }
     
     System.out.println();
  */   
//trefje och fjarde raderna i konsolen kors har
   /*  
     for (i = 0; i < 35; i++) {
         lotto[i] = 0;
     }
     
     
     for (antal = 0; antal < 7; antal++) {
         tal = rand.nextInt(35) + 1;
         
         while (lotto[tal - 1] == 1) {
             tal = rand.nextInt(35) + 1;
         }
         
         lotto[tal - 1] = 1;
         System.out.print(tal + " ");
     }
     
     
     System.out.println();
     
     for (i = 0; i < 35; i++) {
         if (lotto[i] == 1) {
             System.out.print(i + 1 + " ");
         }
     }
     
     System.out.println();
  */   
//femte och sexte raderna i konsolen kors har  
/*
     for (i = 0; i < 35; i++) {
         lotto[i] = 0;
     }
     
     
     for (antal = 0; antal < 7; antal++) {
         tal = rand.nextInt(35) + 1;
         
         while (lotto[tal - 1] == 1) {
             tal = rand.nextInt(35) + 1;
         }
         
         lotto[tal - 1] = 1;
         System.out.print(tal + " ");
     }
     
     
     System.out.println();
     
     for (i = 0; i < 35; i++) {
         if (lotto[i] == 1) {
             System.out.print(i + 1 + " ");
         }
     }
     
     System.out.println();
     
     
     
     
 }


}
*/
 
 

	
