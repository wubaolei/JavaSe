package com.wbl.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class Test
{
	// ��ѯ�ж����ļ�
	ArrayList<String> a = new ArrayList<String>();
	
	public void searchFiles(File cf)
	{
		// ��ȡ�����ļ��� ���ļ�
		File[] f = cf.listFiles();
		
		// ���� f
		for(File i:f)
		{
			// �ж� i �Ƿ��� �ļ�
			if(i.isFile())
			{
				// ��ȡ�ļ�������
				String fileName = i.getName();
//				
//				// ��ȡ���һ�� ��
//				String txt = fileName.substring(fileName.lastIndexOf("."));
//				
//				// �жϱ���ȡ���ǲ��� .txt ����
//				if(txt.equals(".txt"))
//				{
//					a.add(fileName);
//				}
				
				// ��һ���ж� �ļ�����
				if(fileName.endsWith(".txt"))
				{
					a.add(fileName);
					
					// ��ӡ�ļ���
					System.out.println("���txt���ļ���Ϊ��" + fileName);
				}
				
			}
			else
			{
				System.out.println(i.getName());
				
				// �����ļ� �� ���µ��õ�ǰ�����ڽ��б���
				searchFiles(i);
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		File f = new File("e:/a");
		
		Test t = new Test();
		
		t.searchFiles(f);
		
		// û�а� a ����ɾ�̬����
		System.out.println("txt���ļ��У�" + t.a.size());
	}
	
	
	
}
