package code;
import java.sql.*;

public class db {

   
   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/smsdb";

  
   static final String USER = "root";
   static final String PASS = "root";
   
   Connection conn = null;
   Statement stmt = null;
   
   public boolean dbcon() {
	   try{
	   Class.forName("com.mysql.cj.jdbc.Driver");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);
	      return true;
	   }
	   catch(Exception se){
		   
	   }
	   return false;
	   
   }
   
   public void  get_un() {
	   try {
		stmt = conn.createStatement();
	   String sql;
	   sql = "SELECT id,un FROM user";
		ResultSet rs = stmt.executeQuery(sql);
		StudentManagement.lblNewLabel.setText("lol");
		while(rs.next()){
	        
	         
	         StudentManagement.lblNewLabel.setText(rs.getString("id")+" "+rs.getString("un")+" ");

	        
	      }
	} catch (Exception e) {
		
		
	}
   }
   
   
   public String insert_data(String name, String dob, String fname, String mname, String sex, String nationality, String religion, String blood, String subject, String admission, String address, String studentid) {
	   String sid=studentid;
	   try {
		   stmt = conn.createStatement();
		   String sql;
		   sql = "SELECT studentid FROM student_info";
		   ResultSet rs = stmt.executeQuery(sql);
		   String s=null;
		   while(rs.next()){
			   if(sid.compareTo(rs.getString("studentid"))==0) {
				   s=rs.getString("studentid");
				   String[] s1=s.split("-");
				   int i=Integer.parseInt(s1[2])+1;
				   sid=s1[0]+"-"+s1[1]+"-"+i;
			   }
		   }
		   
	   }
	   catch (Exception e) {
			
			
	   }
	   
	   
	   try {
		   stmt = conn.createStatement();
		   String sql;
		   sql = "INSERT INTO student_info (id, name, dob, fname, mname, sex, nationality, religion, blood, subject, admission, address, studentid) VALUES ('0','"+name+"','"+dob+"','"+fname+"','"+mname+"','"+sex+"','"+nationality+"','"+religion+"','"+blood+"','"+subject+"','"+admission+"','"+address+"','"+sid+"')";
		   int num=stmt.executeUpdate(sql);
		   
		   return sid;
	   }
	   catch (Exception e) {
		
		   
	   }
	   return "error";
   }
   
   public String[] search(String id) {
	   String[] sinfo=new String[12];
	   try {
		   stmt = conn.createStatement();
		   String sql;
		   sql = "SELECT * FROM student_info WHERE studentid='"+id+"'";
		   ResultSet rs = stmt.executeQuery(sql);
		   while(rs.next()){
			   sinfo[0]=rs.getString("name");
			   sinfo[1]=rs.getString("dob");
			   sinfo[2]=rs.getString("fname");
			   sinfo[3]=rs.getString("mname");
			   sinfo[4]=rs.getString("sex");
			   sinfo[5]=rs.getString("nationality");
			   sinfo[6]=rs.getString("religion");
			   sinfo[7]=rs.getString("blood");
			   sinfo[8]=rs.getString("subject");
			   sinfo[9]=rs.getString("admission");
			   sinfo[10]=rs.getString("address");
			   sinfo[11]=rs.getString("studentid");
		   }
		   return sinfo;
	   }
	   catch (Exception e) {
		   StudentManagement.lblNewLabel.setText(e.getMessage());

		   return sinfo;
	   }
   }
   
   
   
   public static void main(String[] args) {

   System.out.println("Goodbye!");
}
}