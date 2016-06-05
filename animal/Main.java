package animal;

/**
 * Created by Elev1 on 2016-05-31.
 */
public class Main {
    public static void main(String[] args) {
        //animal.Tiger tiger2 = new animal.Tiger("cat", "miaow");

        Tiger tiger = new Tiger();
        Donkey donkey = new Donkey();
        Owl owl = new Owl();
        Duck duck = new Duck();
        Frog frog = new Frog();

        Animal[] animals = new Animal[5];
        animals[0] = tiger;
        animals[1] = donkey;
        animals[2] = owl;
        animals[3] = duck;
        animals[4] = frog;

        System.out.println(tiger.getClass());
        System.out.println(duck.getClass());

        for(int i = 0; i < animals.length; i++) {
//            System.out.println("The " + animals[i] + " says " + animals[i].makeSound());
            if(animals[i] instanceof Pets) {
                Pets pet = (Pets) animals[i];
//                System.out.println("The " + animals[i] + " is fed " + animals[i].feedAnimal() + "\n");
                System.out.println("The " + animals[i] + " is fed " + pet.feedAnimal() + "\n");
            }
        }
    }

}
