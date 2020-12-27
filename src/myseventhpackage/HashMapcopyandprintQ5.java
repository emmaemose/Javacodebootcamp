package myseventhpackage;
import java.util.HashMap;


public class HashMapcopyandprintQ5 {

	public static void main(String[] args) {
	 HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	 hmap.put(1, "maths");
     hmap.put(2, "english");
     hmap.put(5, "computer");
     hmap.put(4, "art");
     hmap.put(3, "biology");
//Create a new haspmap with it's own content
     HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
     hmap2.put(7, "Geography");
     hmap2.put(8, "French");
        
//Clone the object hmap into another object
     hmap2.putAll(hmap);
     
     System.out.println("Here are the total number of subjects:" + hmap2);	
	}
}
