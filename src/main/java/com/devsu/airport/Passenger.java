package com.devsu.airport;

class Passenger {

	private String name;
	private boolean vip;

	Passenger(String name, boolean vip) {
		this.name = name;
		this.vip = vip;
	}

	String getName() {
		return name;
	}

	boolean isVip() {
		return vip;
	}

}
