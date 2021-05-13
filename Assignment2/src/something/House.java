package something;

public class House extends Building {
    private int numBedrooms;
    private boolean hasGarage;
    private static int numHouses=0;

    public static int getNumHouses(){
        return numHouses;
    }

    public House() {
        super();
        numBedrooms = 0;
        hasGarage = false;
        numHouses++;
    }

    public House(String address, String owner, int numBedrooms, boolean hasGarage) {
        super(address, owner);
        this.numBedrooms = numBedrooms;
        this.hasGarage = hasGarage;
        numHouses++;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public String toString(){
        return "| House at "+super.getAddress()+" has "+numBedrooms+
                "bedrooms and  it has garage = "+hasGarage+" |";
    }
}
