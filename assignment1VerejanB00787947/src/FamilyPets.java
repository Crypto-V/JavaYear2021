import java.util.Arrays;

public class FamilyPets extends Animal{

    private static final int COLLECTION_SIZE = 3;
    private Animal[] animals = new Animal[COLLECTION_SIZE];


    /* ----------------------------------------------------
       --- Create a new FamilyPets collection populated ---
       --- with blank Animal entries                    ---
       ----------------------------------------------------
    */

    public FamilyPets() {
        super();
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            Animal animal = new Animal();
            animals[i] = animal;

        }
    }


    /* -------------------------------------------------------
       --- Display the entire FamilyPets collection with 1 ---
       --- definition per line. Empty Animal entries       ---
       --- should not be printed.                          ---
       -------------------------------------------------------
    */
    public void showFamilyPets() {
        System.out.println("\nMy Pets\n-----------------");
        for (Animal animal : animals) {
            if (!animal.getName().equals(""))
                System.out.println(animal.toString());
        }
        System.out.println("-----------------\n");
    }


    /* ---------------------------------------------------
       --- Add the newAnimal to the first element      ---
       --- in animals with name = "".  Return true     ---
       --- if successful, false otherwise              ---
       ---------------------------------------------------
    */
    public boolean addNewPet(Animal newAnimal) {
        // TO DO: Add code to this method to prevent the same name being used twice.
        // If the name already exists in the collection, the current
        // description should be replaced by the new one and true returned

        for (int i = 0; i < COLLECTION_SIZE; i++) {
            if (!animals[i].equals(newAnimal) || (!animals[i].getName().equals(""))) {
                animals[i] = newAnimal;
                return true;
            }
        }
        return false;
    }


    /* ---------------------------------------------------
       --- Return the corresponding description that   ---
       --- matches the name passed as a parameter      ---
       --- or "" if name is not found                  ---
       ---------------------------------------------------
    */

        public String getDescription(String aName){
            // TO DO: Provide this method body
            String descript = "";

            for (Animal animal : animals) {

                if (animal.getName().equals(aName)) {
                    descript = animal.getDescription();
                    return descript;
                }
            }
            return " ";

        }


    /* ---------------------------------------------------
       --- Update the FamilyPets entry for the         ---
       --- Animal passed as a parameter.  Return       ---
       --- true if successful or false if the          ---
       --- name in the parameter Animal is not         ---
       --- found in the collection                     ---
       ---------------------------------------------------
    */
        public Boolean changeDescription (Animal anAnimal){
            // TO DO: Provide this method body

            for (Animal animal : animals) {
                if (animal.getName().equals(anAnimal.getName())) {
                    animal.setDescription(anAnimal.getDescription());
                    return true;
                }
            }
            return false;
        }

    /* ---------------------------------------------------
       --- Delete the Animal matching the name passed  ---
       --- as a parameter by setting it to an empty    ---
       --- Animal.  Return true if successful or       ---
       --- false if the name in the string parameter   ---
       --- does not match an Animal in the collection  ---
       ---------------------------------------------------
    */
        public boolean delete (String aName){
            // TO DO: Provide this method body


            for (Animal animal : animals) {
                if (animal.getName().equals(aName)) {
                    animal.setName("");
                    animal.setDescription("");
                    return true;
                }
            }
            return false; // change this line if required
        }


    /* -----------------------------------------------------
       --- Return the Animal that is alphabetically      ---
       --- last by name.  For example, if the names in   ---
       --- the collection are "mouse", "cat" and "dog",  ---
       --- the string "mouse" should be returned. Return ---
       --- "" if all dictionary elements are empty       ---
       -----------------------------------------------------
    */
        public String alphabeticallyLast () {
            String name = "";
            boolean AnimalArrayEmpty = true;

            //Check for no-empty cars

            for (Animal animal : animals) {
                if (!animal.getName().equals("")) {
                    AnimalArrayEmpty = false;
                    break;
                }
            }
            //if no empty cars than sort the array
            if (!AnimalArrayEmpty) {
                String[] animalNames = new String[3];

                for (int i = 0; i < animals.length; i++) {
                    animalNames[i] = animals[i].getName();
                }

                Arrays.sort(animalNames);
                name = animalNames[animalNames.length - 1];
            }
            return name;
        }

    }