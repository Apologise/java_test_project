package java1000��;

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

public class �鿴�߳�״̬ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadState state = new ThreadState();
		Thread thread = new Thread(state);
		System.out.println("�����½���"+ thread.getState());
		thread.start();
		System.out.println("��������"+ thread.getState());
		Thread.sleep(1000);
		System.out.println("�ȴ��߳�"+ thread.getState());
		state.notifyNow();
		System.out.println("���ѽ���"+ thread.getState());
		Thread.sleep(1000);
		System.out.println("�߳̽���"+ thread.getState());
		
		
		
		
	}

}
