public class FamilyPetsTest {

    public static void main(String[] args) {

        FamilyPets fp = new FamilyPets();



        if (fp.addNewPet(new Animal("mouse", "a small rodent")))
            System.out.println("mouse added to collection");
        else System.out.println("mouse NOT ADDED");

        if (fp.addNewPet(new Animal("mouse", "cheese collector")))
            System.out.println("mouse added to collection");
        else System.out.println("mouse NOT ADDED");

        if (fp.addNewPet(new Animal("rat", "a large rodent")))
            System.out.println("rat added to collection");
        else System.out.println("rat NOT ADDED");

        if (fp.addNewPet(new Animal("dog", "man's best friend")))
            System.out.println("dog added to collection");
        else System.out.println("dog NOT ADDED");

        if (fp.addNewPet(new Animal("cat", "their own best friend")))
            System.out.println("cat added to collection");
        else System.out.println("cat NOT ADDED");

        fp.showFamilyPets();

        System.out.println("The description of cat is " + fp.getDescription("cat"));
        System.out.println("The description of mouse is " + fp.getDescription("mouse"));

        if (fp.changeDescription(new Animal("dog", "stick chaser")))
            System.out.println("dog description changed");
        else System.out.println("dog description NOT CHANGED");

        System.out.println("The description of dog is " + fp.getDescription("dog"));

        if (fp.addNewPet(new Animal("dog", "cat's worst enemy")))
            System.out.println("dog added to dictionary");
        else System.out.println("dog NOT ADDED");

        System.out.println("The description of dog is " + fp.getDescription("dog"));

        System.out.println("The description that is alphabetically last is for " + fp.alphabeticallyLast());

        if (fp.delete("rat"))
            System.out.println("rat description deleted");
        else System.out.println("rat description NOT DELETED");

        fp.showFamilyPets();
    }
}