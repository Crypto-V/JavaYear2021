package something;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class BuildingsTest {
    private static int getRandomValue(int low,int high){
        Random random = new Random();
        return random.nextInt(high-low)+low;
    }

    public static void main(String[] args) {

        Building [] buildings = new Building[10];
        Scanner input = new Scanner(System.in);
        String name;
        String address;
        int numBeds;
        boolean garage;
        for(int i = 0;i<5;i++){
            address = ""+(31+i)+"Main Street";
            numBeds = getRandomValue(1,5);
            garage = (getRandomValue(1,100)<50);
            System.out.println("Enter the name of the owner");
            name = input.nextLine();
            buildings[i] = new House(address,name,numBeds,garage);
        }

        int turnover, employees;
        for (int i = 5;i<10;i++){
            address = ""+i+" Main Street";
            turnover = getRandomValue(10000,1000000);
            employees = getRandomValue(5,10);
            System.out.println("Enter the name of the owner");
            name = input.nextLine();
            buildings[i] = new Shop(address,name,employees,turnover);
        }

        for (int i = 0;i<10;i++){
            System.out.println(buildings[i]);
        }
    }

}
