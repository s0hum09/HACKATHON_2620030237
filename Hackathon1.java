import java.util.Scanner;
public class Hackathon1 {
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Panel Id: ");
                int panelid = sc.nextInt();
                System.out.println("Enter Energy Generated in kWh: ");
                float energyy = sc.nextFloat();
                System.out.println("Enter Number of Solar Panels: ");           
                int solarpanel = sc.nextInt();
                System.out.println("Enter the Status of System: ");
                char status = sc.next().charAt(0);

                System.out.println("The Panel-Id is: " + panelid);
                System.out.println("Energy Generated is: " + energyy + " kWh");         
                System.out.println("No. of Solar Panels are: " + solarpanel);
                System.out.println("Status of the System is: " + status);

                if(energyy>=10){
                    System.out.println("Good Energy Generation");
                }else{
                    System.out.println("Low Energy Generation");
                }
                
                System.out.println("Enter Energy Genrated in Morning: ");
                double morningEnergy = sc.nextDouble();
                System.out.println("Enter Energy Generated in Evening: ");
                double eveningEnergy = sc.nextDouble();
                
    System.out.println("The Total Energy Genrated is: " + Method1.calculateTotalEnergy(morningEnergy, eveningEnergy)); //calling the method
            }
    
}
class Method1{
      static double calculateTotalEnergy(double morningEnergy, double eveningEnergy){       //creation of method
        return morningEnergy + eveningEnergy;
    }
    
}

