
public class Number {
	
	//Create the double variable number
	private double number;
	
	/**
	 * Basic constructor that assigns the parameter number to the instance double number
	 * @param number the value to assign to number
	 */
	public Number(double number) {
		this.number=number;
		
	}
	
	/**
	 * standard getter that returns the number value 
	 * @return the value of number
	 */
	public double getNumber() {
		return number;
	}
	
	/**
	 * Setter method that changes the value of the instance double number
	 * @param value you want to change number to
	 */
	public void setNumber(double value) {
		number = value;
	}
	
	/**
	 * Utilizes the utilities class to raise number to a value
	 * @param expValue the exponent value
	 */
	public void pow (int expValue) {
		number = Utilities.expWithSquaring(number, expValue);
	}
	
	/**
	 * Override the toString method for the print method in the Main class
	 */
	@Override
	public String toString() {
		return Double.toString(number);
	}
}
