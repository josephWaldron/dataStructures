package Lab2;

import java.util.Scanner; 

public class TowerOfHanoi {
  /** Main method */
  public static int numbOfMoves = 0;
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of disks: ");
    int n = input.nextInt();

    // Find the solution recursively
    long begin, end, time;
    begin = System.nanoTime();
    System.out.println("The moves are:");
    moveDisks(n, 'A', 'B', 'C');

    end = System.nanoTime();
    time = end - begin;
    System.out.println("Number of moves: " + numbOfMoves);
    System.out.println("Time to complete: " + time + " for " + n + " disks");
  }

  /** The method for finding the solution to move n disks
      from fromTower to toTower with auxTower */
  public static void moveDisks(int n, char fromTower,
      char toTower, char auxTower) {
    if (n == 1){ // Stopping condition
      System.out.println("Move disk " + n + " from " +
        fromTower + " to " + toTower);
      numbOfMoves++;
    }
    else {
      moveDisks(n - 1, fromTower, auxTower, toTower);
      System.out.println("Move disk " + n + " from " +
        fromTower + " to " + toTower);
      moveDisks(n - 1, auxTower, toTower, fromTower);
      numbOfMoves++;
    }
  }
}