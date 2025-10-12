package employee;

import java.util.ArrayList;

public class Product {
    public static ArrayList<String> products = new ArrayList<>();
    public static ArrayList<String>productsDetails = new ArrayList<>();
    public static ArrayList<Integer> costs = new ArrayList<>();
    public int price;
    public String name;
    public void addProduct(String name) {
        products.add(name);

    }
    public void showCatalog() {
       int counter = 0;
        for (String product: products) {
            counter ++;
            System.out.println(counter + " " +  product);
        }
    }
    public void showProductsDetails (int index) {
        index = index - 1;
        System.out.println("");
        System.out.println (productsDetails.get(index));
        System.out.println("");

    }
    public void deleteInProducts (int index) {
        index = index - 1;
        products.remove(index);
    }
    public void deleteInProductsDetails (int index) {
        index = index - 1;
        productsDetails.remove(index);
    }
    }
