
import java.util.Scanner;
class MyClass {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String Name="Name";
		int English,Maths,Science,Total;
		float Average;
		System.out.println("Enter the English, Maths, Science Marks=");
		English=s.nextInt();
		Maths=s.nextInt();
		Science=s.nextInt();
		Total=English+Maths+Science;
		Average=Total/3;
		if(Average>=60) {
			System.out.println("Passed in First Class");
		}
		else if(Average<60&&Average>=50) {
			System.out.println("Passed in Second class");
		}
		else if(Average<50&&Average>=35) {
			System.out.println("Passed in Third class");
		}
		else {
			System.out.println("Failed");
		}
	}

}
