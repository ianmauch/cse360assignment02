package cse360assignment02;

public class AddingMachineDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		System.out.println(myCalculator.toString());
		System.out.println(myCalculator.getTotal());
	}

}
