package tnsif.org.mapcollection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
//thread safe and synchronized\
public class HashTableExecutor {

	public static void main(String[] args) {
		Hashtable<String,String> hs=new Hashtable<>();
		hs.put("ark", "Ashutosh");
		hs.put("dar", "Darshan");
		hs.put("abhi", "Abhishek");
		hs.put("abhi", "Abhishek");
		System.out.println("Contain Ashutosh : "+hs.contains("Ashutosh"));
		System.out.println("Contain ark key : "+hs.containsKey("ark"));
		System.out.println("Contain Darshan value : "+hs.containsValue("Darshan"));
		hs.remove("ark");
//		hs.remove("ark", "Ashutosh");
		hs.replace("abhi", "Abhishek", "More");
		
		System.out.println("Get: "+ hs.get("dar"));
		
		
		System.out.println("---------------------------------->");
		System.out.println("Enumeration elements :");
		Enumeration<String> em=hs.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		System.out.println();
		System.out.println("Enumeration  :");
		Enumeration<String> em1=hs.keys();
		while(em1.hasMoreElements()) {
			String k=em1.nextElement();
			System.out.println(k+" : "+ hs.get(k));
		}
		
		System.out.println("---------------------------");
		System.out.println("EntrySet: ");
		System.out.println();
		Set<Entry<String,String>> s=hs.entrySet();
		Iterator<Entry<String,String>> it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
