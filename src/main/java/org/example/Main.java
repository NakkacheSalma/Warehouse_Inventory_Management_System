package org.example;

import inventory.*;

import java.util.*;



public class Main {
    public static void main(String[] args) {
        // Création des produits
        Product product1 = new Product(1, "Laptop", 20);
        Product product2 = new Product(2, "Smartphone", 40);
        Product product3 = new Product(3, "Tablet", 80);
        Product product4 = new Product(4, "Camera", 100);

        // Création d'un entrepôt
        Warehouse warehouse = new Warehouse();

        // Ajouter des produits dans l'entrepôt
        warehouse.addProduct(product1);
        warehouse.addProduct(product2);
        warehouse.addProduct(product3);
        warehouse.addProduct(product4);

        // Afficher l'inventaire
        System.out.println("Affichage de l'inventaire initial :");
        warehouse.displayInventory();

        // Recherche d'un produit par ID
        System.out.println("\nRecherche d'un produit par ID :");
        warehouse.lookUpProduct(2);

        // Essayer d'ajouter un produit avec un ID déjà existant
        System.out.println("\nEssai d'ajout d'un produit avec un ID existant :");
        warehouse.addProduct(new Product(2, "Earphones", 25));

        // Trier les produits par nom et afficher l'ordre trié
        System.out.println("\nTrier les produits par nom :");
        warehouse.sortProduct();

        // Création d'une expédition quotidienne
        DailyShipment dailyShipment = new DailyShipment();

        // Enregistrement de produits reçus
        dailyShipment.recordReceivedProduct(product1);
        dailyShipment.recordReceivedProduct(product3);
        dailyShipment.recordReceivedProduct(product4);

        // Afficher les identifiants des produits reçus dans l'ordre d'arrivée
        System.out.println("\nAffichage des ID des produits reçus dans l'ordre d'arrivée :");
        dailyShipment.printReceivedProductIds();
    }
}
