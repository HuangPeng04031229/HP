package collection;

import java.awt.RenderingHints.Key;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Long, Integer> hMap=new HashMap<Long,Integer>();
		PrintStream out=System.out;
		hMap.put(15L, 115);
		hMap.put(16L, 116);
		hMap.put(17L, 117);
		hMap.put(18L, 118);
		hMap.put(19L, 119);
		out.println(hMap);
		Set<Map.Entry<Long, Integer>> hSetEntrys=hMap.entrySet();
		for (Entry<Long, Integer> entry : hSetEntrys) {
			out.println("entry :" + entry);
			out.println(entry.getKey()+"=" + entry.getValue());
			}
		out.println( "hMap.get(14) :"+hMap.get(14));
		out.println( "hMap.get(14L) :"+hMap.get(14L));
		out.println( "hMap.get(15L) :"+hMap.get(15L));
		out.println(hMap.keySet());
		
		out.println("out all key");
		for (Long key :hMap.keySet()) {
			out.println(key);
		}
		
		out.println("hMap.containsKey(14) :" + hMap.containsKey(14));
		out.println("hMap.containsKey(18L) :" + hMap.containsKey(18L));
		
		out.println("hMap.containsValue(115) :"+ hMap.containsValue(115));
		out.println("hMap.containsValue(200) :"+ hMap.containsValue(200));
		
		
		out.println("删除映射");
		out.println("hMap.isEmpty() :"+ hMap.isEmpty());
		hMap.remove(15L);
		out.println(hMap);
		out.println("out all key");
		for (Long key :hMap.keySet()) {
			out.println(key);
		}		
		hMap.replace(16L, 200);
		out.println(hMap);
		out.println("hMap.size :" + hMap.size());
		hMap.clear();
		out.println("hMap :" + hMap);
		
	}

}
