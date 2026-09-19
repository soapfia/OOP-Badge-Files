package OOP.oop;

public class Animal {
    private String name;
    private int age;

    // 3. Complete your Animal class:
    //    - Look at what properties & methods are shared between Cat.java and Dog.java. Add them in here
    //    - Add a constructor that initializes each property

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

        public void makeSound() {
            System.out.println("hey guys I'm an animal :)");
        }

        public void describe() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
}