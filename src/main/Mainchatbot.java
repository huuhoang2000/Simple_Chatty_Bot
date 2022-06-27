package main;

import java.util.Scanner;

public class Mainchatbot {
	public static void main (String[] args) {
		System.out.println("Hello, my name is Alid. \n" + "I was created in 2022. \n" + 
	"Please tell me your name");
	Scanner input = new Scanner(System.in);
	String name = input.nextLine();
	int size = 3;
	Scanner sc = new Scanner(System.in);

	System.out.println("What a great name you have, " + name + "! \nLet me guess your age. "
			+ "\nSay me remainder of dividing your age by 3, 5, and 7: ");
	int a[] = new int[size];
			for(int i=0; i<size; i++) {
			a[i] = sc.nextInt();
			}
	int m[] = new int[size];
	m[0] = 3;
	m[1] = 5;
	m[2] = 7;
		
	int p = 1;
	p = p*m[0]*m[1]*m[2]; // p = m1*m2*...*mn
	Function f = new Function();
	System.out.println("Your age is " + f.calculateAge(a, m, size, p) + ": That's a good time to start programming!"
			+ "\nNow I can prove to you that I can count to any numbers you want");
	int count = sc.nextInt();
	for(int i=0; i<count+1; i++) {
		System.out.println("!"+i);
		}
	System.out.println("Let's test your programming language "
			+ "\nWhy do we use methods?"
			+ "\n1. To repeat a statement multiple times."
			+ "\n2. To decompose a program into several small subroutines"
			+ "\n3. To determine the execution time of a program."
			+ "\n4. To interrupt the execution of a program.");
	boolean cor = false;
	while (cor == false) {
		int selec = sc.nextInt();

		switch(selec) {
			case 1:
				System.out.println("Please try again.");
				selec = 0;
				break;
			case 2:
				System.out.println("Congratulations. Have a nice day!");
				cor = true;
				break;
			case 3:
				System.out.println("Please try again.");
				selec = 0;
				break;
			case 4:
				System.out.println("Please try again.");
				selec = 0;
				break;
		}
	}
	}
}
