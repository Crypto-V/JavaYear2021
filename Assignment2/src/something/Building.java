package something;

public class Building {
    private String address;
    private String owner;
    public static int numBuildings = 0;

    public Building() {
        address = "";
        owner = "";
        numBuildings++;
    }

    public Building(String address, String owner) {
        this.address = address;
        this.owner = owner;
        numBuildings++;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public static int getNumBuildings(){
        return numBuildings;
    }

    @Override
    public String toString() {
        return "Building at "+address+" is owned by "+owner;
    }
}
