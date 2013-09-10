import java.util.Scanner;

class Exercise5 {
 
  public static void main(String[] args) {
    Scanner reader = new Scanner (System.in);
    int number;
    System.out.println("Enter a number: ");
    number = reader.nextInt();
    
    while (number != 1) {
      if ( number % 2 == 1) {
        System.out.println(number + "\t(odd, next value is " + number + "*3+1)");
        number = 3 * number + 1;
      } else {
        System.out.println(number + "\t(even, next value is " + number + "/2)");
        number = number / 2;
      }
    }

    System.out.println("1\t(stop calculation)");
  }
 
}