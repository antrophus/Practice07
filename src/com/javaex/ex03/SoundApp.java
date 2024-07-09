package com.javaex.ex03;

public class SoundApp {

    public static void main(String[] args) {
    	/*
    	Cat cat = new Cat();
    	Dog dog = new Dog();
    	Sparrow sp = new Sparrow();
    	Duck duck = new Duck();
    	
    	printSound(cat);
    	printSound(dog);
    	printSound(sp);
    	printSound(duck);
    	*/
    	
    	//--> 위 코드를 아래와 같이 축약할 수 있다. 

        printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow() );
        printSound( new Duck() );
    }

    public static void printSound( Soundable soundable ) {
    	
        //구현
    	System.out.println(soundable.sound());
    }
    
}


