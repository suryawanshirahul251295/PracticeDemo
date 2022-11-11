
public interface interface1 {
	public void method1(); 
	  
    void method2(); 

    public static void method3() {
	 System.out.println("method3 calling");

}

       public default void method4() {
	   System.out.println("method4 calling");
}
       public static void main(String[] args) {
    	   method3();
	}
       
}
