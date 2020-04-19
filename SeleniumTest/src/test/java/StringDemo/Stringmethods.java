package StringDemo;

public class Stringmethods {

	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String ("Sachin");
		String s4 = "SACHIN";
		String s5 = "Tendulkar";
		String s6 = "Ratan";
		String s7 = s1.concat(s5);
		String s8 = s7.concat(s6);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1==s3);
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s5));
		System.out.println(s2.compareTo(s6));
		System.out.println(s7);
		System.out.println(s8);
		
	}
}
