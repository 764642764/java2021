package java2021;

public class C {
   public static void main(String[] args)
   {
	   Runnable r=new TicketThread();
	   Thread t1=new Thread(r,"张先生");
	   Thread t2=new Thread(r,"李先生");
	   t1.start();
	   t2.start();	   
   }
}
class TicketThread implements Runnable
{
	int fiveCount=2;
	int twentyCount=0;
	public void run()
	{
		if(Thread.currentThread().getName().indexOf("张先生")>=0)
		{
			SaleTicket(20);
		}
		else if (Thread.currentThread().getName().indexOf("李先生")>=0)
		{
			SaleTicket(5);
		}
	}
	synchronized void SaleTicket(int money)
	{
		if(money==5)
		{
			System.out.println(Thread.currentThread().getName()+",给您票");
			fiveCount++;
		}else if(money==20)
		{
			while (fiveCount<3)
			{
				System.out.println(Thread.currentThread().getName()+",现在零钱不够，请等待");
				try
				{
					wait();
				}catch(InterruptedException e)
				{
					
				}
			}
			System.out.println(Thread.currentThread().getName()+"找您15元，给您票");
			fiveCount-=3;
			twentyCount++;
		}
		notifyAll();
	}
}
