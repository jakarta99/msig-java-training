package tw.com.msig.policy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import tw.com.msig.policy.entity.Policy;

public class PolicyDao {
	
	public Collection<Policy> findAll() {
		Collection<Policy> models = new ArrayList<Policy>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://softleader.com.tw:1433;databaseName=msigtrainingdb";
			conn = DriverManager.getConnection(url, "msigtraining", "msigtraining");
			
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
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	
	public Policy findById(Long id) {
		Policy policy = null;
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. connect database
			// 1.1 JDBC driver
			// 1.2 JDBC URL
			// 1.3 DB account / password
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://softleader.com.tw:1433;databaseName=msigtrainingdb";
			conn = DriverManager.getConnection(url, "msigtraining", "msigtraining");
			
			// 2. execute SQL
			String sql = "SELECT * FROM gary_policy WHERE id="+id;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				policy = new Policy();
				policy.setId(rs.getLong("id")); // policy.setId(id);
				policy.setPolicyNo(rs.getString("policy_no"));
				policy.setApplicantName(rs.getString("applicant_name"));
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		
		
		return policy;
	}
	
	
	
	public Policy insert(Policy policy) {
		
		Connection conn = null;
		Statement stmt = null;
		
		
		try {		
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://softleader.com.tw:1433;databaseName=msigtrainingdb";
			conn = DriverManager.getConnection(url, "msigtraining", "msigtraining");
			
			String sql 
				= "INSERT INTO gary_policy ("
						+ "id, "
						+ "policy_no, "
						+ "applicant_name) "
						+ "values ("
						+ policy.getId()+", "
						+ "'"+policy.getPolicyNo()+"',"
						+ "'"+policy.getApplicantName()+"'"
						+ ")";
			System.out.println(sql);
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			
			// 3. return policy
			
			return policy;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
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
		
		return null;
	}

	
	public Policy update(Policy policy) {
		
		Connection conn = null;
		Statement stmt = null;
		
		
		try {		
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://softleader.com.tw:1433;databaseName=msigtrainingdb";
			conn = DriverManager.getConnection(url, "msigtraining", "msigtraining");
			
			String sql = "UPDATE gary_policy SET "
						+ "policy_no='"+policy.getPolicyNo()+"',"
						+ "applicant_name='"+policy.getApplicantName()+"' "
						+ " WHERE id="+policy.getId();

			System.out.println(sql);
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			
			// 3. return policy
			
			return policy;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
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
		
		return policy;
	}
	
	public void delete(Long id) {
		
		Connection conn = null;
		Statement stmt = null;
		
		
		try {		
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://softleader.com.tw:1433;databaseName=msigtrainingdb";
			conn = DriverManager.getConnection(url, "msigtraining", "msigtraining");
			
			String sql = "DELETE FROM gary_policy"
						+ " WHERE id="+id;

			System.out.println(sql);
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
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
		
	}
}
