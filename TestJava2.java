import java.util.*;
public class TestPet2 {
    public static void main (String [] args) {
        Scanner input= new Scanner (System.in);
        Pet []Pet = new Pet[5];

        for (int i = 0; i < 5; i++) {
            Pet[i] = new Pet();

            System.out.print("Enter name: ");
            String name = input.next();
            System.out.print("Enter animal type: ");
            String animal_type = input.next();
            System.out.print("Enter age: ");
            int age = input.nextInt();
            System.out.print("\n");

            Pet[i].setPet(name, animal_type, age);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Object "+ (i+1) +": ");
            System.out.println(Pet[i]+"\n");
        }

        int counter = 0;
        for (int i = 0; i < 5; i++) {
            if (Pet[i].getAnimal_type().equalsIgnoreCase("cat")) {
                counter += 1;
            }
        }
        System.out.println("Number of cat: "+ counter);
    }
}
