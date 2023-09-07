package se.systementor.invoicesystem;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.systementor.invoicesystem.models.bankgirot.batch;
import se.systementor.invoicesystem.models.customeroci.students;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
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

    public static String getText(String url) throws Exception {
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        connection.getInputStream()));

        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null)
            response.append(inputLine);

        in.close();

        return response.toString();
    }

    private void fetch(Scanner scan) throws Exception {
        // url
        var text = getText("https://axmjqhyyjpat.objectstorage.eu-amsterdam-1.oci.customer-oci.com/n/axmjqhyyjpat/b/externalbucket/o/data-1vdvx7Um7UzezAhpKyNmQ.xml");
        var objectMapper = new XmlMapper();
        var s = objectMapper.readValue(text,students.class);

        var url = "https://www.bankgirot.se/globalassets/dokument/exempelfiler/e-faktura/e-faktura_exempelfil_faktura_b2c.xml";
        try {
            var students = objectMapper.readValue(new URL(url), students.class);
            System.out.println(students.student.get(0).name);
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
