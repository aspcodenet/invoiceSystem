package se.systementor.invoicesystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class InvoiceSystemApplication implements CommandLineRunner {

    public static void main(String[] args)
    {
        SpringApplication.run(InvoiceSystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var scan = new Scanner(System.in);

        while(true){
            showHeaderMenu();
            System.out.print("Action:");
            int sel = Integer.parseInt(scan.nextLine()) ;
            if(sel == 1) listAll(scan);
            else if(sel == 2) fetch(scan);
            else if(sel == 9) break;

        }
    }

    private void fetch(Scanner scan) {
    }

    private void listAll(Scanner scan) {
        
        
    }

    private void showHeaderMenu() {
        System.out.println("1. See all");
        System.out.println("2. fetch");
        System.out.println("9. Exit");
    }

}
