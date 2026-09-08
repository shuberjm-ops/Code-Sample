
public class Tester {

	public static void main(String[] arg) {
		
		RecursionLab r1 = new RecursionLab("Hello", 2.5, 469378, 5);
		int m1 = r1.multiplyGreater4();
		System.out.println(m1);
		String c1 = r1.removeCse();
		System.out.println(c1);
		double e1 = r1.powerX();
		System.out.println(e1);
		
		RecursionLab r2 = new RecursionLab("Helcselo", 2.75, 469378115, 3);
		int m2 = r2.multiplyGreater4();
		System.out.println(m2);
		String c2 = r2.removeCse();
		System.out.println(c2);
		double e2 = r2.powerX();
		System.out.println(e2);
		
	}
	
}
