package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linklistdemo {
	public static void main(String[] args) {
		LinkedList <String> list= new LinkedList<String>();
	    list.add("maar");
	    list.add("Khaogi");
	    list.add("ya");
	    list.add("bhaat");
	    //System.out.println(list);
	    /*Iterator itr = list.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }*/
	    
	    for (String obj:list)
	    {
	    	System.out.println(obj);
	    }
	}

}
