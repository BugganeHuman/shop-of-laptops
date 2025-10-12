package employee;

import java.util.Scanner;


public class Monitor extends Cashbox {
    String screenDiagonal;
    String typeOfMatrix;
    String haveASound;
    int hz;
    String defects;


   public void monitorConstructor () {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Monitor's name: ");
        String monitorName = input.nextLine();
        name = monitorName;


        System.out.print("Enter the price of Monitor: ");
        int monitorPrice = input.nextInt();
        price = monitorPrice;

        System.out.print("Enter the screen diagonal of Monitor: ");
        String screenDiagonalInp = input.next();
        screenDiagonal = screenDiagonalInp;
        input.nextLine();
        System.out.print("Enter the type of matrix: ");
        String typeOfMatrixlInp = input.nextLine();
        typeOfMatrix = typeOfMatrixlInp;

        //input.nextLine();

        System.out.print("Does he have a sound: ");
        String haveASoundInp = input.next();
        haveASound = haveASoundInp;

        System.out.print("Enter hz of Monitor:  ");
        int hzInp = input.nextInt();
        hz = hzInp;
        input.nextLine();
        System.out.print("Enter the defects of Monitor: ");
        String defectsInp = input.nextLine();
        defects = defectsInp;

        products.add (name);
        productsDetails.add("Monitor        "+"Name - " + name + ", Price" + price + ", Screen diagonal - " + screenDiagonal + ", Matrix - "
        + typeOfMatrix + ", Have a sound - " + haveASound + ", Hz - " + hz + ", defects - " + defects);
        costs.add(price);
   }
    void show() {
       System.out.printf("Name: %s, Price: %d,Screen diagonal: %s, Type of matrix: %s, Have a sound: %s, Hz: %d, Defects: %s%n \n", name, price, screenDiagonal, typeOfMatrix, haveASound, hz, defects);
    }
}
