package com.tedu;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;
public class Jihe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(111);
		System.out.println(222);
		System.out.println(333);
	
        ArrayList<Object> al = new ArrayList<>();
        al.add(2);
        al.add("aa");
        al.add(4);
        al.add(6);
        System.out.println(al);
        Iterator<Object> it = al.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(3);
        ll.add(6);
        ll.add(9);
        ll.add(4);
        ll.addFirst(111);
        ll.addLast(999);
        System.out.println(ll);
        Iterator<Object> it2 = ll.iterator();
        while(it2.hasNext()) {
        	System.out.println(it2.next());
        }
        
        HashSet<Object> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("aaa");
        System.out.println(set);
        Iterator<Object> it3 = set.iterator();
        while(it3.hasNext()) {
        	System.out.println(it3.next());
        }
        
        
        
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(1, "peiqi");
        map.put(1, "xiaozhu");
        map.put(2, "peiqi");
     for (Entry<Integer, Object> entry : map.entrySet()) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
     
    for (Integer object : map.keySet()) {
		System.out.println(object);
	}
     
    
    for (Object object : map.values()) {
		System.out.println(object);
	}
     
	}
	@Test
	public void aa() {}

}
