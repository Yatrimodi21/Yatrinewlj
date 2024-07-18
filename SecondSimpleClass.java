package secondproject;

import java.util.Scanner;

public class SecondSimpleClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int percentage=sc.nextInt();
		if (percentage>=90) {
			System.out.println("A");
		}
		else if(percentage>=70 && percentage<=80) {
			System.out.println("B");
			}
		else if (percentage>=60) {
			System.out.println("c");
		}
		else {
			System.out.println("Fail");
		}
	}

}
