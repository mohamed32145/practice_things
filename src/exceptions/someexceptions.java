package exceptions;

public class someexceptions {

	public static void dividebyzero() {

		int res = 10 / 0;

	}
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		
		
		try 
		{
			dividebyzero();
			
			
		}
		catch (ArithmeticException e)
		{
			
			System.out.println("the is the result of dividing by zero : "+ e.getMessage());
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
