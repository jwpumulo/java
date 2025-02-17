package com.yedam.stream.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseExe {

	public static void main(String[] args) {

		Connection conn;
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);

			System.out.println("연결 성공");

			Statement stmt = conn.createStatement();

//			stmt.executeUpdate("insert into tbl_student (student_no, student_name)"
//					+ "values ('S007', '박현수')");
			
//			int r = stmt.executeUpdate("update tbl_student set "
//					+ "phone = '010-1122-3344', "
//					+ "address = '대구 서구 100번지' "
//					+ "where student_no = 'S007'");
			
			int r = stmt.executeUpdate("delete from tbl_student "
					+ "where student_no = 'S001'");
			
			System.out.println(r);
			
			ResultSet rs = stmt.executeQuery("select * from tbl_student");

			while (rs.next()) {
				System.out.printf("%4s %3s %s %s\n", rs.getString("student_no"), rs.getString("student_name"),
						rs.getString("phone"), rs.getString("address"));
//				System.out.println(rs.getString("student_name"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("end");
	}
}
