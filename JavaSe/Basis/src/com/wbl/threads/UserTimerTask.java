package com.wbl.threads;

import java.util.Date;
import java.util.TimerTask;

public class UserTimerTask extends TimerTask
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "--run:" + new Date());
	}

}
