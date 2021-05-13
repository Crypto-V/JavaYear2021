package something.Pets;

public class Cat extends Pet {
    private String breed;
    private static int numCats = 0;

    public static int getNumCats() {
        return numCats;
    }

    public Cat(){
        breed = "";
        numCats++;
    }

    public Cat(String name,int age,String breed){
        super(name,age);
        this.breed = breed;
        numCats++;
    }

    public String speak(){
        return "Miaow! "+this+breed;
    }

    public String getBreed() {
        return breed;
    }
}
