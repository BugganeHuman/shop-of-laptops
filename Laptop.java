package employee;

import java.util.Scanner;

public class Laptop extends Cashbox {
    String screenDiagonal;
    String GPU;
    String CPU;
    int RAM;
    String disk;
    String OS;

    public void laptopConstructor() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of Laptop: ");
        String nameInp = input.nextLine();
        name = nameInp;

        System.out.print("Enter the price of Laptop: ");
        int priceInp = input.nextInt();
        price = priceInp;

        System.out.print("Enter screen diagonal: ");
        String ScreenDiagonal = input.next();
        screenDiagonal = ScreenDiagonal;

        System.out.print("Enter GPU name: ");
        String GPUinp = input.nextLine();
        GPU = GPUinp;
        input.nextLine();
        System.out.print("Enter CPU name: ");
        String CPUinp = input.nextLine();
        CPU = CPUinp;

        System.out.print("Enter amount of RAM: ");
        int RAMinp = input.nextInt();
        RAM = RAMinp;

        System.out.print("Enter type of disk, and amount of memory: ");
        String diskInp = input.nextLine();
        disk = diskInp;
        input.nextLine();
        System.out.print("Enter the OS name: ");
        String OSinp = input.nextLine();
        OS = OSinp;
        products.add(name);
        productsDetails.add("Laptop         " + "Name - " + name + ", Price - " + price + ", Screen diagonal - " + screenDiagonal + ", GPU - " + GPU + ", CPU - " +
                CPU + ", RAM - " + RAM + ", Disk - " + disk + ", OS - " + OS
        );
        costs.add(price);
    }
    void show() {
        System.out.printf("Name: %s, price: %d, screen diagonal: %s, GPU: %s, CPU: %s, RAM: %d, Disk: %s, OS: %s \n", name, price, screenDiagonal, GPU, CPU, RAM, disk, OS);
    }
}
