package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class ArraylistDemo {

	public static void main(String[] args) {
		//ArrayList<String> list= new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		list.add("Jannat");
		list.add("jahan");
		list.add("mannat");
		
		//System.out.println(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
