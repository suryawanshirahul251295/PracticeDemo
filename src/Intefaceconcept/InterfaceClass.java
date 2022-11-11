package Intefaceconcept;

public class InterfaceClass extends InterfaceClassA  implements Interface1,interface2{
         public void method1() {
        System.out.println("calling method1");	 
         }
        public void method2() {
             System.out.println("calling method2");	 
              }
//         public void method3() {
//             System.out.println("calling method3");	 
//              }
         public void method4() {
             System.out.println("calling method4");	 
              }
         
         public static void main(String[] args) {
        	 InterfaceClass x = new InterfaceClass();
        	 x.method1();
        	 x.method2();
        	 x.method3();
        	 x.method4();
        	 x.method5();
        	 
		}
}
