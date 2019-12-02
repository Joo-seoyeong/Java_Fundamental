package java_20191202;

public class SynchronizedDemo implements Runnable{
	int x;
	int y;
	@Override
	public  synchronized void run() {
		// TODO Auto-generated method stub
		for (int i = 0 ; i <1000; i++){
			x++;
			y++;
			String threadName = Thread.currentThread().getName();
			System.out.printf("x : %d, y : %d - %s%n",x,y,threadName);
		}
	}
	
	public static void main(String[] args){
		SynchronizedDemo s1 = new SynchronizedDemo();
		SynchronizedDemo s2 = new SynchronizedDemo();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1); // 두 thread가 같은 객체를 공유할때 
									//synchronized(한 thread가 들어왓을때 제어권을 뺏기지않음) 가능
		// 1000번째까지 첫번째 thread 찍고 그 다음 1000번은 두번째 thread 찍기
		// thread가 instance변수를 공유할 경우에 문제 발생 
		//t1.start();
		//t2.start();
		
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new Thread(s1).start();
		}

	}

}












