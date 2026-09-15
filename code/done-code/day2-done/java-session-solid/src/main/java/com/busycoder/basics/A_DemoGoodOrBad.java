package com.busycoder.basics;
//"seprate what varies"

class Bird {
	void sound() {
		System.out.println("bird sound");
	}
	void fly() {
		System.out.println("bird sound");
	}
	void swim() {
		System.out.println("bird sound");
	}


}

class Eagle extends Bird  {
	@Override
	public void fly() {
		System.out.println("flying high...");
	}
	
}
class Emu extends Bird {
}

class Duck extends Bird {
	@Override
	public void swim() {
		System.out.println("swimming :)");
	}

}

public class A_DemoGoodOrBad {
	public static void main(String[] args) {
		Eagle eagle=new Eagle();
		//eagle.swim();
	}
}
