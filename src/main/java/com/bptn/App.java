package com.bptn;


import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    private static void printMenu() {
        System.out.println("\n--- Smart Inventory Assistant Menu ---");
        System.out.println("1. Add New Product");
        System.out.println("2. View All Products");
        System.out.println("3. Record Sale");
        System.out.println("4. Restock Product");
        System.out.println("5. Update Product Price");
        System.out.println("6. View Sales History");
        System.out.println("7. Delete Product");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Smart Inventory Assistant!");

        initializeData(); // Add some sample data (will be an empty stub for now)

        boolean running = true;
        while (running) {
            printMenu();

            
            int choice = scanner.nextInt();

                switch (choice) {
                case 1 -> addProduct();
                case 2 -> viewAllProducts();
                case 3 -> recordSale();
                case 4 -> restockProduct();
                case 5 -> updateProductPrice();
                case 6 -> viewSalesHistory();
                case 7 -> deleteProduct();
                case 0 -> {
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                }
                default -> System.out.println("Invalid choice. Please try again.");
                

            } 
        }

    }

    // Method Stubs - Implementations will follow in later exercises
    private static void addProduct(){
        // Implementation for adding a new product will go here
        System.out.println("\n--- Add New Product (Not yet implemented) ---");
    }

    private static void viewAllProducts() {
        // Implementation for viewing all products will go here
        System.out.println("\n--- View All Products (Not yet implemented) ---");
    }

    private static void viewAllProductSummaries() {
        // Helper method for displaying product summaries
        System.out.println("\n--- Product List (ID and Name) (Not yet implemented) ---");
    }

    private static void recordSale(){
        // Implementation for recording a sale will go here
        System.out.println("\n--- Record Sale (Not yet implemented) ---");
    }

    private static void restockProduct() {
        // Implementation for restock product will go here
        System.out.println("\n--- Restock Product (Not yet implemented) ---");
    }

    private static void updateProductPrice(){
        // Implementation for updating product price will go here
        System.out.println("\n--- Update Product Price (Not yet implemented) ---");
    }

    private static void viewSalesHistory() {
        // Implementation for viewing sales history will go here
        System.out.println("\n--- View Sales History (Not yet implemented) ---");
    }

    private static void deleteProduct() {
        // Implementation for deleting a product will go here
        System.out.println("\n--- Delete Product (Not yet implemented) ---");
    }

    private static void initializeData() {
        // Implementation for initializing sample data will go here
        System.out.println("\n=========================================");
        System.out.println("🚀 Initializing Sample Inventory Data (Not yet implemented)...");
        System.out.println("=========================================\n");
    }
}
