package com.lesson2;
import java.util.*;

public class Map7 
{
	public static void main(String[] args) {
	//Hashmap
	HashMap hm = new HashMap();
	
    hm.put("1","1");
    hm.put("2","SECOND");
    hm.put("3","THIRD");
	hm.put("4",null);
	hm.put(1, 23);
	hm.put(null,"FIFTH");
	
    System.out.println("hashmap is "+ hm);
    System.out.println("Value of 3 key: "+ hm.get("3"));
    System.out.println("Is HashMap empty? "+hm.isEmpty());
    
    hm.remove("2");
    System.out.println("After removal process, the hashmap is "+hm);
    System.out.println("Size of the HashMap: "+hm.size());
    
    System.out.println(hm.containsValue("FIFTH"));
    
    
    //Linkedhashmap
    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
    
    linkedHashMap.put(1, new String("Mphasis"));
    linkedHashMap.put(2, new String("Tcs"));
    linkedHashMap.put(3, new String("Cognizant"));
    linkedHashMap.put(4, new String("HCL"));
    linkedHashMap.put(5, new String("Wipro"));
    
    
    System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
    System.out.println("\nValues of map after iterating over it : ");
    
    for (Integer key : linkedHashMap.keySet()) {
        System.out.println(key + ":\t" + linkedHashMap.get(key));
    }
    
    System.out.println("\nThe size of the LinkedHashMap is : " + linkedHashMap.size());
    System.out.println("\nIs LinkedHashMap empty? : " + linkedHashMap.isEmpty());
    System.out.println("\nLinkedHashMap contains 2 as key? : " + linkedHashMap.containsKey(2));
    System.out.println("LinkedHashMap contains HCL as value? : " + linkedHashMap.containsValue("HCL"));
    System.out.println("\nRemove entry for key 3 : " + linkedHashMap.remove(3));
    System.out.println("Content of LinkedHashMap after removing key 2: " + linkedHashMap);
   
    linkedHashMap.clear();
    System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
    
    
    //Treemap
    TreeMap<String, Integer> marks = new TreeMap<String, Integer>();
    marks.put("Student1", 70);
    marks.put("Student5", 90);
    marks.put("Student6", 57);
    marks.put("Student2", 60);
    marks.put("Student3", 88);
    marks.put("Student4", 72);
    
    for(String key: marks.keySet()){
		System.out.println(key  +" : "+ marks.get(key));
    }
}
}
