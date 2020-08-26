package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
	public static void main(String[] args) {
		String number=JOptionPane.showInputDialog("choose a number?");
		int num=Integer.parseInt(number);
		for(int h=2;h<num;h++) {
			if(num%h==0) {
				JOptionPane.showMessageDialog(null,"It is not a prime number");
				System.exit(0);
			}
			
		}
		JOptionPane.showMessageDialog(null,"It is a prime number");
		
		
		
		
		
		
		
		
		
		
		
	}

}
