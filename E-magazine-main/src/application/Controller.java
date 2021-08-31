package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

	@FXML TextField t;
	@FXML Label l1;
	//About us
	public void Aus(ActionEvent event) throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("/application/AboutUs.fxml"));
		Scene myscene=new Scene(root);
		Stage window=(Stage)((Node) event.getSource()).getScene().getWindow();
		window.setScene(myscene);
		window.show();
	}
	
	  //Nueral Networks.    
	public void H1(ActionEvent event) throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("/application/NueralNetwork.fxml"));
		Scene myscene=new Scene(root);
		Stage window=(Stage)((Node) event.getSource()).getScene().getWindow();
		window.setScene(myscene);
		window.show();
	}
	//Blockchain
	public void H2(ActionEvent event) throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("/application/Blockchain.fxml"));
		Scene myscene=new Scene(root);
		Stage window=(Stage)((Node) event.getSource()).getScene().getWindow();
		window.setScene(myscene);
		window.show();
	}
	//CloudComputing
	public void H3(ActionEvent event) throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("/application/CloudComputing.fxml"));
		Scene myscene=new Scene(root);
		Stage window=(Stage)((Node) event.getSource()).getScene().getWindow();
		window.setScene(myscene);
		window.show();
	}
	//Robotics
	public void H4(ActionEvent event) throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("/application/Robotics.fxml"));
		Scene myscene=new Scene(root);
		Stage window=(Stage)((Node) event.getSource()).getScene().getWindow();
		window.setScene(myscene);
		window.show();
	}
	//Ai
	public void H5(ActionEvent event) throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("/application/Ai.fxml"));
		Scene myscene=new Scene(root);
		Stage window=(Stage)((Node) event.getSource()).getScene().getWindow();
		window.setScene(myscene);
		window.show();
	}
	//Flutter
	public void H6(ActionEvent event) throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("/application/Flutter.fxml"));
		Scene myscene=new Scene(root);
		Stage window=(Stage)((Node) event.getSource()).getScene().getWindow();
		window.setScene(myscene);
		window.show();
	}
	
	

	//Subscribe Testcase.
	public void ViewSubscribers(ActionEvent event) throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("/application/Subscribers.fxml"));
		Scene myscene=new Scene(root);
		Stage window=(Stage)((Node) event.getSource()).getScene().getWindow();
		window.setScene(myscene);
		window.show();
		
	}
	 
	public void Subscribe(ActionEvent event)
	{
		Connection con = null; try { Class.forName("com.mysql.cj.jdbc.Driver"); 
		final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; final String USER = "root"; final String PASS = ""; 
		final String DB_URL1 = "jdbc:mysql://127.0.0.1:3306/Articles";  
		System.setProperty(JDBC_DRIVER,""); con = DriverManager.getConnection(DB_URL1,USER,PASS); 
		Statement stmt=con.createStatement(); 
		String email="insert into Email values('"+t.getText()+"')";
		if(t.getText().isEmpty())
			l1.setText("Please enter your mail-id");
		else 
			{
				l1.setText("You have subscribed successfully!");
				stmt.executeUpdate(email);
			}
		}
		catch (Exception e) 
		{ System.err.println("Exception: "+e.getMessage()); } 
		
		
	}
	//Write Testcase
	public void Contribution(ActionEvent event) throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("/application/write.fxml"));
		Scene myscene=new Scene(root);
		Stage window=(Stage)((Node) event.getSource()).getScene().getWindow();
		window.setScene(myscene);
		window.show();
		
	}
	
}

