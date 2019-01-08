package chapterSeven;
import java.util.Scanner;
public class MetricConversion {

	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a measure");
	double number = 1;
	number = input.nextDouble();	
	
	System.out.println("1. Inches to Centimeters \t 5. Centimeters to Inches");
	System.out.println("2. Feet to Centimeters \t\t 6. Centimeters to Feet");
	System.out.println("3. Yards to Meters \t\t 7. Meters to Yards");
	System.out.println("4. Miles to Kilometers \t\t 8. Kilometers to Miles");
	
	int choice = input.nextInt();
	
	if(choice == 1) {
		inToCm(number);
	}else if(choice == 2){
		ftToCm(number);
	}else if(choice == 3){
		ydToM(number);
	}else if(choice == 4){
		milesToKm(number);	
	}else if(choice == 5){
		cmToIn(number);
	}else if(choice == 6){
		cmToFt(number);
	}else if(choice == 7){
		mToYd(number);
	}else{
		kmToMiles(number);
	}
}
	
	public static void inToCm(double number) {
		System.out.println("your conversion is :" + number * 2.54);
	}
	
	public static void ftToCm(double number) {
		System.out.println("your conversion is :" + number * 30);
	}
	public static void ydToM(double number) {
		System.out.println("your conversion is :" + number * 0.91);
	}
	public static void milesToKm(double number) {
		System.out.println("your conversion is :" + number * 1.6);
	}
	public static void cmToIn(double number) {
		System.out.println("your conversion is :" + number / 2.54);
	}
	public static void cmToFt(double number) {
		System.out.println("your conversion is :" + number / 30);
	}
	public static void mToYd(double number) {
		System.out.println("your conversion is :" + number / 0.91);
	}
	public static void kmToMiles(double number) {
		System.out.println("your conversion is :" + number / 1.6);

	}
	
	
}