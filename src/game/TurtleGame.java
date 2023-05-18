package game;

import java.util.Scanner;

public class TurtleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gridSize = 5; // Size of the grid (5x5)
        int turtleX = 0; // Turtle's X-coordinate
        int turtleY = 0; // Turtle's Y-coordinate

        System.out.println("Welcome to the Turtle Game!");
        System.out.println("Use 'WASD' keys to move the turtle.");
        System.out.println("Reach the bottom-right corner ("
                + (gridSize - 1) + "," + (gridSize - 1) + ") to win!");

        while (true) {
            printGrid(gridSize, turtleX, turtleY);

            System.out.print("Enter your move (W/A/S/D): ");
            String input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "W":
                    if (turtleY > 0) {
                        turtleY--;
                    }
                    break;
                case "A":
                    if (turtleX > 0) {
                        turtleX--;
                    }
                    break;
                case "S":
                    if (turtleY < gridSize - 1) {
                        turtleY++;
                    }
                    break;
                case "D":
                    if (turtleX < gridSize - 1) {
                        turtleX++;
                    }
                    break;
                default:
                    System.out.println("Invalid input! Please use 'W/A/S/D' keys.");
            }

            if (turtleX == gridSize - 1 && turtleY == gridSize - 1) {
                System.out.println("Congratulations! You reached the goal!");
                break;
            }
        }

        scanner.close();
    }

    private static void printGrid(int gridSize, int turtleX, int turtleY) {
        for (int y = 0; y < gridSize; y++) {
            for (int x = 0; x < gridSize; x++) {
                if (x == turtleX && y == turtleY) {
                    System.out.print("T ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
