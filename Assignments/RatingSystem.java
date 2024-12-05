package Assignments;

import java.util.Scanner;

public class RatingSystem {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the movie rating count: ");
        int ratingCount = scn.nextInt();

        if (ratingCount > 75000) {
            System.out.println("Rating: Out of the world");
        } else if (ratingCount > 45000 && ratingCount <= 70000) {
            System.out.println("Rating: Best");
        } else if (ratingCount > 25000 && ratingCount <= 45000) {
            System.out.println("Rating: Better");
        } else if (ratingCount > 5000 && ratingCount <= 25000) {
            System.out.println("Rating: Good");
        }

        scn.close();
    }
}
