package _01_algorithms._1_prime_or_not;

public class fibonacci {
public static void main(String[] args) {
	int number1=0;
	int number2=1;
	int sum=1;
	for(int h=0;h<10;h++) {
		sum=number1+number2;
		number1=number2;
		number2=sum;
		System.out.println(sum);
	}
}
}
