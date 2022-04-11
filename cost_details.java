package projects;

public class cost_details {
	private String page_type,sizes;
	private int cost,pid;
	public cost_details()
	{
		
	}
	public cost_details(int cost,int pid,String page_type,String sizes)
	{
		this.cost=cost;
		this.pid=pid;
		this.page_type=page_type;
		this.sizes=sizes;
	}
	public int getcost()
	{
		return this.cost;
	}
	public int getpid()
	{
		return this.pid;
	}
	public String getpage_type()
	{
		return this.page_type;
	}
	public String getsizes()
	{
		return this.sizes;
	}
	public void setcost(int cost)
	{
		this.cost=cost;
	}
	public void setpid(int pid)
	{
		this.pid=pid;
	}
	public void setpage_type(String page_type)
	{
		this.page_type=page_type;
	}
	public void setsizes(String sizes)
	{
		this.sizes=sizes;
	}
}
