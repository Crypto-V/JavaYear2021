package something.Pets;

public class Pet {
    private String name;
    private int age;

    public Pet() {
        name = "";
        age = 0;
    }

    public Pet(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
       return "I am "+name+", a "+age+" year old ";
    }

    public String speak(){
        return "";
    }
}
