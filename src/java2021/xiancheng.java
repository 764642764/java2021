package java2021;

public class xiancheng {
     public static void main(String [] args)
     {
    	 Thread t=new processor();
    	 t.setName("t");
    	 t.start();
    	 for(int i=0;i<500;i++)
    	 {
    		 System.out.println(Thread.currentThread().getName()+"-->"+i);
    	 }
     }
}
class processor extends Thread 
{
	public void run()
	{
		for (int i=0;i<1000;i++)
		{
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			if(i%20==0)
			{
				Thread.yield();
			}
		}
	}
}