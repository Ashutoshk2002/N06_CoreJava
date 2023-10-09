package tnsif.org.mapcollection;
import java.util.*;

public class TreeMapExecutor {
//sorting based on keys
	public static void main(String[] args) {

		TreeMap<String,String> tm=new TreeMap<>();
		tm.put("3", "Ashutosh");
		tm.put("2", "Darshan");
		tm.put("1", "Abhishek");
		
		System.out.println(tm);
	}

}
