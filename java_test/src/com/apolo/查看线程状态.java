package java1000例;

class ThreadState implements Runnable{
	public synchronized void waitForASecond() throws InterruptedException{
		wait(500);
	}
	
	public synchronized void waitForYears() throws InterruptedException{
		wait();
	}
	
	public synchronized void notifyNow() throws InterruptedException{
		notify();
	}
	@Override
	public void run(){
		try{
			waitForASecond();
			waitForYears();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

public class 查看线程状态 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadState state = new ThreadState();
		Thread thread = new Thread(state);
		System.out.println("创建新进程"+ thread.getState());
		thread.start();
		System.out.println("启动进程"+ thread.getState());
		Thread.sleep(1000);
		System.out.println("等待线程"+ thread.getState());
		state.notifyNow();
		System.out.println("唤醒进程"+ thread.getState());
		Thread.sleep(1000);
		System.out.println("线程结束"+ thread.getState());
		
		
		
		
	}

}
