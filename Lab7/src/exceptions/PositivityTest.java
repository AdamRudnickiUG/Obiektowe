package exceptions;

class PositivityTest extends Exception {
	//String msg;
	public getValue(int number) {
		//super(msg.toUpperCase());
		this.numbder=number;
	//}
}

//public class FirstTestingExceptionDemo {
public class PositivityTest {
	public void f() throws FirstTestingException {
		System.out.println("Testing first exception");
	throw new FirstTestingException ("Test Error Message");
	}
}
