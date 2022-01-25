import java.util.Scanner;

public class SwitchCalcApp {

	int a;
	int b;
	static Scanner sc = new Scanner(System.in);
	
	void add() {
	
	{System.out.println("Enter a");
	a=sc.nextInt();
	System.out.println("Enter b");
	b=sc.nextInt();
	Int result=a+b;
	System.out.println("Addition: "+result);
	}
	
	void sub() {
	System.out.println("Enter a");
	a=sc.nextInt();
	System.out.println("Enter b");
	b=sc.nextInt();
	result=a-b;
	System.out.println("subs: "+result);
	}
	
	void mul() {
	System.out.println("Enter a");
	a=sc.nextInt();
	System.out.println("Enter b");
	b=sc.nextInt();
	result=a*b;
	System.out.println("Mul: "+result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CalculateEx demo=new CalculateEx();
		while(true)
System.out.println("         ADD           ");
System.out.println("         SUB           ");
System.out.println("         MUL           ");
System.out.println("         EXIT          ");
System.out.println("***********************");
System.out.println("Enter a choice" );
int choice=sc.nextInt();
switch(choice)
{
	case 1:
		demo.add();
		
		break;
		
	case 2:
		demo.sub();
		
	break;
	
	case 3:
		demo.mul();
		
		break;
		System.out.println("Thanks for using app");
		System.exit(0);
		default:
			System.out.println("Choose 1 to 5 between");
}


	}

}
