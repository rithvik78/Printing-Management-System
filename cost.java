package projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class cost {
	public static void insert(cost_details s)
	{
		ResultSet rs=null;
		PreparedStatement ps=null;
		Connection con=null;
		int cos=0;
		try
		{
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/printer", "postgres", "postgres");
			
			int i=1;
			while(i<=5)
			{
				ps=con.prepareStatement("select * from required_conditions natural join printers where pid=?;");
				ps.setInt(1,i);
				PreparedStatement ks=null;
				rs=ps.executeQuery();
				while(rs.next())
				{
					try
					{
						cos=0;
						if(rs.getString("sizes").equals("A4")==true)
						{
							if(rs.getString("page_type").equals("double")==true)
							{
								if(rs.getString("print_type").equals("Color")==true)
								{
									cos+=(10+10+10)*rs.getInt("number_of_copies");
								}
								else
								{
									cos+=(10+10+5)*rs.getInt("number_of_copies");
								}
							}
							else
							{
								if(rs.getString("print_type").equals("Color")==true)
								{
									cos+=(10+5+10)*rs.getInt("number_of_copies");
								}
								else
								{
									cos+=(10+5+5)*rs.getInt("number_of_copies");
								}
							}
							ks=con.prepareStatement("Insert into costs values(?,?,?,?)");
							ks.setInt(1,cos);
							ks.setInt(2,rs.getInt("pid"));
							ks.setString(3,rs.getString("page_type"));
							ks.setString(4,rs.getString("sizes"));
							ks.executeQuery();
						}
						else if(rs.getString("sizes").equals("A3")==true)
						{
							if(rs.getString("page_type").equals("double")==true)
							{
								if(rs.getString("print_type").equals("Color")==true)
								{
									cos+=(8+10+10)*rs.getInt("number_of_copies");
								}
								else
								{
									cos+=(8+10+5)*rs.getInt("number_of_copies");
								}
							}
							else
							{
								if(rs.getString("print_type").equals("Color")==true)
								{
									cos+=(8+5+10)*rs.getInt("number_of_copies");
								}
								else
								{
									cos+=(8+5+5)*rs.getInt("number_of_copies");
								}
							}
							ks=con.prepareStatement("Insert into costs values(?,?,?,?)");
							ks.setInt(1,cos);
							ks.setInt(2,rs.getInt("pid"));
							ks.setString(3,rs.getString("page_type"));
							ks.setString(4,rs.getString("sizes"));
							ks.executeQuery();
						}
						else if(rs.getString("sizes").equals("A2")==true)
						{
							if(rs.getString("page_type").equals("double")==true)
							{
								if(rs.getString("print_type").equals("Color")==true)
								{
									cos+=(6+10+10)*rs.getInt("number_of_copies");
								}
								else
								{
									cos+=(6+10+5)*rs.getInt("number_of_copies");
								}
							}
							else
							{
								if(rs.getString("print_type").equals("Color")==true)
								{
									cos+=(6+5+10)*rs.getInt("number_of_copies");
								}
								else
								{
									cos+=(6+5+5)*rs.getInt("number_of_copies");
								}
							}
							ks=con.prepareStatement("Insert into costs values(?,?,?,?)");
							ks.setInt(1,cos);
							ks.setInt(2,rs.getInt("pid"));
							ks.setString(3,rs.getString("page_type"));
							ks.setString(4,rs.getString("sizes"));
							ks.executeQuery();
						}
						else if(rs.getString("sizes").equals("A1")==true)
						{
							if(rs.getString("page_type").equals("double")==true)
							{
								if(rs.getString("print_type").equals("Color")==true)
								{
									cos+=(4+10+10)*rs.getInt("number_of_copies");
								}
								else
								{
									cos+=(4+10+5)*rs.getInt("number_of_copies");
								}
							}
							else
							{
								if(rs.getString("print_type").equals("Color")==true)
								{
									cos+=(4+5+10)*rs.getInt("number_of_copies");
								}
								else
								{
									cos+=(4+5+5)*rs.getInt("number_of_copies");
								}
							}
							ks=con.prepareStatement("Insert into costs values(?,?,?,?)");
							ks.setInt(1,cos);
							ks.setInt(2,rs.getInt("pid"));
							ks.setString(3,rs.getString("page_type"));
							ks.setString(4,rs.getString("sizes"));
							ks.executeQuery();
						}
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					
				}
				++i;
			}
			con.close();
			rs.close();
			ps.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}		
	}
	public static List<cost_details>view()
	{
		List<cost_details> l=new ArrayList<cost_details>();
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/printer", "postgres", "postgres");
			PreparedStatement ps=con.prepareStatement("Select * from costs");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				cost_details s=new cost_details();
				s.setcost(rs.getInt("cost"));
				s.setpid(rs.getInt("pid"));
				s.setpage_type(rs.getString("page_type"));
				s.setsizes(rs.getString("sizes"));
				l.add(s);
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return l;
	}
}
