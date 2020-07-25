package maven.happydays;

import java.util.*;

public class Main extends Estimation{
	
	Main(double a, int b) {
		super(a, b);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner v=new Scanner(System.in);
		
		System.out.println("Enter Your Choice Material:\n1.Standard\n2.Above standard\n3.High standard\n4.High Standard and Fully Automated");
		int choice=v.nextInt();
		System.out.println("Enter Area of house in sq.fts");
		double area=v.nextDouble();
		Main obj=new Main(area,choice);
		obj.Calculation();
		v.close();	
	}

}
