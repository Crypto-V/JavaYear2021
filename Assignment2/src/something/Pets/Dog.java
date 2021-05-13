package something.Pets;

public class Dog extends Pet {
    private String breed;
    private static int numDogs;

    public static int getNumDogs() {
        return numDogs;
    }

    public Dog(){
        breed = "";
        numDogs++;
    }

    public Dog(String name,int age,String breed){
        super(name,age);
        this.breed = breed;
        numDogs++;
    }

    public String speak(){
        return "Woof! "+this+breed;
    }


}
