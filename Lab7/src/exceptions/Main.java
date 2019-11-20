package exceptions;

public class Main{
	
  public static void main(String[] args) {
	     FirstTestingExceptionDemo sed = 
	      new FirstTestingExceptionDemo();
	    try {
	      sed.f();
	    } catch(FirstTestingException NieDzialam) {
	      System.err.println(NieDzialam);
	    }
  }
}
