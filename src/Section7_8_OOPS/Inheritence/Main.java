package Section7_8_OOPS.Inheritence;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal","Huge",400);
        doAnimalStuff(animal,"Slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie,"fast");

        Dog retriever = new Dog("Retriever", 65,"Floppy","Swimmer");
        doAnimalStuff(retriever,"Slow");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("______");
    }
}
