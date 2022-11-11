package oppsConcept;

public class concreat extends Abstract
{
            
        	public void method3() {
            System.out.println("absract method");  
            
               }
               public static void main(String[] args) {
            	   concreat x = new concreat();
            	   x.method1();
            	   concreat.method2();
            	   x.method3();
			}
        	 
		}

