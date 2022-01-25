package jan24;

import java.util.Scanner;

public class BMI {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner rbs = new Scanner (System.in);
		System.out.println("Enter weight in lbs");
		System.out.println("Enter height in inch");
		double weight = rbs.nextDouble();
		double height = rbs.nextDouble();
		//BMI=weight/height*703
		double BMI = (( weight / height) * 703);
		System.out.println("BMI:" + BMI);
		rbs.close();
		
	}

}
