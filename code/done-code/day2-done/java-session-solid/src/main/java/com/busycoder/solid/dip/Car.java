package com.busycoder.solid.dip;


public class Car {
	private Tyre tyre;
	public Car(Tyre tyre) {
		this.tyre = tyre;
	}
	public void move() {
		tyre.rotate();
	}
}
