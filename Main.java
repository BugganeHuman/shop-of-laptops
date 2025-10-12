package employee;

import java.util.Scanner;

public class Main extends Cashbox{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Earth of LapTops");
        Cashbox Cashbox = new Cashbox();
        Cashbox.money = 0;
        Product mainProduct = new Product();
        while (true) {
            System.out.print("Press |1| - look catalog, |2| - add a new product, |3| - show cashbox, |0| - to exit: ");
            int firstChoose = input.nextInt();
            if (firstChoose == 0 ) {
                break;
            }
            else if (firstChoose == 3) {
                Cashbox.showMoney();
            }
            else if (firstChoose == 1) {
                while (true) {
                    Product show = new Product();
                    show.showCatalog();
                    System.out.print ("Enter the number of product, which you want to see details, press |-1| - delete mode, |-2| - deal mode |0| - for back, : ");
                    int chooseOfShowProducts = input.nextInt();
                    if (chooseOfShowProducts == 0 ) {
                        break;
                    }
                    else if (chooseOfShowProducts == -1) {
                        while (true) {
                            System.out.print ("Enter the number of product, which you want to delete, press |0| - back: ");
                            int deleteNumber = input.nextInt();
                            if (deleteNumber==0) {
                                break;
                            }
                            System.out.printf("Object %d deleted\n", deleteNumber);
                            Product deleteProduct = new Product();
                            deleteProduct.deleteInProducts(deleteNumber);
                            deleteProduct.deleteInProductsDetails(deleteNumber);
                        }

                    }
                    else if (chooseOfShowProducts == -2) {
                        while (true) {
                            System.out.print("Enter the number of product, which you want to sell, press |0| - to exit: ");
                            int dealChoose = input.nextInt();
                            if (dealChoose == 0) {
                                break;
                            } else {
                                if (dealChoose == 1) {
                                    int moneyF = costs.get(0);
                                    money += moneyF;
                                    mainProduct.deleteInProducts(dealChoose);
                                    mainProduct.deleteInProductsDetails(dealChoose);
                                }
                                else {

                            dealChoose--;

                            int moneyF = costs.get(dealChoose);
                            money += moneyF;
                            mainProduct.deleteInProducts(dealChoose);
                            mainProduct.deleteInProductsDetails(dealChoose);

                                }
                            }
                            }
                        }

                    else  {
                        Product showPr = new Product();
                        showPr.showProductsDetails(chooseOfShowProducts);
                    }
                }
            }

            if (firstChoose == 2) {
                while (true) {


                    System.out.println ("which type of product do you want to add");
                    System.out.print ("press |1| - Laptop, |2| - Pc, |3| - Monitor, |0| - exit : ");
                    int chooseOfAdd = input.nextInt();

                    if (chooseOfAdd == 1) {
                        Laptop newLaptop = new Laptop();
                        newLaptop.laptopConstructor();

                    } else if (chooseOfAdd == 2) {
                        Pc newPc = new Pc();
                        newPc.PcpConstructor();
                    }
                    else if (chooseOfAdd == 3) {
                        Monitor newMonitor = new Monitor();
                        newMonitor.monitorConstructor();
                    }

                    else if (chooseOfAdd == 0) {
                        break;

                    }
                    else {
                        System.out.println("");
                    }

                }
            }
            else {
                System.out.println("");
            }
        }
    }
}
