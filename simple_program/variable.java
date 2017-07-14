//import java.util.Scanner;

class variable{
	public static void main(String args[]){
		double tuna;
		tuna = 5.28;
		System.out.println(tuna+4);
		
		//Scanner a = new Scanner(System.in);
		//System.out.println(a.nextLine());

		java.util.Scanner a = new java.util.Scanner(System.in);
		tuna = a.nextDouble();

		System.out.println(tuna);

		multiple_classes obj1 = new multiple_classes();
		obj1.simplemessage();
	}


}
