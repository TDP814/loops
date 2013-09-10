import java.util.Scanner;

class EX {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
   int x, i = 0;
   double term = 1.0, sum = 0.0;
   System.out.println("Enter x: ");
   x = reader.nextInt();
   
   while (term > 1.0E-12) {
      i++;
     if (i == 0) {
       term++;
     } else {
       term = (Math.pow(x, i)) / (factorial(i));
     }
     sum = sum + term;
     System.out.println("n:" + (i) + "\t\t" + "term: " + term + "\tsum: " + sum);
   }

   double real = Math.exp(x);

   System.out.println();
   System.out.println("my\te^x: " + sum);
   System.out.println("real\te^x: " + real);
  }
 
  public static int factorial (int num) {
    int sum = 1;
    for (int i = num; i > 0; i--) {
      sum = sum * i;
    }
    return sum;
  }
 
}

