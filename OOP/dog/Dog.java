package OOP.dog; 

public class Dog {
    // 1. Write your properties here. 
    public String name; 
    public String breed;
    public Integer age;
    // add more properties below

    // 2. Fill in the constructor below so that the dog's name is correctly set
    public Dog(String dogName, String dogBreed, Integer dogAge) {
        this.name = dogName; 
        this.breed = dogBreed;
        this.age = dogAge;
        // add more initializers below
    }

    // 3. Write your methods here. 
    public void bark() {
        // Add print statement to bark!
        System.out.println("bark!");

    }

    
}