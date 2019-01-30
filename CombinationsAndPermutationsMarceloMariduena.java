// Author: github.com/MarceloMariduena

import java.math.BigInteger;
import java.util.Scanner;

public class CombinationsAndPermutationsMarceloMariduena {
 public static void main(String[] args) {
  // Create a scanner object to take user inputs
  Scanner input = new Scanner(System.in);
   
  // Prompt user for number of students
  System.out.println("Enter total number of students (n) and the amount of students selected (r) separated by a space: ");
  String theInput = input.nextLine();
   
  // Split the line by spaces and assign the result to an array
  String[] splits = theInput.split(" ");
   
  // Parse through the first two inputs separated by spaces 
  int n = Integer.parseInt(splits[0]);
  int r = Integer.parseInt(splits[1]);
  
  // Call the combinations method
  System.out.println("----- Combinations -----");
  System.out.println("C(" + n + "," + r + ") = " + combinations(n,r));
  System.out.println(combinations(n,r) + " groups of " + r + " students can be created from a total of " + n + " students.");
  System.out.println();
  
  // Call the permutations method
  System.out.println("----- Permutations -----");
  System.out.println("P(" + n + "," + r + ") = " + permutations(n,r));
  System.out.println(permutations(n,r) + " permutations of " + r + " students can be created from a total of " + n + " students.");
    
  input.close();
 }


 public static BigInteger factorial(int n) {
   // permutations: n!
  BigInteger bigFact = BigInteger.valueOf(1);
  for (int i = 1; i <= n; i++) {
   bigFact = bigFact.multiply(BigInteger.valueOf(i));
  }
  return bigFact;
 }

 public static BigInteger combinations(int n, int r) {
  // combinations: n!/ r!(n-r)!
  return factorial(n).divide(factorial(r).multiply(factorial(n-r)));
 }

 public static BigInteger permutations(int n, int r) {
  // permutations: n!/ (n-r)!
  return factorial(n).divide(factorial(n-r));
 }
}

