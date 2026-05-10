package com.abstraction;

abstract class Animal {
	abstract void makeSound();
	void eat() {
		System.out.println("I can eat.");
	}
}

class Dog extends Animal {

	@Override
	void makeSound() {
		System.out.println("Bark Bark");		
	}
}

public class AnimalMain {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.makeSound();
		
		Animal a = new Dog();
		a.eat();
		a.makeSound();
	}

}
