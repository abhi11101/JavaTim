package Section11.Abstraction;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Wolf","Large",100);
        doAnimalStuff(dog);
        Fish fish = new Fish("Goldfish","small",20);
        doAnimalStuff(fish);
    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}
