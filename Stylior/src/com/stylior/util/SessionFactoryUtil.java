package com.stylior.util;

import java.sql.*;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class SessionFactoryUtil {
	private static SessionFactory sessionFactory = null;
	private static Connection connection = null;
	
	public static SessionFactory getSessionFactory(){
		if(sessionFactory == null){
			createSessionFactory();
		}
		return sessionFactory;
	}

	private static SessionFactory createSessionFactory() {
		if(sessionFactory != null){
			return sessionFactory;
		}else{
			@SuppressWarnings("deprecation")
			Configuration config = (Configuration) new AnnotationConfiguration().configure().buildSessionFactory();
			config.configure().buildSessionFactory();
			sessionFactory = config.buildSessionFactory();
			System.out.println("Success");
		}
	
		return sessionFactory;
	}
	
	public static Connection getConnection(){
		if(connection == null){
			createConnection();
		}
		return connection;
		}

	private static Connection createConnection() {
		try{
		Class.forName("com.mysql.jdbc.Driver");
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stylior","root","root");
		}catch(Exception e){
			e.printStackTrace();
		}
		 return connection;
		 
	}
}
