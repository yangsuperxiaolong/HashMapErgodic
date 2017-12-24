package cn.basickno;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestTraversal {
	public static void main(String[] args){
		Map<Integer,String> m1= new HashMap<Integer,String>();
		m1.put(1, "yang");
		m1.put(2, "wen");
		m1.put(3, "long");
		System.out.println("第一种：");
		for(Entry<Integer,String> mobj : m1.entrySet()){
			System.out.println(mobj.getKey()+"-"+mobj.getValue());
		}
		System.out.println("第二种：");
		for(Integer i :m1.keySet()){
			System.out.println(i+"-"+m1.get(i));
		}
		System.out.println("第三种：");
		Iterator<Map.Entry<Integer, String>> it =m1.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer,String> mobj=it.next();
			System.out.println(mobj.getKey()+"-"+mobj.getValue());
		}
	}
}
