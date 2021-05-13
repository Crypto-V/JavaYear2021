public class Animal {

    private String name;
    private String description;

    public Animal() {
        name = "";
        description = "";
    }

    public Animal(String n, String d) {
        name = n;
        description = d;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setDescription(String newDescription) {
        description = newDescription;
    }


    public String toString() {
        return name + " : " + description;
    }
}