package upcastingConcept;

public class classupcasting implements Intrefaceupcasting {
        
	public void method3() {
        	System.out.println("method3 calling");
        }
        
        public void method4() {
        	System.out.println("method4 calling");
        }
        
        public classupcasting() {
        	
        }

		
		public void method1() {
			
			System.out.println("method1 calling");
		}

	
		public void method2() {
			
			System.out.println("method2 calling");
		}



        public static void main(String[] args) {
	
       Intrefaceupcasting x = new classupcasting();
        
       x.method1();
       x.method2();
       
       classupcasting y = new classupcasting();
       
       
       y.method3();
       y.method4();
}


		
			
		
}
