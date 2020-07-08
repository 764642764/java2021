package java2021;

public class B {
    public static void main(String[] args)
    {
    	Thread t1=new MyThread("线程1");
    	Thread t2=new MyThread("线程2");
    	t1.start();
    	t2.start();
    }
}
class MyThread extends Thread
{
	public MyThread(String name)
	{
		super (name);
	}
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.printf("%s执行第%d次\n",this.getName(),i);
			try
			{
				sleep(800);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
