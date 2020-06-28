package java2021;

public class zuoye628 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "+++ 多线程+++");
		}
		
	}

	public static void main(String[] args) {
		zuoye628 thread = new zuoye628();
		One one = new One();
		one.start();
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "---主线程---");
		}
	}
}
class One extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+"aling***");
		}
	}
}