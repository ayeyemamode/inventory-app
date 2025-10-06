package com.bptn;

import com.bptn.inventory_app.model.*; // Import all product models
import java.util.Scanner;
import java.time.LocalDate;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    
    // Use a simple array for the inventory. We'll set a fixed size for now.
    private static Product[] inventory = new Product[10];
    private static int productCount = 0;

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

        initializeData(); // Add some sample data

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
        scanner.close(); // Close the scanner when the application exits.

    }

    private static void addProduct(){
        // This method will be implemented later, as it requires user input utilities.
        System.out.println("\n--- Add New Product (Not yet implemented) ---");
    }

    private static void viewAllProducts() {
        System.out.println("\n--- All Products in Inventory ---");
        if (productCount == 0) {
            System.out.println("No products in inventory.");
            return;
        }
        for (int i = 0; i < productCount; i++) {
            System.out.println(inventory[i]);
        }
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
        System.out.println("\n=========================================");
        System.out.println("🚀 Initializing Sample Inventory Data...");
        System.out.println("=========================================");
        
        // Create and add products directly to the array
        inventory[productCount++] = new Product("PROD-1000", "Laptop X200", ProductCategory.ELECTRONICS, 800, 1200, 10, "TechSupplier Inc.");
        inventory[productCount++] = new PerishableProduct("PROD-1001", "Organic Apples", ProductCategory.GROCERIES, 1, 2.5, 50, "FarmFresh Co.", LocalDate.now().plusDays(14));
        inventory[productCount++] = new Product("PROD-1002", "Java Programming Book", ProductCategory.BOOKS, 20, 45, 25, "EduPublishers");
        inventory[productCount++] = new ElectronicsProduct("PROD-1003", "Smart Watch Z", ProductCategory.ELECTRONICS, 150, 250, 15, "GadgetGlobal", "SN-SWZ-001", 12);
        
        System.out.println("=========================================");
        System.out.println("✅ Sample Data Initialization Complete!");
        System.out.println("=========================================\n");
    }
}