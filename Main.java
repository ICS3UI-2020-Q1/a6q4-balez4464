import java.util.Scanner;
/**
 * This program calculates the dot product of 2 vecotrs
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // created Scanner
    Scanner input = new Scanner(System.in);

    //asks user fo first vecotr
    System.out.println("Please enter the 3 values for the first vector");
    //creates constat for first array
    final int FIRST_VECTOR = 3;
    //creates first vector points
    int firstVector[] = new int[FIRST_VECTOR];
    //loop to write them out
    for(int i = 0; i < FIRST_VECTOR; i++){
      firstVector[i] = input.nextInt();
    }

    //asks user for second vecotr 
    System.out.println("Please enter the 3 values for the second vector");
    //creates constat for second array
    final int SECOND_VECTOR = 3;
    //creates second vector points
    int secondVector[] = new int[SECOND_VECTOR];
    //loop to write them out
    for(int i = 0; i < SECOND_VECTOR; i++){
      secondVector[i] = input.nextInt();
    }

    //creates a variable for the dot product
    int dotProduct = 0;
    
    //for loop to calculate dot product
    for (int i = 0; i < FIRST_VECTOR; i++){
      //adds to the product every time
      dotProduct = dotProduct + (firstVector[i] * secondVector[i]);
    }
    //prints out final dot product
    System.out.println("The dot product is " + dotProduct);
    
  }
}
