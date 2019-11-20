package exceptions;

class FirstTestingException extends Exception {
	String msg;
	public FirstTestingException(String msg) {
		super(msg.toUpperCase());
		this.msg=msg;
	}
}

public class FirstTestingExceptionDemo {
	public void f() throws FirstTestingException {
		System.out.println("Testing first exception");
	throw new FirstTestingException ("Test Error Message");
	}
}
