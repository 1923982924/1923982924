import java.math.BigInteger;


public class Test1 implements C{

	public static void main(String[] args){
		/*new Thread(new Runnable(){  
            public void run(){  
            	System.out.println("start...");
            }}).start();*/  
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("I am new brach");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
}
interface A{
	void test();
} 
interface B{
	void test1();
}
interface C extends A,B{
	void test2();
}