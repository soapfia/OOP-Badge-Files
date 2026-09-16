package OOP.dog; 

import OOP.dog.Dog; 

public class DogRunner {
    public static void main(String[] args) {
        // 4. The code below makes a new instance of Dog named henry and then calls bark() on it. 
        Dog henry = new Dog("Henry", "Samoyed", 4); 
        henry.bark(); 
    }
}