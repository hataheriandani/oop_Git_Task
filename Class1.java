package madool2;
//This is an example of group coding
import java.util.Scanner;




 
public class Class1 {

	public static void result(String sub,int temp) {
		//Finland is a cold country
		if (sub.equals("human")){
			if(temp>35) {
				
				System.out.println("The subject has a fever");	}
			else {
				System.out.println("The subject has no fever");
			}
		}
		if (sub.equals("dog")){
			if(temp>39) {
				
				System.out.println("The subject has a fever");	}
			else {
				System.out.println("The subject has no fever");
			}
		}
		if (sub.equals("horse")){
			if(temp>38) {
				
				System.out.println("The subject has a fever");		}
			else {
				System.out.println("The subject has no fever");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int my_temp = 40;
	//	fever("horse ",my_temp);
		System.out.println("Fever limits");
		System.out.println("- human 35");
		System.out.println("- dag 39");
		System.out.println("- horse 38");
		 Scanner ss = new Scanner(System.in);
		 System.out.println("Subject:");
		 String sub = sc.nextLine();
		 Scanner ss= new Scanner (System.in);
		 System.out.println("tempereture:");
		 int a = ss.nextInt();
		
		result.ss(sub,a);
	}
}


