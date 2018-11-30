package com.wbl.project0;

public class Fmenu
{
	private int fid;
	
	private String fname;
	
	private Cmenu[] cmenu;

	public int getFid()
	{
		return fid;
	}

	public void setFid(int fid)
	{
		this.fid = fid;
	}

	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname)
	{
		this.fname = fname;
	}

	public Cmenu[] getCmenu()
	{
		return cmenu;
	}

	public void setCmenu(Cmenu[] cmenu)
	{
		this.cmenu = cmenu;
	}

}
