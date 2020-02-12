package sort;
import java.util.Comparator;
import java.util.Map;

public class SortMember implements Comparator<Map<String,Object>>{

	@Override
	public int compare(Map<String, Object> o1, Map<String, Object> o2) {
		
		int o1Grv = Integer.parseInt(o1.get("TEST").toString());
		int o2Grv = Integer.parseInt(o2.get("TEST").toString());
		
		int o1Seq = Integer.parseInt(o1.get("Seq").toString());
		int o2Seq = Integer.parseInt(o2.get("Seq").toString());
		
		if(o1Grv == o2Grv && o1Seq > o2Seq) {
			return 1;
		}else if(o1Grv > o2Grv) {
			return 1;
		}
		
		System.out.println("why");
		System.out.println(o1Grv + " : " +o2Grv);
		System.out.println(o1Seq + " : " +o2Seq);
		
		return -1;
	}

}
