package exception;

public class ExceptionDriver {
	public static void main(String[] args) {
		int age = 18;
	    char gender = 'T';
	    String name = "vairam";
	    
	    try {
	        if (age < 18) {
	            throw new AgeException();
	        }
	        if(gender!='M' || gender!='F') {
	        	throw new GenderException();
	        }
	        if(!(name.equals("vairam"))) {
	        	throw new TylerException();
	        }
	    } catch (AgeException e) {
	        System.err.println(e.getMessage());
	    }
	    catch(GenderException e) {
	    	e.printStackTrace();
	    }
	    catch(TylerException e) {
	    	System.err.println(e.getMessage());
	    }
	    
	    
	    

	}
	
	
}
