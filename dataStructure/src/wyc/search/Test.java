package wyc.search;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * 测试一下 
 * @author 王以诚
 */
public class Test {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("aaa");
		set.size();
		set.clear();

		HashSet set2 = new HashSet();
		set2.add("abc");
		set2.size();
		set2.clear();
		set2.isEmpty();

		HashMap map = new HashMap();
		map.put("cn", "China");
		map.put("us", "USA");
		map.put("us", "America");
		map.get("cn");
	}
	
}
