package com.wbl.storagedata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class GatherData
{
	/**	��������֮����
	 * 1.Collection�ӿ�(List�ӿڣ�Set�ӿ�)
	 * 			List�ӿڣ�-->ArratList
	 * 				 		�ײ��� ���� �����������죬����ɾ����
	 * 				 	 -->LinkedList(���� ������ ����)
	 * 				 		�ײ��� ˫������ ������������������ɾ����
	 * 				 	 -->Vector(��ArrayList�Ĳ���� Synchronized)
	 * 				 		�ײ��� ���� ����
	 * 				 	 -->Stack
	 * 			Set�ӿ�: -->HashSet
	 * 				 	 	�����ظ����������� �� String����
	 * 						��������Զ��������Ҫ�õ� hashCode() �� equals()
	 * 					 -->TreeSet
	 * 						�Ǿ�������ģ��Զ�����������Ҫ����
	 * 					Ҳ����Ҫʵ��Comparable�ӿڣ���д ComparTo() ����
	 * 						����Ĺ���ѡ��������Ҫ�Ŀ������������
	 * 2.Map�ӿ�
	 * 			HashSet
	 * 			Hashtable
	 * 			ConcurrentHashMap	��ȫ�� �� ����
	 */
	
	
	public static void main(String[] args)
	{
		/** Collection -- List -- ArrayList
		 * �ײ������鹹��
		 * ���򣬿��ظ�
		 */
		// ArrayListд��һ
		Collection ca = new ArrayList();
		
		// ArrayListд����
		List la = new ArrayList();
		
		//ArrayListд����
		ArrayList aa = new ArrayList();
		
		// �������ݵķ��� add() ��Ÿ������͵�����
		la.add(1);		// ����
		la.add(1);		// �ظ�����
		la.add("a");	// �ַ���
		la.add(false);	// ����
		la.add(2.2);	// ����
		la.add('b');	// �ַ�
		
		// size()  ��ȡ���ϳ��ȷ��� ������� length��ͬЧ��
		System.out.println("ArrayList������ϵĳ��ȣ�" + la.size());
		
		// �������ݵķ��� add()
		for(int i = 0; i < 10000; i++)
		{
			ca.add(i);
		}
		
		// size()	��ȡ���ϳ��ȷ��� ������� length��ͬЧ��
		System.out.println("ArrayList������ϵĳ��ȣ�" + ca.size());
		
		// �������� һ forѭ��
		for(int i = 0; i < la.size(); i++)
		{
			// ���ϻ�ȡ���ݵķ��� get()
			System.out.println("ArrayList�����" + (i+1) + "����Ϊ��" + la.get(i));
		}
		
		// �������� �� ������
//		Iterator cIt = ca.iterator();
//		while(cIt.hasNext())	// ��ѯ����������û��Ԫ��
//		{
//			System.out.println(cIt.next());
//		}
		
		
		
		
		/** Collection -- List -- LinkedList
		 * �ײ��� ˫������ ����
		 * ���򣬿��ظ�
		 */
		// LinkedListд��һ
		Collection cl = new LinkedList();
		
		// LinkedListд����
		List ll = new LinkedList();
		
		// LinkedListд����
		LinkedList lla = new LinkedList();
		
		//  ������� ����  add()
		cl.add("a");
		cl.add(true);
		cl.add(12);
		
		// ѭ���������
		for(int i = 0; i < 100000; i++)
		{
			ll.add(i);
		}
		
		/**��LinkedList�� �鿴����ѭ��������
		 * Ӧѡ�� ������ ����
		 */
		// ��������һ for
//		long startime = System.currentTimeMillis();
//		
//		for(int i = 0; i < ll.size(); i++)
//		{
//			ll.get(i);
//		}
//		
//		long endtime = System.currentTimeMillis();
//		System.out.println("LinkedList�� for �������ܣ�" + (endtime-startime));
		
		// ���������� ������
//		Iterator itl = ll.iterator();
//		
//		long  startime = System.currentTimeMillis();
//		while(itl.hasNext())
//		{
//			itl.next();
//		}
//		long endtime = System.currentTimeMillis();
//		
//		System.out.println("LinkedList�� ������ �������ܣ�" + (endtime-startime));

		/**
		 * LinkedList��һ���ص㣺�γ� ջ �����ݽṹ���Ƚ����
		 */
		LinkedList list = new LinkedList();
		
		// ѹջ
		list.push(1);
		list.push("one");
		list.push(true);
		
		// isEmpty �ж��Ƿ�Ϊ��
		while(!list.isEmpty())
		{
			// ��ջ
			System.out.println("LinkedList��ջ�����ݣ�" + list.pop());
		}
		
		
		
		
		
		/**Collection -- List -- Vector
		 * ������� Ψһ�� ArrayList ���������ڣ�
		 * 		Vector �� synchronized ���Σ����������������ݰ�ȫ
		 *  	ArrayList û�б����Σ����ܺã��������ݲ���ȫ
		 * 		�����ڶ��߳��� Ӧʹ�� Vector Ϊ��
		 * 	���� �����Ҫ�ڶ��߳��� �� ArrayList �洢���洢����ʱ ��� synchronizedͬ����
		 */
		
		
		
		
		
		
		/** Collection -- Set -- HashSet
		 * ���򣬲����ظ����Զ������ظ�����
		 * 
		 * ������ Iterator������ ��������
		 */
		// д���������һ����ȡ����֮һ
		Collection c = new HashSet();
		
		// ������ݷ��� add()
		c.add(123);
		c.add("���");
		c.add(123);
		
//		Iterator chIt = c.iterator();
//		
//		while(chIt.hasNext())
//		{
//			// ע�� �����������е����ݣ����Ǳ�����������ֻ����������Ϊ  HashSet �Զ����ظ������ݹ�����
//			System.out.println("HashSet ������������Ϊ��" + chIt.next());
//		}
		
		// Set�ӿ��µļ��϶��� �����ظ�������Ϊ��hashCode() �� equals()
		// hashCode() �� jdk���ݶ���ĵ�ַ�����ַ������������������int���͵���ֵ
		// equals() �� ֵ
		String s1 = new String("25");
		String s2 = new String("25");
		
		System.out.println("�Ƚ�equals()���Ϊ��" + s1.equals(s2) + "��\t�Ƚ�hashCode()��s1ֵΪ��" + s1.hashCode() + "\t s2ֵΪ��" + s2.hashCode());
		
		HashSet hs = new HashSet();
		
//		hs.add(s1);
//		hs.add(s2);
//		
//		Iterator it = hs.iterator();
//		
//		while(it.hasNext())
//		{
//			// �����������������һ������Ϊ ���������ݵ� hashCode()��ֵ ��һ���ģ����� equals()��ֵ Ҳ����һ����
//			System.out.println(it.next());
//		}
		
		TestHashSet tht1 = new TestHashSet(20, "·��");
		
		TestHashSet tht2 = new TestHashSet(20, "·��");
		
		// ���￴���� ����һ�£����� ������ hashCode() �� equals() ��ֵ ��һ��
		System.out.println("�Ƚ�equals()���Ϊ��" + tht1.equals(tht2) + "��\t�Ƚ�hashCode()��tht1ֵΪ��" + tht1.hashCode() + "\t tht2ֵΪ��" + tht2.hashCode());
		
		// ��ʱ�� ��Ҫ��д Object���е���������������hashCode() �� equals()
		// �� TestHashSet
		hs.add(tht1);
		hs.add(tht2);
		
		System.out.println("HashSet������ϵĳ���Ϊ��" + hs.size());
		
		
		
		
		
		/** Collection -- Set -- TreeSet
		 * ��ŵ�����������ġ����� ����������� ��˳�������
		 * ���û��˳����ô��Ҫ�ƶ�˳��
		 */
		TreeSet ts = new TreeSet();
		
//		ts.add(5);
//		ts.add(2);
//		ts.add(8);
//		ts.add(3);
//
//		Iterator it = ts.iterator();
//		while(it.hasNext())
//		{
//			// ��ŵ�����������ġ����� ����������� ��˳�������
//			// ���û��˳����ô��Ҫ�ƶ�˳��
//			System.out.println("TreeSet ������������Ϊ��" + it.next());
//		}
		
//		ts.add('a');
//		ts.add('w');
//		ts.add('s');
//		ts.add('f');
//		ts.add('b');
//		
//		Iterator it = ts.iterator();
//		
//		while(it.hasNext())
//		{
//			System.out.println("TreeSet ������������Ϊ��" + it.next());
//		}
		
		// �������Զ��������TreeSet() ������ �����Ƚ�������
		TestHashSet ths1 = new TestHashSet(1, "��¡");
		TestHashSet ths2 = new TestHashSet(6, "ɽ��");
		TestHashSet ths3 = new TestHashSet(2, "�ǰ�");
		
		ts.add(ths3);
		ts.add(ths2);
		ts.add(ths1);
		
//		Iterator it = ts.iterator();
//		
//		while(it.hasNext())
//		{
//			// ����������У�û�н� TreeSet��˳��ָ�����������Ի�����쳣
//			// �쳣����Ϊ��ClassCastException 
//			// ��Ҫ ��д Comparable����
//			// �� TestHashSet
//			
//			// ����ת����it.next() ��������Object����Ҫת�� TestHashSet
//			TestHashSet s = (TestHashSet) it.next();
//			
//			System.out.println("TreeSet ��������������Ϊ��" + s.getAge() + "\t" + s.getName());
//		}
		
		
		
		
		
		/** Map -- HashMap
		 * �Ǽ�ֵ�� {}
		 * �̷߳ǰ�ȫ���� �� ֵ ����Ϊ��
		 */
		HashMap hm = new HashMap();
		
		// ��һ��ֵ�� ����   �ڶ����� ֵ
		hm.put(1,"·��");
		hm.put(null, null);
		hm.put("��ñ������", la);	// ����� la �� 47 �ж���
		
		System.out.println("HashMap�ĳ���Ϊ��" + hm.size());
		
		
		
		
		
		/** Map -- Hashtable
		 * ��ֵ�� {}
		 * �̰߳�ȫ���� �� ֵ ��Ϊ��
		 */
		Hashtable ha = new Hashtable();
		
		ha.put(2, "ɽ��");
//		ha.put(null, null);		// ���� NullPointerException �쳣
		
		System.out.println("Hashtable�ĳ���Ϊ��" + ha.size());
		
		
		
		
		
		/** Collection��һ���ӿ�
		 * Collections��һ���࣬���ϵĹ�����
		 * ��������
		 */
//		List<Object> lista = new ArrayList<Object>();
//		
//		lista.add(2);
//		lista.add('a');
//		lista.add("��ϼ");
//		�е�����
//		Collections.sort(lista);
//		System.out.println(Collections.binarySearch(lista, "��ϼ"));
		
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("2");
		lista.add("1");
		lista.add("5");
		lista.add("3");
		
		//Collections.sort(lista); 	// ��ֵ���� ����
		
		Collections.reverse(lista); // �����˳�򷴹���
		
		for(int i = 0; i < lista.size();i++)
		{
			System.out.print(lista.get(i));
		}
		
		// �������ݵ��±�
		// �����۰���ң�����Ҫ����
		int index = Collections.binarySearch(lista, "5");
		System.out.println(index);
		
		
		
		// Collection Ƕ�� Map
		Collection<Map<String,Object>> caa = new ArrayList<Map<String,Object>>();
		
		
		
	}
}
