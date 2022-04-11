package projects;
import javax.swing.*;
import java.sql.*;
public class approve {
	public approve()
	{
		try
		{
			JFrame f=new JFrame();
			Connection con=null;
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/printer", "postgres", "postgres");
			PreparedStatement ps=null,ks=null;
			ps=con.prepareStatement("Delete from requested_staff where purpose='personel';");
			ps.executeQuery();
			JOptionPane.showMessageDialog(f, "Deleted successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		approve k=new approve();
	}
}
