import java.util.Scanner;
class Calculator {
     public static void main(String args[]) {
        Scanner inputFigure = new Scanner (System.in);

          //String calculateOp //Calculate Operation
           int firstN = inputFigure.nextInt ();
            int secondN = inputFigure.nextInt ();
        int calculateOp = inputFigure.nextInt ();

        if (calculateOp == 1) { // "+"
        	System.out.println(firstN + secondN);
        }
        	else if (calculateOp == 2) { // "-"
        	System.out.println(firstN - secondN);
        }
             else if (calculateOp == 3) { // "*"
        	System.out.println(firstN * secondN);
        }
             else if (calculateOp == 4) { // "/"
        	System.out.println(firstN / secondN);
        }
             else if (calculateOp == 5) { // "^"
             	System.out.println("Введите степень");
             	 int degree = inputFigure.nextInt ();
             	for (int i = 2; i <= degree; i++) {
        	int sum = (firstN * firstN);
        }
        System.out.println(sum);
    }
}
        }