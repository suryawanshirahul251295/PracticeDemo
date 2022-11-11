package oppsConcept;



class B extends classR
{
	
	static void rahul() {
		int a= 100;	
	
	System.out.println(a);
}
	
	public static void main(String[] args) {
		   B.rahul();
	}
}
public class R
{
	
	public static void method1() {
		System.out.println("overriding");
	}
	
       public static void main(String[] args) {
		
    	
    	   method1();
    	   
    	  classR Y= new classR();
    	  Y.method1();
       }
}
