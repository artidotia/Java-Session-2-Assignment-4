import java.util.Scanner;


public class DaysInMonth {
	public static void main(String[] args) {
		int mnth, yr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month (in number): ");
		mnth = sc.nextInt();
		System.out.println("Enter year: ");
		yr = sc.nextInt();
		switch (mnth) {
		case 1: System.out.println("Month is January - 31 days");
				break;
		case 2: if (yr%4==0) 
					System.out.println("Month is February - 29 days");
				else System.out.println("Month is February - 28 days"); 
				break;
		case 3: System.out.println("Month is March - 31 days");
				break;
		case 4: System.out.println("Month is April - 30 days");
				break;
		case 5: System.out.println("Month is May - 31 days");
				break;
		case 6: System.out.println("Month is June - 30 days");
				break;
		case 7: System.out.println("Month is July - 31 days");
				break;
		case 8: System.out.println("Month is August - 31 days");
				break;
		case 9: System.out.println("Month is September - 30 days");
				break;
		case 10: System.out.println("Month is October - 31 days");
				break;
		case 11: System.out.println("Month is November - 30 days");
				break;
		case 12: System.out.println("Month is December - 31 days");
				break;
		default: System.out.println("Invalid Month");
		
		}//switch ends
		
	} //main ends

} // class ends
