/**
 * Created by Elev1 on 2016-05-31.
 */
public class AnimalMain {
    public static void main(String[] args) {
        //Tiger tiger2 = new Tiger("cat", "miaow");

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

        for(Animal animal: animals) {
            System.out.println(animal.makeSound());
        }
    }

}
