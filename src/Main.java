public class Main {

    public static void main(String[] args) {
        Cat barsik = new Cat("fish", "home", 10);
        Dog ball = new Dog("meat", "yard", 10);
        Horse bullet = new Horse("straw", "field", 1);

        Animal [] array = {barsik, ball, bullet};
        
        for (Animal animal : array)
            Vet.treatAnimal(animal);


    }
}
