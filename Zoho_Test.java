import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		//Print "WELCOME" as "COMEWEL"
		System.out.println("Enter a string to start:");
		Scanner scanner = new Scanner(System.in);
		String test = scanner.next();
		int length = test.length();
		int middle = length/2;
		char charArray[] = new char[length];
		int counter = 0;
		for(int i=middle; i<length;i++){
		    charArray[counter] = test.charAt(i);
		    counter++;
		}
		for(int j=0;j<middle;j++){
		    charArray[counter] = test.charAt(j);
		    counter++;
		}
		//System.out.println(charArray);
		for(int i=0; i<test.length();i++){
		    counter = 0;
		    for(int j=0; j<test.length();j++){
		        if(j<length-1)
		            System.out.print(" ");
		        if(j>=length-1)
		            System.out.print(charArray[counter++]);
		    }
		   length--; 
		   System.out.println();
		}
	}
}
