package BufferReader;
import java.io. InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;



public class BankIntrestCalc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Name: ");
        String Name = br.readLine();
        System.out.print("Enter Principle: ");
        int Principle = Integer.parseInt(br.readLine());

        System.out.print("Enter annual Intrest: ");
        float AnnualIntrest = Float.parseFloat(br.readLine());

        System.out.print("Enter time in Years: ");
        int TimeInYears = Integer.parseInt(br.readLine());

        float Intrest = (Principle * AnnualIntrest * TimeInYears);

        System.out.println("Custome Name: "+Name);
        System.out.println("Principle: "+ Principle);
        System.out.println("Annual Intrest: "+AnnualIntrest);
        System.out.println("Time in Years: "+TimeInYears);
        System.out.println("Intrest: "+ Intrest);


    }

}
