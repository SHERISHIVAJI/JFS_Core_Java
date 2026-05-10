package myPackage2;
import myPackage1.A;

public class B {
	public static void main(String[] args) {
		System.out.println("Main class Started Here!!");
		A a = new A();
		a.num = 25;
		a.print();
		System.out.println("Main class Enderd Here!!");
	}
}
