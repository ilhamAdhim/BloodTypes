import java.util.Scanner;

class BloodType {

public static void main(String[] args) {	
		name();	
		inputname();

		do{			
		showbloodtype();
		System.out.println("What is your blood type?");
		KnowBloodtype();
		Clarification();
	}while (repeat());

 }
public static void name()
{
	System.out.println("Who are you ?");
}


public static void inputname()
 {
 	Scanner scan = new Scanner(System.in);

 	System.out.println(scan.nextLine() + ", welcome to bloodtype app!");
  }

public static void showbloodtype()
 {
	System.out.println("\t\tList of Blood Types");
	System.out.println("\t====================================");
	System.out.println("\t A \t\t [] \t\t O ");
	System.out.println("\t B \t\t [] \t\t AB");
	System.out.println("\t====================================");
 }

 static void KnowBloodtype(){

    System.out.print("\tLet me know your blood type\t: ");
    }	
    
 public static void Clarification()
 {Scanner scan = new Scanner(System.in);
 	System.out.println("Confirmed... your blood type is " + scan.nextLine());
 }

public static boolean repeat()
 {
 	System.out.println("Try again? " + "(Y/N)");
 	Scanner scan = new Scanner(System.in);
 	char repeat = scan.next().charAt(0);
 if (repeat == 'N') {
 		System.out.println("Good luck for your next project!");
	}
return repeat == 'Y';
 	}
 }