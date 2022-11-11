package oppsConcept;

public class Polymorphism {
   int  a = 100;
   int b = 200;
  
      public static void method1() {
    	  int  a = 100;
    	   int b = 200;
    	   int c = a+b;
    	  
    	  
    	  System.out.println(c);
    	  
      }
      
      public Polymorphism() {
    	  System.out.println(a);
    	  System.out.println(b);
      }
      
      
      public static void main(String[] args) {
		   method1();
		   Polymorphism y = new Polymorphism();  
	}
}
