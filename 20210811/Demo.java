//1.
public class Demo{

// 3.1
int age=0;



	// 2.
	public static void main(String[] args){
		
		System.out.println("Hi from Method");
		
		//3.2
		float height = 5.3f;
		
		
		
		Demo d = new Demo();
		
		d.printNameMultiplyer(20);
		
		System.out.println("Age and Hight values are "+d.age+ " : "+height);
		
	}


	 
	//2.
	public void printNameMultiplyer(int numberOfIteration){
		
		//4.1
		for(int i=1; i<=numberOfIteration; i++){
			System.out.println("Hare Krishna...");
			System.out.println(i);
		}
		
		//4.2
		int increament=0;
		while( 0 < numberOfIteration ){
			System.out.println("Hare Rama...");
			if(increament == numberOfIteration){
				break;
			}
			increament++;
		}

	}
	
}