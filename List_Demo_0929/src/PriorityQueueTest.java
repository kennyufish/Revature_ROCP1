import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		//add items
		pQueue.add(1);
		pQueue.add(2);
		pQueue.add(10);
		pQueue.add(99);
		
		//print
		System.out.println(pQueue.toString());
		System.out.println(pQueue.peek()); // top element
		System.out.println(pQueue.poll()); //top and remove it 
		System.out.println(pQueue);
		//First-in-first-out
		//comparator-priority
		
		//clear
		pQueue.clear();
		System.out.println(pQueue);
	}

}
