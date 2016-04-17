package assignment12;

public class Main {
	public static void main(String[] args) {
		Class01 class01 = new Class01();
		String numberString;
		int digit01 = 0;
		int digit02 = 0;
		int digit03 = 0;
		int digit04 = 0;
		
		int number = 0;
		int finalNumber = 0;
		
		for (int i = 1000; i < 10000; i++){
			numberString = new Integer(i).toString();
			digit01 = Character.getNumericValue(numberString.charAt(0));
			digit02 = Character.getNumericValue(numberString.charAt(1));
			digit03 = Character.getNumericValue(numberString.charAt(2));
			digit04 = Character.getNumericValue(numberString.charAt(3));
			
			digit01 = class01.toTheFourth(digit01);
			digit02 = class01.toTheFourth(digit02);
			digit03 = class01.toTheFourth(digit03);
			digit04 = class01.toTheFourth(digit04);
			
			number = digit01 + digit02 + digit03 + digit04;
			if (Integer.parseInt(numberString) == number){
				System.out.println(numberString);
				finalNumber = finalNumber + number;
			}
		}
		System.out.println(finalNumber);
	}
}
