package se.lexicon.laszlo.animal;

/**
 * Created by Elev1 on 2016-05-31.
 */
public class Main {
    public static void main(String[] args) {
        //se.lexicon.laszlo.animal.Tiger tiger2 = new se.lexicon.laszlo.animal.Tiger("cat", "miaow");

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


        for(int i = 0; i < animals.length; i++) {
            System.out.println("The " + animals[i] + " says " + animals[i].makeSound());
            if(animals[i] instanceof Domestic) {
                // animals[i] must be casted to Domestic ((Domestic) animals[i]) to access the feedAnimal method in Domestic interface
                System.out.println("The " + animals[i] + " is fed " + ((Domestic) animals[i]).feedAnimal() + "\n");
            }
        }
    }

}
