import java.util.Scanner;

public class SumValue {
	
	public static void main(String[] args) {
		long sum = 0l;
		
			
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("Enter Number for add or any word for exit : "); 
			if(sc.hasNextInt()){
				sum = sum + sc.nextInt();
			}
			else if (sc.hasNext()){ 
			 System.out.println(sum);
				break;	
			}
			
			
		System.out.println(sum);
	}
	}
}
