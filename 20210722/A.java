public class A{

public static void main(String args[]){
	C c = new C();
	c.printHelloFirst();
	c.printHelloSecond();
	c.printHelloThird();
	
	//B b = new B();
	B.printHello();
	
	A a= new A();
	a.printHello();
	
	// Hello From C
	// Hello From B
	// Hello From A

}

	public void printHello(){
		System.out.println("Hello From A");
	}
	
}


class B{
	//B.printHello();
	public static void printHello(){
		System.out.println("Hello From B");
	}
}


class C{
	// C c = new C(); c.printHello();
	public void printHelloFirst(){
		System.out.println("Hello From C_1");
	}
	public void printHelloSecond(){
		System.out.println("Hello From C_2");
	}
	public void printHelloThird(){
		System.out.println("Hello From C_3");
	}
}