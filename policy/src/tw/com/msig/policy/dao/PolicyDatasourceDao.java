package tw.com.msig.policy.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import tw.com.msig.policy.entity.Policy;

public class PolicyDatasourceDao {
	
	// Singleton Design Pattern
	private static PolicyDatasourceDao instance = null;
	
	private static DataSource ds;
	
	public static PolicyDatasourceDao getInstance() {
		if(instance == null) {
			instance = new PolicyDatasourceDao();
		}
		return instance;
	}
	
	public PolicyDatasourceDao() {
		ds = getDataSource();
	}

	private DataSource getDataSource() {
		System.out.println("Create a new DataSource....");
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		ds.setUrl("jdbc:sqlserver://softleader.com.tw:1433;databaseName=msigtrainingdb");
		ds.setUsername("msigtraining");
		ds.setPassword("msigtraining");
		// You can see the configuration in https://commons.apache.org/proper/commons-dbcp/configuration.html
		ds.setInitialSize(30);
		ds.setMaxTotal(100);
		ds.setMaxIdle(20);
		ds.setMinIdle(30);
		ds.setMaxWaitMillis(-1);
		System.out.println("DataSource Ready now....");
		return ds;
	}
	
	public Collection<Policy> findAll() {
		Collection<Policy> models = new ArrayList<Policy>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {

			conn = ds.getConnection();
			
			stmt = conn.createStatement();
			String sql = "SELECT * FROM gary_policy ORDER BY ID";
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Policy policy = new Policy();
				policy.setId(rs.getLong("id"));
				policy.setPolicyNo(rs.getString("policy_no"));
				policy.setApplicantName(rs.getString("applicant_name"));
				
				models.add(policy);
			}
			
			
			
			return models;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if( rs != null ) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if( stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if( conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
		return models;
	}
	
	
	
}
