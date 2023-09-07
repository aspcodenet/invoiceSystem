package se.systementor.invoicesystem;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.systementor.invoicesystem.models.bankgirot.batch;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
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
        // url
        var url = "https://www.bankgirot.se/globalassets/dokument/exempelfiler/e-faktura/e-faktura_exempelfil_faktura_b2c.xml";
        var objectMapper = new XmlMapper();
        try {
            var batch = objectMapper.readValue(new URL(url), batch.class);
            System.out.println(batch.batchDetails.bgnr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void listAll(Scanner scan) {
        
        
    }

    private void showHeaderMenu() {
        System.out.println("1. See all");
        System.out.println("2. fetch");
        System.out.println("9. Exit");
    }

}
