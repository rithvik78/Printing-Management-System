package projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class delete {
	public static void deletion(String s)
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/printer", "postgres", "postgres");
			String rids=s;
			PreparedStatement ps=con.prepareStatement("delete from required_conditions where rid=?");
			ps.setString(1,rids);
			ps.executeUpdate();
			con.close();
		}
		catch(Exception ey)
		{
			System.out.println(ey);
		}
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/printer", "postgres", "postgres");
			String rids=s;
			PreparedStatement ps=con.prepareStatement("delete from printers where rid=?");
			ps.setString(1,rids);
			ps.executeUpdate();
			con.close();
		}
		catch(Exception ey)
		{
			System.out.println(ey);
		}
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/printer", "postgres", "postgres");
			String rids=s;
			PreparedStatement ps=con.prepareStatement("delete from clerical_staff where rid=?");
			ps.setString(1,rids);
			ps.executeUpdate();
			con.close();
		}
		catch(Exception ey)
		{
			System.out.println(ey);
		}
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/printer", "postgres", "postgres");
			String rids=s;
			PreparedStatement ps=con.prepareStatement("delete from delivery_person where rid=?");
			ps.setString(1,rids);
			ps.executeUpdate();
			con.close();
		}
		catch(Exception ey)
		{
			System.out.println(ey);
		}
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/printer", "postgres", "postgres");
			String rids=s;
			PreparedStatement ps=con.prepareStatement("delete from requested_staff where rid=?");
			ps.setString(1,rids);
			ps.executeUpdate();
			con.close();
		}
		catch(Exception ey)
		{
			System.out.println(ey);
		}
	}
}

