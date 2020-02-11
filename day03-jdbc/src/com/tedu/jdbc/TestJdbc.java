package com.tedu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * JDBC快速入门程序
 * JDBC  JAVA DATABASE CONNECTION
 * MYBATIS
 */
public class TestJdbc {
	public static void main(String[] args) throws Exception {
		//1.注册数据库驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2.获取数据库连接  
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/jt_db?characterEncoding=utf-8", 
				"root", "root");
		//3.获取传输器
		Statement stat = conn.createStatement();
		//4.发送SQL到服务器执行并返回执行结果
		String sql = "select * from account";
		ResultSet rs = stat.executeQuery( sql );
		//5.处理结果
		while( rs.next() ) {
			int id = rs.getInt("id");
			rs.getInt(1);
			String name = rs.getString("name");
			double money = rs.getDouble("money");
			System.out.println(id+" : "+name+" : "+money);
		}
		//6.释放资源
		rs.close();
		stat.close();
		conn.close();
		
		System.out.println("TestJdbc.main()....");
	}
}






