package examples2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class PlayWithSets {

	public static void main(String[] args) {

		//hashset
		HashSet<String> hs = new HashSet<String>();
		hs.add("hey");
		hs.add("no way");
		//Traversing elements
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//LinkedHashSet -- same as above except it's keys are in the order given
		LinkedHashSet<String> lhs= new LinkedHashSet<String>();
		
		
		//Sorted Set interfaces
		
		//treeSets
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("k");
		ts.add("iowep");
		ts.add("iowep");
		ts.add("iowep");
		ts.add("iowep");
		ts.add("pweop");
		
		itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
