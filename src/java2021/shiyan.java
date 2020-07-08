package java2021;

public class shiyan {
	public static void main(String[] args)
	{
		MyThread t1=new MyThread("线程1");
		MyThread t2=new MyThread("线程2");
		t1.start();
		t2.start();
	}
}
class MyThread extends Thread
{
	public  MyThread (String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.printf("%s第%d次执行",this.getName(),i);
			try {
				sleep(800);
			}catch(InterruptedException e)
			{
				
			}
		}
	}
}

