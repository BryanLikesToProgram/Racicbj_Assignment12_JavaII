//Bryan Racic
//4/19/16
//1045C
//Project Euler problem 30
package assignment12;

public class Class01 {
	/**
	 * given number to the fifth power (seems more efficient than using Math.pow)
	 * @param x: number given
	 * @return number to the fifth
	 */
	public int toTheFifth(int x){
		x = x * x * x *x * x;
		return x;
	}
	/**
	 * given number to the fourth power (seems more efficient than using Math.pow)
	 * @param x: number given
	 * @return number to the fourth
	 */
	public int toTheFourth(int x){
		x = x * x * x *x;
		return x;
	}
}
