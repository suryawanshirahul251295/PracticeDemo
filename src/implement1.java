import basicInterface.impleclass;
import basicInterface.interfacemethod;

public class implement1 implements interface1 {
	
		@Override
		public void method1() {
			// TODO Auto-generated method stub
			System.out.println("method1 calling");
		}

		@Override
		public void method2() {
			// TODO Auto-generated method stub
			System.out.println("method2 calling");
		}
		
		public static void main(String[] args) {
			impleclass x = new impleclass();
			 x.method1();
			 x.method2();
			 interfacemethod.method3();
		        x.method4();
			 
		}
}
