package com.wbl.threads;

import java.io.IOException;
import java.util.TimerTask;

public class UserTimerPra extends TimerTask
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		
		Runtime runtime = Runtime.getRuntime();
		
		try
		{
			Process pc = runtime.exec("D:\\Software\\�ı�ע������\\tip\\java.txt");
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
