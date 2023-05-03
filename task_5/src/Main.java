import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFile = "product.csv";
        String csvOutput = "product.txt";
        String data = "";
        double totalValue = 0.00;
        List<Product> productList = new ArrayList<>();

        //read data
        try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
            while((data = br.readLine()) != null){
                String []productData = data.split(",");
                Product product = new Product(productData[0], Double.parseDouble(productData[1]));
                productList.add(product);
                totalValue = totalValue+ Double.parseDouble(productData[1]);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }

        System.out.println(totalValue);

        //write data
        try(FileWriter fileWriter = new FileWriter(csvOutput)){
            fileWriter.write(String.format("%-15s %-15s\n", "Product", "Price"));

            for (Product product : productList){
                fileWriter.write(String.format("%-15s $%-15.2f\n", product.getName(), product.getPrice()));
            }
            fileWriter.write(String.format("\nTotal value: $%.2f", totalValue));

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }


}

