package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class cont2 {
	
	 @FXML Label l1,l2,l3,l4,l5,l6;
	 @FXML Label Sl;
	 @FXML Label Cl;
	 @FXML TextArea t1;
	 @FXML TextArea t2;
	 @FXML TextArea t3;
		//Nueral Network
		public void A1(ActionEvent event)
		{
				Connection con = null; try { Class.forName("com.mysql.cj.jdbc.Driver"); 
				final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; final String USER = "root"; final String PASS = ""; 
				final String DB_URL1 = "jdbc:mysql://127.0.0.1:3306/Articles";  
				System.setProperty(JDBC_DRIVER,""); con = DriverManager.getConnection(DB_URL1,USER,PASS); 
				Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery("select title,article from Article where a_id=1"); 
				while(rs.next()) l1.setText(((rs.getString(1)+"\n"+rs.getString(2))));
			
		} 
			catch (Exception e) 
			{ System.err.println("Exception: "+e.getMessage()); } 
			
		}
		//Blockchain
		public void A2(ActionEvent event)
		{
				Connection con = null; try { Class.forName("com.mysql.cj.jdbc.Driver"); 
				final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; final String USER = "root"; final String PASS = ""; 
				final String DB_URL1 = "jdbc:mysql://127.0.0.1:3306/Articles";  
				System.setProperty(JDBC_DRIVER,""); con = DriverManager.getConnection(DB_URL1,USER,PASS); 
				Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery("select title,article from Article where a_id=2"); 
				while(rs.next()) l2.setText(((rs.getString(1)+"\n"+rs.getString(2))));
			
		} 
			catch (Exception e) 
			{ System.err.println("Exception: "+e.getMessage()); } 
			
		}
		//Cloud Computing
		public void A3(ActionEvent event)
		{
				Connection con = null; try { Class.forName("com.mysql.cj.jdbc.Driver"); 
				final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; final String USER = "root"; final String PASS = ""; 
				final String DB_URL1 = "jdbc:mysql://127.0.0.1:3306/Articles";  
				System.setProperty(JDBC_DRIVER,""); con = DriverManager.getConnection(DB_URL1,USER,PASS); 
				Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery("select title,article from Article where a_id=3"); 
				while(rs.next()) l3.setText(((rs.getString(1)+"\n"+rs.getString(2))));
			
		} 
			catch (Exception e) 
			{ System.err.println("Exception: "+e.getMessage()); } 
			
		}
		//Robotics
		public void A4(ActionEvent event)
		{
				Connection con = null; try { Class.forName("com.mysql.cj.jdbc.Driver"); 
				final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; final String USER = "root"; final String PASS = ""; 
				final String DB_URL1 = "jdbc:mysql://127.0.0.1:3306/Articles";  
				System.setProperty(JDBC_DRIVER,""); con = DriverManager.getConnection(DB_URL1,USER,PASS); 
				Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery("select title,article from Article where a_id=4"); 
				while(rs.next()) l4.setText(((rs.getString(1)+"\n"+rs.getString(2))));
			
		} 
			catch (Exception e) 
			{ System.err.println("Exception: "+e.getMessage()); } 
		//Ai	
		}
		public void A5(ActionEvent event)
		{
				Connection con = null; try { Class.forName("com.mysql.cj.jdbc.Driver"); 
				final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; final String USER = "root"; final String PASS = ""; 
				final String DB_URL1 = "jdbc:mysql://127.0.0.1:3306/Articles";  
				System.setProperty(JDBC_DRIVER,""); con = DriverManager.getConnection(DB_URL1,USER,PASS); 
				Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery("select title,article from Article where a_id=5"); 
				while(rs.next()) l5.setText(((rs.getString(1)+"\n"+rs.getString(2))));
			
		} 
			catch (Exception e) 
			{ System.err.println("Exception: "+e.getMessage()); } 
			
		}
		//Flutter
		public void A6(ActionEvent event)
		{
				Connection con = null; try { Class.forName("com.mysql.cj.jdbc.Driver"); 
				final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; final String USER = "root"; final String PASS = ""; 
				final String DB_URL1 = "jdbc:mysql://127.0.0.1:3306/Articles";  
				System.setProperty(JDBC_DRIVER,""); con = DriverManager.getConnection(DB_URL1,USER,PASS); 
				Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery("select title,article from Article where a_id=6"); 
				while(rs.next()) l6.setText(((rs.getString(1)+"\n"+rs.getString(2))));
			
		} 
			catch (Exception e) 
			{ System.err.println("Exception: "+e.getMessage()); } 
			
		}
		//Subscribe Testcase
		public void SList(ActionEvent event)
		{		
				String s[]=new String[100];
				int i=0,n;
				Connection con = null; try { Class.forName("com.mysql.cj.jdbc.Driver"); 
				final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; final String USER = "root"; final String PASS = ""; 
				final String DB_URL1 = "jdbc:mysql://127.0.0.1:3306/Articles";  
				System.setProperty(JDBC_DRIVER,""); con = DriverManager.getConnection(DB_URL1,USER,PASS); 
				Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery("select * from Email"); 
				while(rs.next()) 
					{	
						s[i]=(rs.getString(1));
						i++;
					}
				for(n=1;n<i;n++)
					s[0]=s[0]+"\n"+s[n];
				Sl.setText("List of subscribers:"+"\n"+s[0]);
				}
				catch (Exception e) 
				{ System.err.println("Exception: "+e.getMessage()); } 
			
			
		}
		//Write article testcase.
		public void Contribute(ActionEvent event)
			{
				Connection con = null; try { Class.forName("com.mysql.cj.jdbc.Driver"); 
				final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; final String USER = "root"; final String PASS = ""; 
				final String DB_URL1 = "jdbc:mysql://127.0.0.1:3306/Articles";  
				System.setProperty(JDBC_DRIVER,""); con = DriverManager.getConnection(DB_URL1,USER,PASS); 
				Statement stmt=con.createStatement(); 
				String Contribution="insert into Contribution values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"')";
				if(t1.getText().isEmpty()||t2.getText().isEmpty()||t3.getText().isEmpty())
					Cl.setText("Please enter all details");
				else
					{
						Cl.setText("Thank you for your contribution!");
						stmt.executeUpdate(Contribution);
					}
				}
				catch (Exception e) 
				{ System.err.println("Exception: "+e.getMessage()); } 
				
				
			}
		
		//Return to Homepage
		public void back(ActionEvent event) throws IOException
			{
				Parent root=FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
				Scene myscene=new Scene(root);
				Stage window=(Stage)((Node) event.getSource()).getScene().getWindow();
				window.setScene(myscene);
				window.show();
					
			}
	

}
