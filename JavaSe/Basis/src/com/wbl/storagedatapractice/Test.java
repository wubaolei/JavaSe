package com.wbl.storagedatapractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test
{
	public static void main(String[] args)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("1", 2350);
		
		map.put("law", "路飞");
		
		map.put("草帽", true);
	
		// 获取单个键值
		System.out.println("单个键值为：" + map.get("1"));
		
		// 获取所有键值
		// 用 keySet() 方法获取键名
// 用 List 要转换
//		List list = (List) map.keySet();
		
//		Set keydata = map.keySet();
//		
//		Iterator it = keydata.iterator();
//		
//		while(it.hasNext())
//		{
//			Object key = it.next();
//			
//			System.out.println(key + "--对应--" + map.get(key));
//		}
		
		System.out.println("---------------");
		
		// 得到 键和值的试视图
		Set entryKeys = map.entrySet();
		
//		Iterator it = entryKeys.iterator();
//		
//		while(it.hasNext())
//		{
//			Object keyanddata = it.next();
//			
//			// 转换成 一个 Entery
//			Entry entry = (Entry) keyanddata;
//			
//			// 获取到的是：  1=2350
//			System.out.println(entry);
//			
//			System.out.println(entry.getKey() + "--对应--" + entry.getValue());
//		}
		
		/**
		 * 
		 */
		
		List<Object> list = new ArrayList();
		
		
		
	}
}
