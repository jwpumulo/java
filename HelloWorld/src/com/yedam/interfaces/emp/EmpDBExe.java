package com.yedam.interfaces.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmpDBExe implements EmpDAO {

	Connection getConnect() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	};

	@Override
	public boolean registerEmp(Employee emp) {
		// TODO Auto-generated method stub

		try {
			Statement stmt = getConnect().createStatement();

			int r = stmt.executeUpdate("insert into tbl_employees values ( " + emp.getEmpNo() + ", " + emp.getEmpName()
					+ ", " + emp.getTelNo() + ", " + emp.getHireDate() + ", " + emp.getSalary() + ")");

			if (r > 0) {
				System.out.println("등록 성공");
				return true;
			} else {
				System.out.println("등록 실패");
				return false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Statement stmt = getConnect().createStatement();

//			String sql = "update tbl_employees set" 
//			+ " salary = " + emp.getSalary() 
//			+ " where emp_no = " + emp.getEmpNo();
			
			
//			System.out.println(sql);
//			
//			int r = stmt.executeUpdate(sql);
			
			String sql = "update tbl_employees set"
					+ " tel_no = nvl('" + emp.getTelNo() + "', tel_no),"
					+ " hire_date = case '" + sdf.format(emp.getHireDate()) + "' when '1900-01-01' then hire_date else '"+ sdf.format(emp.getHireDate()) + "' end, " 
					+ " salary = case " + emp.getSalary() + " when 0 then salary else " + emp.getSalary() + " end"
					+ " where emp_no = " + emp.getEmpNo();
			
			System.out.println(sql);
//			
//			return false;
			

			int r = stmt.executeUpdate(sql);

			if (r > 0) {
				System.out.println("등록 성공");
				return true;
			} else {
				System.out.println("등록 실패");
				return false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean removeEmp(int empNo) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		try {
			Statement stmt = getConnect().createStatement();

			int r = stmt.executeUpdate("delete from tbl_employees" + " where emp_name = " + empNo);

			if (r > 0) {
				System.out.println("삭제 성공");
				return true;
			} else {
				System.out.println("삭제 실패");
				return false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Employee> search(Employee emp) {
		// TODO Auto-generated method stub

		List<Employee> empList = new ArrayList<>();

		try {
			Statement stmt = getConnect().createStatement();

			ResultSet rs = stmt.executeQuery("select * from tbl_employees" + " where emp_name = nvl('"
					+ emp.getEmpName() + "', emp_name)" + " order by emp_no");

			while (rs.next()) {
				Employee emp1 = new Employee();
				emp1.setEmpNo(rs.getInt("emp_no"));
				emp1.setEmpName(rs.getString("emp_name"));
				emp1.setTelNo(rs.getString("tel_no"));
				emp1.setHireDate(rs.getDate("hire_date"));
				emp1.setSalary(rs.getInt("salary"));

				empList.add(emp1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}

}
