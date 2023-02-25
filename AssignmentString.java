
import java.util.Scanner;


class Questions{
	void Que1() {
		//  Write a simple String program to take input from user.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name.");
		String name = sc.nextLine();
		System.out.println("Your name is "+name);
	}
	void Que2() {
		// How do you concatenate two strings in Java ? Give an example?
		
		// first method using concat() mrthod :-
		String s1 = "Akram";
		String s2 = "Ansari";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		// second method using + operator :-
		String str1 = "Pw";
		String str2 = "Skills";
		String str3 = "Java";
		String str4 = str1 + str2 + str3;
		System.out.println(str4);
		
	}
	void Que3() {
		// How do you find the length of a string in Java Explain with an example.
		String s1 = "Akram Ansari";
		System.out.println(s1.length());
	}
	void Que4() {
		// How do you compare two strings in java? Give an example.
		
		// first using == operator
		String s1 = "Akram";
		String s2 = "Akram";
		System.out.println(s1==s2);
		
		// second using equals() method
		String str1 = new String("Pw");
		String str2 = new String("Pw");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
	}
	
	void Que5() {
		// Write a program to find the length of the string "refrigerator".
		String s1 = "refrigerator";
		System.out.println(s1.length());
	}
	void Que6() {
		// Write a program to check if the letter 'e' is present in the 'Umbrella'.
		String s1 = "Umbrella";
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) == 'e') {
				System.out.println("e is present...!");
				break;
			}
		}
	}
	void Que7() {
		// Write a program to delete all consonants from the string "Hello, have a good day."
		String s1 = "Hello, have a good day.";
		String s2 = s1.replaceAll("([b,c,d,f,g,h,j,k,l,m,n,p,q,r,s,t,v,w,x,y,z,B,C,D,F,G,H,J,K,L,M,N,P,Q,R,S,T,V,W,X,Y,Z])", "");
		System.out.println(s2);
		
	}
}


public class AssignmentString {

	public static void main(String[] args) {
		
		Questions obj = new Questions();
		System.out.println("Question 1 : ");
		obj.Que1();
		
		System.out.println();
		
		System.out.println("Question 2 : ");
		obj.Que2();
		
		System.out.println();
		
		System.out.println("Question 3 : ");
		obj.Que3();
		
		System.out.println();
		
		System.out.println("Question 4 : ");
		obj.Que4();
		
		System.out.println();
		
		System.out.println("Question 5 : ");
		obj.Que5();
		
		System.out.println();
		
		System.out.println("Question 6 : ");
		obj.Que6();
		
		System.out.println();
		
		System.out.println("Question 7 : ");
		obj.Que7();

	}

}
