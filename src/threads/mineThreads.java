package threads;

public class mineThreads extends Thread
{
	
	
	public void run() 
	{
		
		
		System.out.println("this thread is running");
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		
		
		
		
		mineThreads Athread= new mineThreads();
		Athread.start();
		
		
		
		
		
		

	}

}
