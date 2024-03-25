package OverLodingVSOverRiding;

class X
{
	public void f1(int x) {
		System.out.println("HIClass A");
	}
   
}
class Y extends X{
	
	
	public static void main(int x) {
		System.out.println("Class B");
	}
	
}

public class OverRiding {

	public static void main(String[] args) {
		X b=new X();
		Y a= new Y();
		X c= new Y();
		b.f1(10);
		a.f1(0);
		c.f1(0);
		

	}

}
