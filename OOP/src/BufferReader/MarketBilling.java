package BufferReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MarketBilling {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Product Name: ");
        String ProductName = reader.readLine();

        System.out.print("Product price per item: ");
        double price = Double.parseDouble(reader.readLine());

        System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(reader.readLine());
            double totalBill = price * quantity;

            System.out.println("ProductName "+ProductName);
            System.out.println("Price "+price);
            System.out.println("Quantity "+quantity);
            System.out.println("Bill "+totalBill);





    }

}
