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
		
		map.put("law", "·��");
		
		map.put("��ñ", true);
	
		// ��ȡ������ֵ
		System.out.println("������ֵΪ��" + map.get("1"));
		
		// ��ȡ���м�ֵ
		// �� keySet() ������ȡ����
// �� List Ҫת��
//		List list = (List) map.keySet();
		
//		Set keydata = map.keySet();
//		
//		Iterator it = keydata.iterator();
//		
//		while(it.hasNext())
//		{
//			Object key = it.next();
//			
//			System.out.println(key + "--��Ӧ--" + map.get(key));
//		}
		
		System.out.println("---------------");
		
		// �õ� ����ֵ������ͼ
		Set entryKeys = map.entrySet();
		
//		Iterator it = entryKeys.iterator();
//		
//		while(it.hasNext())
//		{
//			Object keyanddata = it.next();
//			
//			// ת���� һ�� Entery
//			Entry entry = (Entry) keyanddata;
//			
//			// ��ȡ�����ǣ�  1=2350
//			System.out.println(entry);
//			
//			System.out.println(entry.getKey() + "--��Ӧ--" + entry.getValue());
//		}
		
		/**
		 * 
		 */
		
		List<Object> list = new ArrayList();
		
		
		
	}
}
