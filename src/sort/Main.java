package sort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException{

		List<Map<String, Object>> maps = new ArrayList<Map<String,Object>>();
		
		Map<String, Object> t1 = new HashMap<String, Object>();
		t1.put("TEST", 3);
		t1.put("Seq", 1);
		
		maps.add(t1);
		
		Map<String, Object> t2 = new HashMap<String, Object>();
		t2.put("TEST", 2);
		t2.put("Seq", 2);
		maps.add(t2);
		
		Map<String, Object> t3 = new HashMap<String, Object>();
		t3.put("TEST", 2);
		t3.put("Seq", 4);
		maps.add(t3);
		
		Map<String, Object> t4 = new HashMap<String, Object>();
		t4.put("TEST", 2);
		t4.put("Seq", 3);
		maps.add(t4);
		
		Map<String, Object> t5 = new HashMap<String, Object>();
		t5.put("TEST", 3);
		t5.put("Seq", 5);
		maps.add(t5);
		
		Map<String, Object> t6 = new HashMap<String, Object>();
		t6.put("TEST", 1);
		t6.put("Seq", 7);
		maps.add(t6);
		
		Map<String, Object> t7 = new HashMap<String, Object>();
		t7.put("TEST", 2);
		t7.put("Seq", 6);
		maps.add(t7);
		
		Map<String, Object> t8 = new HashMap<String, Object>();
		t8.put("TEST", 1);
		t8.put("Seq", 8);
		maps.add(t8);
		
		Map<String, Object> t9 = new HashMap<String, Object>();
		t9.put("TEST", 3);
		t9.put("Seq", 9);
		maps.add(t9);
		
		for(Map<String, Object> map : maps) {
			String t= map.get("TEST").toString();
			int s = Integer.parseInt(map.get("Seq").toString());
			
			System.out.println("========BEFORe===========");
			System.out.println("Test : [" + t + "] / "+"Seq : ["+ s  + "]/"  );
			System.out.println("========================");
			
		}
		
		
		Collections.sort(maps, new SortMember());
		
		for(Map<String, Object> map : maps) {
			String t= map.get("TEST").toString();
			int s = Integer.parseInt(map.get("Seq").toString());
			
			System.out.println("========After===========");
			System.out.println("Test : [" + t + "] / "+"Seq : ["+ s  + "]/"  );
			System.out.println("========================");
			
		}
		
		
	}
}
