package com.driver;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class WardrobeManager {

    private Deque<String> wardrobe = new LinkedList<>();

    public void addCloth(String cloth) {
        wardrobe.addLast(cloth);
    }

    public String retrieveCloth() {
        return wardrobe.pollFirst();
    }

    public void displayClothes() {
        System.out.println("Clothes in Wardrobe: " + wardrobe);
    }

    public static void main(String[] args) {
        WardrobeManager manager = new WardrobeManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Cloth");
            System.out.println("2. Retrieve Cloth");
            System.out.println("3. Display Clothes");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter cloth name: ");
                    String cloth = sc.nextLine();
                    manager.addCloth(cloth);
                    break;
                case 2:
                    String retrievedCloth = manager.retrieveCloth();
                    if (retrievedCloth != null) {
                        System.out.println("You retrieved: " + retrievedCloth);
                    } else {
                        System.out.println("Wardrobe is empty.");
                    }
                    break;
                case 3:
                    manager.displayClothes();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}