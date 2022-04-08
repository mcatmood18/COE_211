

import java.io.*;  // Import the FileWriter class
import java.io.IOException;// Import the IOException class to handle errors
import java.util.Scanner;
public class ExpensesTracker{
    public static void main(String[] args) throws IOException {
        String check;
        boolean rep = false;
        Scanner scan = new Scanner(System.in);
                FileWriter fw = new FileWriter(new File("expenses.txt"));
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter outToFile = new PrintWriter(bw);
                
                double payment;
                String purchase;

        do {


            System.out.println("Input your name: ");
            String name = scan.nextLine();
            System.out.println("What did you purchase?");
            purchase = scan.nextLine();
            System.out.println("How much did you pay ? (in USD)");
            payment = scan.nextDouble();


//  <name_of_user> purchased <purchased_product> for <purchase_amount> US Dollars.


            outToFile.println(name + " purchased " + purchase + " for " + payment + " US Dollars ");
           

            System.out.println("Would you like to log another purchase? (y/n)");
            scan.nextLine();
            check = scan.nextLine();

                           } while (check.equals("y"));


        System.out.println("Get off of ZoodMall!");
        System.out.println("Would you like to read a summary of your purchases?");
        String x = scan.nextLine();
        scan.close();
         outToFile.close();
                        if (x.equals("y")) {
                            Scanner fileScan = new Scanner(new File("expenses.txt"));
                            String url;
                                    while (fileScan.hasNext()) {
                                        url = fileScan.nextLine();
                                        System.out.println(url);
                                    }
                         }


             }}