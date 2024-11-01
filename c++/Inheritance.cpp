#include <iostream>

using namespace std;

int main(){
    
}


/*
there are 5 types of inheritance-:

1) single level inheritance-:
        Single-level inheritance is a type of inheritance in object-oriented programming where a subclass inherits properties and behaviors from a single parent class. This creates a simple parent-child relationship between the two classes.

Here’s an example in Java:

 // Parent class
class Animal {
    void sound() {
        System.out.println("This is a sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();  // Inherited method from Animal class
        myDog.bark();   // Method from Dog class
    }
}
In this example:

The Animal class is the parent class, and Dog is the child class.
The Dog class inherits the sound() method from the Animal class, which allows it to access the behavior defined in the parent class while also defining its own behavior with the bark() method.


2) multilevel inheritance-:
        Multilevel inheritance is a type of inheritance where a class is derived from a class that is also derived from another class. This creates a chain of inheritance across multiple levels.

Here's an example of multilevel inheritance in Java:

// Parent class
class Animal {
    void sound() {
        System.out.println("This is a sound");
    }
}

// Intermediate class (Child of Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks");
    }
}

// Derived class (Child of Dog)
class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy weeps");
    }
}

public class Main {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.sound();  // Inherited from Animal class
        myPuppy.bark();   // Inherited from Dog class
        myPuppy.weep();   // Method from Puppy class
    }
}
In this example:

The Animal class is the top-level parent.
The Dog class inherits from Animal.
The Puppy class inherits from Dog, forming a chain of inheritance.
The Puppy object has access to methods from all three classes (sound(), bark(), and weep()).

3) multiple inheritance-:
        Multiple inheritance is a feature where a class can inherit from more than one parent class. While some programming languages like C++ support multiple inheritance, Java does not allow multiple inheritance with classes to avoid ambiguity problems (often referred to as the diamond problem). However, Java allows multiple inheritance through interfaces.

Example of multiple inheritance in Java using interfaces:

// First interface
interface Animal {
    void sound();
}

// Second interface
interface Pet {
    void play();
}

// Class implementing both interfaces
class Dog implements Animal, Pet {
    public void sound() {
        System.out.println("The dog barks");
    }

    public void play() {
        System.out.println("The dog plays");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // From Animal interface
        myDog.play();  // From Pet interface
    }
}
In this example:

Animal and Pet are two interfaces.
The Dog class implements both interfaces, inheriting methods from both.
This is how multiple inheritance is achieved in Java without ambiguity, using interfaces instead of classes.

4) hybrid inheritance-:
        
5) hiarchical inheritance
*/