package myseventhpackage;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class CodesnippetQ4 {

	  public static void main(String[] args)
	  {
			TreeMap<Integer,Object> sampleMap = new TreeMap<Integer, Object>();
			sampleMap.put(1, null); 
			sampleMap.put(5, null); 
			sampleMap.put(3, null); 
			sampleMap.put(2, null); 
			sampleMap.put(4, null); 
	 
	       System.out.println(sampleMap);
	   }
}
//{1=null, 2=null, 3=null, 4=null, 5=null}