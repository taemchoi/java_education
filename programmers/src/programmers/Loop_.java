package programmers;
import java.util.Scanner;

public class Loop_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WHILE ��
		int i = 0;
		while(i<10) {
			i++; // i+=1
			System.out.println(i);
		}
		
		// DO WHILE �� 
		int value = 0;
		Scanner scan = new Scanner(System.in);
		do {
			value = scan.nextInt();
			System.out.println(value);
		}while(value != 10);
		
		// for ��
		int total = 0;
		for (int j =1; j<=100; j++) {
			if(j%5==0) {
				System.out.println(j);
				total += 5;}
		}
		System.out.println(total);
		
		
	}

}
