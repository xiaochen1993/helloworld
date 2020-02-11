package com.tedu.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import com.tedu.util.JdbcUtil;

/**
 * JDBC增删改查
 */
public class TestJdbc3 {
	/* 1、新增:往account表中添加一个名称为john、money为3500的记录 */
	@Test   //main
	public void testInsert() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			//注册驱动并获取连接
			conn = JdbcUtil.getConn();
			//获取传输器
			stat = conn.createStatement();
			//发送sql语句到服务器执行,并返回执行结果
			String sql = "insert into dept values(null, '肖晨')";
			int rows = stat.executeUpdate( sql );
			//处理结果
			System.out.println( "影响行数: "+rows );
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//通过JdbcUtil工具类中的close方法释放资源
			JdbcUtil.close(conn, stat, rs);
		}
	}
	/* 2、修改:将account表中名称为john的记录，money修改为1500 */
	@Test
	public void testUpdate() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			//注册驱动并获取连接
			conn = JdbcUtil.getConn();
			//获取传输器
			stat = conn.createStatement();
			//发送sql语句到服务器执行,并返回执行结果
			String sql = "update account set money=1500 where name='john'";
			int rows = stat.executeUpdate( sql );
			//处理结果
			System.out.println( "影响行数: "+rows );
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//通过JdbcUtil工具类中的close方法释放资源
			JdbcUtil.close(conn, stat, rs);
		}
	}
	/* 3、查询:查询account表中id为1的记录 */
	@Test
	public void testFindById() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			//注册驱动并获取连接
			conn = JdbcUtil.getConn();
			//获取传输器
			stat = conn.createStatement();
			//执行sql语句,返回执行结果
			String sql = "select * from account where id=1";
			rs = stat.executeQuery( sql );
			//处理结果
			if( rs.next() ) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double money = rs.getDouble("money");
				System.out.println( id+" : "+name+" : "+money);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, stat, rs);
		}
	}
	/* 4、删除:删除account表中名称为john的记录 */
	@Test
	public void testDelete() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			//注册驱动并获取连接
			conn = JdbcUtil.getConn();
			//获取传输器
			stat = conn.createStatement();
			//发送sql语句到服务器执行,并返回执行结果
			String sql = "delete from account where name='john'";
			int rows = stat.executeUpdate( sql );
			//处理结果
			System.out.println( "影响行数: "+rows );
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//通过JdbcUtil工具类中的close方法释放资源
			JdbcUtil.close(conn, stat, rs);
		}
	}
}






