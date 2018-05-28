import java.io.ObjectOutputStream.PutField;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class arryblockingqueue {
	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		ArrayBlockingQueue<stud> abq = new ArrayBlockingQueue<>(3);//capacity is mandatory
		
		
		stud s1 =new stud(1, "nilesh");
		stud s2 =new stud(2, "Ganesh");
		stud s3 =new stud(3, "Prasad");
		stud s4 =new stud(4, "rushi");
		stud s5 =new stud(5, "nilesh");
		stud s6 =new stud(5, "nil");
		//abq.remove();
		//abq.add(s1);
		//abq.add(s2);
		//abq.add(s3);
		//abq.add(s4);
		//abq.add(s5);
		//abq.add(s6);
		/*
		 * 	if queue is full add() method return--java.lang.IllegalStateException: Queue full
		 *  & if empty   remove() method return--java.util.NoSuchElementException  method provide Exception 
		 */
		
		 
//		System.out.println(abq.poll());
//		abq.offer(s1);
//		abq.offer(s2);
//		abq.offer(s3);
//		abq.offer(s4);
//		abq.offer(s5);
//		System.out.println(abq.offer(s6));		
//		System.out.println(abq);
//		System.out.println(abq.poll());
		/*
		 *  offer()--return true if the element was added to this queue, else false
		 * poll()--return the head of this queue, or null if this queue is empty
		 *
		 */
		
		
//			abq.take();
//			abq.put(s1);
//			abq.put(s2);
//			abq.put(s3);
//			System.out.println(abq.take());

		/* in try catch or throws InterruptedException 
		 * 	take()	
		 * 		Returns:the head of this queue
		 * 		Throws:InterruptedException - if interrupted while waiting
		 * 	put() void
		 * 		Inserts the specified element at the tail of this queue, waiting for space to become available if the queue is full.
		 * 		InterruptedException - if interrupted while waiting
		 * 		NullPointerException - if the specified element is null
		 * 
		 * */
		System.out.println(abq.poll(10, TimeUnit.SECONDS));
		System.out.println(abq.offer(s1, 10, TimeUnit.SECONDS));
		System.out.println(abq.offer(s2, 10, TimeUnit.SECONDS));
		System.out.println(abq.offer(s3, 10, TimeUnit.SECONDS));
		System.out.println(abq.offer(s1, 10, TimeUnit.SECONDS));
		System.out.println(abq.poll(10, TimeUnit.SECONDS));
/*
 * in try catch or throws InterruptedException 
 * poll(time,timeunit) Returns:the head of this queue, or null 
 * 						if the specified waiting time elapses before an element is available
 * 					   Throws:InterruptedException - if interrupted while waiting
 * offer()--Returns:true if successful, or false if the specified waiting time elapses before space is available
 * 			Throws:InterruptedException - if interrupted while waiting
 * 			NullPointerException - if the specified element is null
 * */
	}

}
class stud{
	int id;
	String nm;
	public stud(int id, String nm) {
		super();
		this.id = id;
		this.nm = nm;
	}
	@Override
	public String toString() {
		return "stud [id=" + id + ", nm=" + nm + "]";
	}
}