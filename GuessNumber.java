import java.util.Scanner;
class GuessNumber {
     public static void main(String args[]) {
      int a = (int)(Math.random() * 100 );
      System.out.println(a);
       
      Scanner inputFigure = new Scanner (System.in); 
   int number2 = inputFigure.nextInt ();  
do {
  int number = inputFigure.nextInt (); 
     if (number == a) {
         System.out.println("You feel lucky today!");
       }
       else if (number < a) {
          System.out.println(a + " > " + number); 
       }
       else if (number > a) {
             System.out.println(a + " < " + number);
           }
} while (number2 != a);
          
      }
    }

