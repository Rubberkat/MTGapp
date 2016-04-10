package methods;

import databasefunctions.DatabaseMethods;

public class LifeMethods {
	
	DatabaseMethods dbmethods = new DatabaseMethods();
	
	int lifetotal;
	
	public int getTotalHealth() {
		return lifetotal;
	}
	
	public int plusOneLife() {
		lifetotal = lifetotal + 1;
		return lifetotal;
	}
	
	public int minusOneLife() {
		lifetotal = lifetotal - 1;
		return lifetotal;
	}
	
	public int resetLife() {
		lifetotal = 20;
		return lifetotal;
	}
}
