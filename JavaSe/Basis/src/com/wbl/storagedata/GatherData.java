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
	/**	数据容器之集合
	 * 1.Collection接口(List接口，Set接口)
	 * 			List接口：-->ArratList
	 * 				 		底层由 数组 构建，遍历快，插入删除慢
	 * 				 	 -->LinkedList(采用 迭代器 遍历)
	 * 				 		底层由 双向链表 构建，遍历慢，插入删除快
	 * 				 	 -->Vector(与ArrayList的差别在 Synchronized)
	 * 				 		底层由 数组 构建
	 * 				 	 -->Stack
	 * 			Set接口: -->HashSet
	 * 				 	 	过滤重复：基本数据 和 String类型
	 * 						如果过滤自定义对象，需要用到 hashCode() 和 equals()
	 * 					 -->TreeSet
	 * 						是经过排序的，自定义对象必须先要排序
	 * 					也就是要实现Comparable接口，重写 ComparTo() 方法
	 * 						排序的规则选用需求需要的可以排序的属性
	 * 2.Map接口
	 * 			HashSet
	 * 			Hashtable
	 * 			ConcurrentHashMap	安全性 和 性能
	 */
	
	
	public static void main(String[] args)
	{
		/** Collection -- List -- ArrayList
		 * 底层由数组构成
		 * 有序，可重复
		 */
		// ArrayList写法一
		Collection ca = new ArrayList();
		
		// ArrayList写法二
		List la = new ArrayList();
		
		//ArrayList写法三
		ArrayList aa = new ArrayList();
		
		// 放入数据的方法 add() 存放各种类型的数据
		la.add(1);		// 整数
		la.add(1);		// 重复整数
		la.add("a");	// 字符串
		la.add(false);	// 布尔
		la.add(2.2);	// 浮点
		la.add('b');	// 字符
		
		// size()  获取集合长度方法 与数组的 length等同效果
		System.out.println("ArrayList这个集合的长度：" + la.size());
		
		// 放入数据的方法 add()
		for(int i = 0; i < 10000; i++)
		{
			ca.add(i);
		}
		
		// size()	获取集合长度方法 与数组的 length等同效果
		System.out.println("ArrayList这个集合的长度：" + ca.size());
		
		// 遍历方法 一 for循环
		for(int i = 0; i < la.size(); i++)
		{
			// 集合获取数据的方法 get()
			System.out.println("ArrayList输出第" + (i+1) + "数据为：" + la.get(i));
		}
		
		// 遍历方法 二 迭代器
//		Iterator cIt = ca.iterator();
//		while(cIt.hasNext())	// 查询迭代器中有没有元素
//		{
//			System.out.println(cIt.next());
//		}
		
		
		
		
		/** Collection -- List -- LinkedList
		 * 底层由 双向链表 构成
		 * 有序，可重复
		 */
		// LinkedList写法一
		Collection cl = new LinkedList();
		
		// LinkedList写法二
		List ll = new LinkedList();
		
		// LinkedList写法三
		LinkedList lla = new LinkedList();
		
		//  添加数据 方法  add()
		cl.add("a");
		cl.add(true);
		cl.add(12);
		
		// 循环添加数据
		for(int i = 0; i < 100000; i++)
		{
			ll.add(i);
		}
		
		/**在LinkedList中 查看两种循环的性能
		 * 应选择 迭代器 遍历
		 */
		// 遍历方法一 for
//		long startime = System.currentTimeMillis();
//		
//		for(int i = 0; i < ll.size(); i++)
//		{
//			ll.get(i);
//		}
//		
//		long endtime = System.currentTimeMillis();
//		System.out.println("LinkedList用 for 遍历性能：" + (endtime-startime));
		
		// 遍历方法二 迭代器
//		Iterator itl = ll.iterator();
//		
//		long  startime = System.currentTimeMillis();
//		while(itl.hasNext())
//		{
//			itl.next();
//		}
//		long endtime = System.currentTimeMillis();
//		
//		System.out.println("LinkedList用 迭代器 遍历性能：" + (endtime-startime));

		/**
		 * LinkedList另一个特点：形成 栈 的数据结构，先进后出
		 */
		LinkedList list = new LinkedList();
		
		// 压栈
		list.push(1);
		list.push("one");
		list.push(true);
		
		// isEmpty 判断是否为空
		while(!list.isEmpty())
		{
			// 出栈
			System.out.println("LinkedList出栈的数据：" + list.pop());
		}
		
		
		
		
		
		/**Collection -- List -- Vector
		 * 这个集合 唯一与 ArrayList 的区别在于：
		 * 		Vector 被 synchronized 修饰，性能弱，但是数据安全
		 *  	ArrayList 没有被修饰，性能好，但是数据不安全
		 * 		所以在多线程中 应使用 Vector 为好
		 * 	但是 如果非要在多线程中 用 ArrayList 存储，存储数据时 添加 synchronized同步块
		 */
		
		
		
		
		
		
		/** Collection -- Set -- HashSet
		 * 无序，不可重复，自动过滤重复数据
		 * 
		 * 必须用 Iterator迭代器 遍历数据
		 */
		// 写法与上面的一样，取其中之一
		Collection c = new HashSet();
		
		// 添加数据方法 add()
		c.add(123);
		c.add("你好");
		c.add(123);
		
//		Iterator chIt = c.iterator();
//		
//		while(chIt.hasNext())
//		{
//			// 注意 上面是有三行的数据，但是遍历出的数据只有两个，因为  HashSet 自动把重复的数据过滤了
//			System.out.println("HashSet 遍历出的数据为：" + chIt.next());
//		}
		
		// Set接口下的集合对象 过滤重复的条件为：hashCode() 和 equals()
		// hashCode() 是 jdk根据对象的地址或者字符串或者数字算出来的int类型的数值
		// equals() 是 值
		String s1 = new String("25");
		String s2 = new String("25");
		
		System.out.println("比较equals()结果为：" + s1.equals(s2) + "。\t比较hashCode()，s1值为：" + s1.hashCode() + "\t s2值为：" + s2.hashCode());
		
		HashSet hs = new HashSet();
		
//		hs.add(s1);
//		hs.add(s2);
//		
//		Iterator it = hs.iterator();
//		
//		while(it.hasNext())
//		{
//			// 这里出来的数据中有一个，因为 这两个数据的 hashCode()的值 是一样的，而且 equals()的值 也是有一样的
//			System.out.println(it.next());
//		}
		
		TestHashSet tht1 = new TestHashSet(20, "路飞");
		
		TestHashSet tht2 = new TestHashSet(20, "路飞");
		
		// 这里看着是 数据一致，但是 两个的 hashCode() 和 equals() 的值 不一样
		System.out.println("比较equals()结果为：" + tht1.equals(tht2) + "。\t比较hashCode()，tht1值为：" + tht1.hashCode() + "\t tht2值为：" + tht2.hashCode());
		
		// 这时候 需要重写 Object类中的两个方法，即：hashCode() 和 equals()
		// 见 TestHashSet
		hs.add(tht1);
		hs.add(tht2);
		
		System.out.println("HashSet这个集合的长度为：" + hs.size());
		
		
		
		
		
		/** Collection -- Set -- TreeSet
		 * 存放的数据是无序的。但是 输出的数据是 有顺序输出的
		 * 如果没有顺序，那么就要制定顺序
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
//			// 存放的数据是无序的。但是 输出的数据是 有顺序输出的
//			// 如果没有顺序，那么就要制定顺序
//			System.out.println("TreeSet 遍历出的数据为：" + it.next());
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
//			System.out.println("TreeSet 遍历出的数据为：" + it.next());
//		}
		
		// 这里是自定义对象，在TreeSet() 集合中 必须先进行排序
		TestHashSet ths1 = new TestHashSet(1, "索隆");
		TestHashSet ths2 = new TestHashSet(6, "山治");
		TestHashSet ths3 = new TestHashSet(2, "乔巴");
		
		ts.add(ths3);
		ts.add(ths2);
		ts.add(ths1);
		
//		Iterator it = ts.iterator();
//		
//		while(it.hasNext())
//		{
//			// 在这个例子中，没有讲 TreeSet的顺序指明出来，所以会出现异常
//			// 异常变现为：ClassCastException 
//			// 需要 重写 Comparable方法
//			// 见 TestHashSet
//			
//			// 数据转换，it.next() 出来的是Object对象，要转成 TestHashSet
//			TestHashSet s = (TestHashSet) it.next();
//			
//			System.out.println("TreeSet 遍历出来的数据为：" + s.getAge() + "\t" + s.getName());
//		}
		
		
		
		
		
		/** Map -- HashMap
		 * 是键值对 {}
		 * 线程非安全，键 和 值 都能为空
		 */
		HashMap hm = new HashMap();
		
		// 第一个值是 键名   第二个是 值
		hm.put(1,"路飞");
		hm.put(null, null);
		hm.put("草帽海贼团", la);	// 这里的 la 在 47 行定义
		
		System.out.println("HashMap的长度为：" + hm.size());
		
		
		
		
		
		/** Map -- Hashtable
		 * 键值对 {}
		 * 线程安全，键 和 值 不为空
		 */
		Hashtable ha = new Hashtable();
		
		ha.put(2, "山治");
//		ha.put(null, null);		// 引起 NullPointerException 异常
		
		System.out.println("Hashtable的长度为：" + ha.size());
		
		
		
		
		
		/** Collection是一个接口
		 * Collections是一个类，集合的工具类
		 * 两者区别
		 */
//		List<Object> lista = new ArrayList<Object>();
//		
//		lista.add(2);
//		lista.add('a');
//		lista.add("栖霞");
//		有点问题
//		Collections.sort(lista);
//		System.out.println(Collections.binarySearch(lista, "栖霞"));
		
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("2");
		lista.add("1");
		lista.add("5");
		lista.add("3");
		
		//Collections.sort(lista); 	// 数值排序 升序
		
		Collections.reverse(lista); // 将输出顺序反过来
		
		for(int i = 0; i < lista.size();i++)
		{
			System.out.print(lista.get(i));
		}
		
		// 查找数据的下标
		// 这是折半查找，首先要排序
		int index = Collections.binarySearch(lista, "5");
		System.out.println(index);
		
		
		
		// Collection 嵌套 Map
		Collection<Map<String,Object>> caa = new ArrayList<Map<String,Object>>();
		
		
		
	}
}
