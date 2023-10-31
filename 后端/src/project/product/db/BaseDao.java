
package project.product.db;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




//��������ݿ��������
public class BaseDao {
	  private Connection  conn;
	  // jdbc�е�statement�������������ݿⷢ��SQL���
	  private PreparedStatement ps;
	  private ResultSet  rs;
	 private static final String DRIVER="com.mysql.cj.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/product";
     private static final String USERNAME="root";
    private static final String PWD="123456";
	static {
		try {
			
			//ע���������÷����ǽ�ָ�����������Ϣ���ص��ڴ���
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//��
	public void open() {
		//��ȡ����
		try {
			 this.conn = DriverManager.getConnection(URL, USERNAME, PWD);
			  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//ִ��dql ��ѯ
	public ResultSet execDQL(String sql,Object...param) {
		
		//ͨ������sql���
		try {
			this.ps=this.conn.prepareStatement(sql);
			
			for(int i=0;i<param.length;i++) {
				this.ps.setObject(i+1, param[i]);
			}
			this.rs=this.ps.executeQuery();
			return this.rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
		
	} 
	//ִ��dml,����ִ�в����ļ�¼��  
	public int execDMl(String sql,Object...param) {
		try {
			this.ps=this.conn.prepareStatement(sql);
			for(int i=0;i<param.length;i++) {
				this.ps.setObject(i+1, param[i]);
			}
			
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//������С����
		return -1;
	}
	//�ر�
	public void close() {
		//Ĭ��Ϊ�գ�ֱ�ӹ�һ�����ֿ�ָ���쳣
	 if(this.conn!=null) {
		 try {
			 //һ���쳣����ӡ�쳣����û����
			conn.close();
		} catch (SQLException e) {
			//����conn����ָ�룬ָ��Ϊ�գ���������ָ��ָ�������ʱ���Զ�������
			conn=null;
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	}
}
