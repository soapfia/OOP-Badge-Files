package OOP.oop;

public class AnimalRunner {
    public static void main (String[] args) {
        Cat cat = new Cat("Komi", 2);
        Dog dog = new Dog("Wangwang", 4);
        Bird bird = new Bird("Yuki", 3);
        cat.describe();
        dog.describe();
        bird.describe();

        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        
        cat.setAge(1);
        System.out.println(cat.getAge());

        Animal [] animals = {cat, dog, bird};

        for (Animal animal : animals) {
            animal.makeSound();
        }


        
    }

}
