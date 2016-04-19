//Bryan Racic
//4/19/16
//1045C
//Project Euler problem 30
package assignment12;

public class Main {
	public static void main(String[] args) {
		
		Class01 class01 = new Class01();
		int digit01, digit02, digit03, digit04, digit05, digit06 = 0;
			//Declare and instantiate all digits on one line instead of 6
		int testNum = 0;
		int finalNum = 0;
		
		for (int i = 2; i < 1000000;i++){
			digit01 = i - ((i / 10) * 10);
			digit02 = (i / 10) % 10;
			digit03 = ((i / 10) / 10) % 10;
			digit04 = (((i / 10) / 10) / 10) % 10;
			digit05 = ((((i / 10) / 10) / 10) /10) % 10;
			digit06 = (((((i / 10) / 10) / 10) /10) / 10) % 10;

			testNum = class01.toTheFifth(digit01) + class01.toTheFifth(digit02) + class01.toTheFifth(digit03) + class01.toTheFifth(digit04) + class01.toTheFifth(digit05) + class01.toTheFifth(digit06);
			
			if (i == testNum){
				finalNum = finalNum + testNum;
			}
		}
		System.out.println(finalNum);
	}
}
