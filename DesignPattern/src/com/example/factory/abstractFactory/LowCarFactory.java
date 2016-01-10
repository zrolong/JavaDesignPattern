package com.example.factory.abstractFactory;

public class LowCarFactory implements CarFactory{

	@Override
	public Engine createEngine() {
		return new LowEngine();
	}

	@Override
	public Seat createSeat() {
		return new LowSea();
	}

	@Override
	public Tyre createTyre() {
		return new LowTyre();
	}

}