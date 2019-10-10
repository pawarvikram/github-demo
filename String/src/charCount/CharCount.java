package charCount;

import java.util.HashMap;

public class CharCount {
	
	public static void char_Count(String inputstring) {
		HashMap<Character, Integer> countMap=new HashMap<Character, Integer>();
		
		char [] strArray = inputstring.toCharArray();
		
		for(char c : strArray) {
		    if(countMap.containsKey(c)){
		    	countMap.put(c, countMap.get(c)+1);
		    }else {
		    	countMap.put(c, 1);
		    }
		

         }
           System.out.println("characgter count"+countMap);
	}	
	
	public static void main(String args[]) {
		
		char_Count("Java J2EE Java JSP J2EE");
		

}
}