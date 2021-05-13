package something;

public class Shop extends Building {
    private int numEmployees;
    private int averageTurnover;
    private static int numShops = 0;

    public static int getNumShops(){
        return numShops;
    }

    public Shop() {
        numEmployees = 0;
        averageTurnover = 0;
        numShops++;
    }

    public Shop(String address, String owner, int numEmployees, int averageTurnover) {
        super(address, owner);
        this.numEmployees = numEmployees;
        this.averageTurnover = averageTurnover;
        numShops++;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public int getAverageTurnover() {
        return averageTurnover;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    public void setAverageTurnover(int averageTurnover) {
        this.averageTurnover = averageTurnover;
    }

    public String toString(){
        return "| Shop at "+super.getAddress()+" ocupied by: "+super.getOwner()+" has "+numEmployees+
                " employees and turnover rate is :"+averageTurnover+" |";
    }
}
