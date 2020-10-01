// Ian Mauch
// 10/05/2020
// Assignment 01. Version Control 

package cse360assignment02;

public class AddingMachine {
	private int total;
	private String history = "0";

	public AddingMachine() {
		total = 0; // not needed - included for clarity
	}

	public int getTotal() {
		return total; // returns the total
	}

	public void add(int value) {
		total += value; // adds the parameter value to total
		history += " + " + value; // adds " + " and the value to the string history
	}

	public void subtract(int value) {
		total -= value; // subtracts the parameter value from total
		history += " - " + value; // adds " - " and the value to the string history
	}

	public String toString() {
		return history; // returns the string history
	}

	public void clear() {
		total = 0; // sets total to 0
		history = "0"; // sets history to "0"
	}
}