package exceptions;

public class someexceptions {

	public static void dividebyzero() {

		int res = 10 / 0;

	}
	
	
	

	public static void main(String[] args) {
		
		
		// ArithmeticException exception
		try 
		{
			dividebyzero();
			
			
		}
		catch (ArithmeticException e)
		{
			
			System.out.println("the is the result of dividing by zero : "+ e.getMessage());
			
		}
		
		
		
		
		//class not found exception
		try 
		{
			Class.forName("FindMissingClass");
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
			
		}
		
		
		
		
		
		System.out.println(" this will run after the exception ");
		
		

	}

}
