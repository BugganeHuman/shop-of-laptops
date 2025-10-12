package employee;

import java.util.Scanner;

public class  Pc  extends Cashbox{
    String GPU;
    String CPU;
    int RAM;
    String disk;
    String frame;
    String OS;
    public void PcpConstructor() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of Pc: ");
        String nameInp = input.nextLine();
        name = nameInp;

        System.out.print("Enter the price of Pc: ");
        int priceInp = input.nextInt();
        price = priceInp;


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
        System.out.print("Enter the frame type: ");
        String frameinp = input.nextLine();
        frame = frameinp;
        //input.nextLine();
        System.out.print("Enter the OS name: ");
        String OSinp = input.nextLine();
        OS = OSinp;
        products.add(name);
        productsDetails.add("Pc        " + "Name - " + name + ", Price - " + price +  ", GPU - " + GPU + ", CPU - " +
                CPU + ", RAM - " + RAM + ", Disk - " + disk +", Frame - "+ frame + ", OS - " + OS);
        costs.add(price);

    }
    void show() {
        System.out.printf("Name: %s, Price: %d, GPU: %s, CPU: %s, RAM: %d, Disk: %s, Frame: %s, OS: %s \n", name, price, GPU, CPU, RAM, disk,frame, OS);
    }
}
