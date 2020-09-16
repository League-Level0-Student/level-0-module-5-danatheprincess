package _02_nested_loops._3_for_loop_gauntlet;

public class Forloopgauntlet {
	public static void main(String[] args) {
	 
		for(int n=0;n<101;n++) {
			System.out.println(n);
		}
		for(int n=100;n>=0;n--) {
			System.out.println(n);
		}
		for(int n=2;n<101;n+=2) {
			System.out.println(n);
		}
		for(int n=1;n<100;n++) {
			if(n%2==1) {
				System.out.println(n);
			}
		}
		for(int i=1;i<501;i++) {
			if(i%2==0) {
				System.out.println(i+ " is even");
			}else {
				System.out.println(i+ " is odd");
			}
			
		}
		for(int w=7;w<=777;w++) {
			if(w%7==0) {
				System.out.println(w);
			}
		}
		for(int w=2007;w<2021;w++) {
			
			int age=w-2007;
			System.out.println("In "+w+ " i was" +age+ "years old");
		
		}
		for(int r=0;r<3;r++) {
			for(int u =0;u<3;u++) {
				System.out.println(r+" "+u);
			}
		} 
		//for(int s=1;s<)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
