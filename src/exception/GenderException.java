package exception;

public class GenderException extends RuntimeException {
	
	public GenderException() {
		System.err.println("gender exception occured");
	}
	public void printStackTrace() {
		System.err.println("gender should be M or F");
	}
	
	

}
class AgeException extends RuntimeException{
	public AgeException() {
		super("exception");
		System.err.println("age exception occured");
	}
	public void printStackTrace() {
		System.err.println("age is less than 18");
	}
	
}
class TylerException extends RuntimeException{
	
	public TylerException() {
		System.err.println("tyler exception occured");
	}
	
	
}
