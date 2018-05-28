import java.util.concurrent.PriorityBlockingQueue;

class massage{
	private String msg;

	public massage(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
class Producer implements Runnable{
	PriorityBlockingQueue<massage> qmsg;

	public Producer(PriorityBlockingQueue<massage> qmsg) {
		super();
		this.qmsg = qmsg;
	}

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			massage msg = new massage(""+i);
			try {
				Thread.sleep(i);
				qmsg.put(msg);
				
			} catch (InterruptedException e) {
			e.printStackTrace();	// TODO: handle exception
			}
			massage msg1 = new massage("exit");
			try {
				qmsg.put(msg1);
			} catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
			}
		}
		
	}
}
class Consumer implements Runnable{
	
	PriorityBlockingQueue<massage> pbq;

	public Consumer(PriorityBlockingQueue<massage> pbq) {
		super();
		this.pbq = pbq;
	}

	@Override
	public void run() {
		massage msg ;
		try {
			while((msg=pbq.take()).getMsg()!="exit") {
				try {
					Thread.sleep(10);
					System.out.println("Consumed"+msg.getMsg());
				} catch (InterruptedException e) {
					e.printStackTrace();// TODO: handle exception
				}
				
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
public class produserconsumerproblem {

	public static void main(String[] args) {
		PriorityBlockingQueue<massage> msg =new PriorityBlockingQueue<massage>(10);
		Producer producer =new Producer(msg);
		Consumer consumer = new Consumer(msg);
		new Thread(producer).start();
		new Thread(consumer).start();
		System.out.println("produser and consumer has been started");
		// TODO Auto-generated method stub

	}

}
