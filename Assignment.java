package sam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Assignment {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee(0, null, null, 0);
		String sql = "";
		
		System.out.println("enter 1 to insert, 2 to update, 3 to delete, 4 to select");
		int cs =sc.nextInt();
		OracleDBConnection oc = new OracleDBConnection();
		Connection c = oc.getConnection();
		
		PreparedStatement ps;

		switch (cs) {
		case 1:
			sql = "insert into employee(emp_id,name,email,salary) values(?,?,?,?)";
			ps=c.prepareStatement(sql);
			System.out.println("enter empid");
			ps.setInt(1, sc.nextInt());
			System.out.println("enter name");
			ps.setString(2, sc.next());
			System.out.println("enter email");
			ps.setString(3, sc.next());
			System.out.println("enter salary");
			ps.setInt(4, sc.nextInt());
			ps.execute();
			System.out.println("data inserted");
			break;
		case 2:
			
			sql = "update employee set emp_id=? , name=? , email=? , salary=? where emp_id=?";
			ps=c.prepareStatement(sql);
			System.out.println("enter empid of employee you want to update");
			ps.setInt(5, sc.nextInt());
			System.out.println("enter empid");
			ps.setInt(1, sc.nextInt());
			System.out.println("enter name");
			ps.setString(2, sc.next());
			System.out.println("enter email");
			ps.setString(3, sc.next());
			System.out.println("enter salary");
			ps.setInt(4, sc.nextInt());
			ps.execute();
			System.out.println("data updated");
			break;

		case 3:
			sql = "delete from employee where emp_id=?";
			ps=c.prepareStatement(sql);
			System.out.println("enter empid you want to delete row");
			ps.setInt(1, sc.nextInt());
			ps.execute();
			System.out.println("data deleted");
			break;
		case 4:
			sql = "select * from employee";
			ps=c.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while (rs.next())
			System.out.println(rs.getInt(1)+", "+rs.getString(2)+", "+rs.getString(3)+", "+rs.getInt(4));
		}
		
		

	}

}
