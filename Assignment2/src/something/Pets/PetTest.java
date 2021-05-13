package something.Pets;

import java.util.Random;
import java.util.Scanner;

public class PetTest {
    private static int getRandom(int low,int high){
        Random random = new Random();
        return random.nextInt(high-low)+low;
    }

    public static void main(String[] args) {
        String[] catBreeds = {"Manx","Siamese","Burmese","Tabby","Persian"};
        String[] dogBreeds = {"Terrier","Greyhound","Alsatian","Spaniel","Mongrel"};

        Scanner input = new Scanner(System.in);
        Pet[] pets = new Pet[5];

        String breed, name,animalType;
        int age;

        for (int i= 0;i<pets.length;i++){
            age = getRandom(1,15);
            System.out.println("What type of animal you would like to add: (cat/dog) >");
            animalType = input.nextLine();
            System.out.println("Please provide the name of the animal?");
            name = input.nextLine();

            if(animalType.equals("cat")){
                breed = catBreeds[getRandom(0,catBreeds.length)];
                pets[i] = new Cat(name,age,breed);
            }else{
                breed = dogBreeds[getRandom(0,dogBreeds.length)];
                pets[i] = new Dog(name,age,breed);
            }
        }
        System.out.println("There are "+Cat.getNumCats()+" cats and "+
                Dog.getNumDogs()+" dogs.");

        boolean finished = false;
        boolean found;
        int i;
        while(!finished){
            System.out.println("Who would you like to speak next?>");
            name = input.nextLine();
            if(name.equals("exit")){
                finished = true;
            }else{
                found = false;
                i=0;
                while(i<pets.length && !found){
                    if(pets[i].getName().equals(name)) found = true;
                    else i++;
                }
                if(found) System.out.println(pets[i].speak());
                else System.out.println("No animal with name "+name+" found!");
            }
        }
    }
}
