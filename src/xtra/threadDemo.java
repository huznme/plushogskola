package xtra;

public class threadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t  = Thread.currentThread();
		System.out.println(t.getName());
		
		t.setName("my new name");
		System.out.println(t.getName());
		
		try
		{
			for(int x=5;x>0;x--)
			{System.out.println( x);
			
			Thread.sleep(2000);
				
			}
			
		}catch(Exception e)
		{
			
		}
	}

}
