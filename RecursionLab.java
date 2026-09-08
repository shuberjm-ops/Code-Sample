// James Shubert
// CSE 271
// 4/16/2026
// A lab introducing the implementation of recursive functions being used on objects

public class RecursionLab {

	public String name;
	public double x;
	public int n;
	public int power;
	
	/**
	 * Workhorse constructor for an object
	 * @param name - name of the object
	 * @param x - some positive value, but a double
	 * @param n - some positive value
	 * @param power - some positive value used in the powerX function
	 */
	public RecursionLab(String name, double x, int n, int power) {
		this.setName(name);
		this.setX(x);
		this.setN(n);
		this.setPower(power);
	}
	
	/**
	 * Method that is actually called, but doesn't do the work
	 * @return - the calculated product found in the helper function
	 */
	public int multiplyGreater4() {
		return multiplying(n);
	}
	
	/**
	 * Calculated the product of all values in a int above 4
	 * @param n - the int being worked with
	 * @return - some int product of all values greater than 4 in in n back to the call function
	 */
	public int multiplying(int n) {
		if (n <= 0) {
			return 1;
		}
		if (n % 10 > 4) {
			return n % 10 * multiplying(n / 10);
		} else {
			return multiplying(n / 10);
		}
	}
	
	/**
	 * Method that is actually called, but doesn't do the work
	 * @return - the name of the object without "cse" substrings found by the helper function
	 */
	public String removeCse() {
		return removing(name);
	}
	
	/**
	 * Recursively goes through the name of the object and removes all "cse" substrings
	 * @param name - string being worked on
	 * @return - the name will all instances of "cse" removed back to the call function
	 */
	public String removing(String name) {
		int index = name.indexOf("cse");
		if (index == -1) {
			return name;
		}
		String update = name.substring(0, index) + name.substring(index + 3);
		return removing(update);
	}
	
	/**
	 * Method that is actually called, but doesn't do the work
	 * @return - returns the calculated result from the helper function
	 */
	public double powerX() {
		return exponenting(x, power);
	}
	
	/**
	 * Recursively calculates an objects x value raised to the power of its power value
	 * @param x - some positive value
	 * @param power - number that x is being raised to
	 * @return - returns the calculated result to the call function
	 */
	public double exponenting(double x, int power) {
		if (power <= 0) {
			return 1;
		}
		return x * exponenting(x, power - 1);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		if(x <= 0) {
			this.x = 0;
		} else {
			this.x = x;
		}
	}
	/**
	 * @return the n
	 */
	public int getN() {
		return n;
	}
	/**
	 * @param n the n to set
	 */
	public void setN(int n) {
		if (n <= 0) {
			this.n = 0;
		} else {
			this.n = n;
		}
	}
	/**
	 * @return the power
	 */
	public int getPower() {
		return power;
	}
	/**
	 * @param power the power to set
	 */
	public void setPower(int power) {
		if (power <= 0) {
			this.power = 0;
		} else {
			this.power = power;
		}
	}
	
	
}
