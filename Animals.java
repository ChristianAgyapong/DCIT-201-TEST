// Animal.java
public class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Cat.java
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat makes a sound");
    }
}

// Dog.java
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog makes a sound");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        myAnimal.makeSound();
        myCat.makeSound();
        myDog.makeSound();
    }
}
