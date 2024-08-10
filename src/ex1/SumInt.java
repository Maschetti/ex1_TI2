package ex1;
import java.util.*;

class SumInt {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		int num1, num2, sum;
		
		System.out.println("Digite um numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite outro numero: ");
		num2 = sc.nextInt();
		
		sum = num1 + num2;
		System.out.println("Sum: " + sum);
	}
}
