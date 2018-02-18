package com.stylior.business;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.stylior.beans.ShirtDetails;
import com.stylior.util.SessionFactoryUtil;

public class OrderBusiness {

	public String createOrder(ShirtDetails orderDetailsInfo) {
		Session session = null;
		String response = "success";
		Transaction transaction = null;
		SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String strDate = formate.format(new Date());
		try{
			int cont = 0;
			Connection connection = SessionFactoryUtil.getConnection();
			if(connection != null){
				Statement st = connection.createStatement();
				
				String countQry = "select count(*) from offline_order";
				ResultSet rs = st.executeQuery(countQry);
				
				while(rs.next()){
					cont = rs.getInt(1);
				}
				cont = cont+1;
				String query = "INSERT INTO offline_order " +
                "VALUES ('"+cont+"'"
                		+ ",'"+orderDetailsInfo.getShirtDetails().getOrderFor()+"'"
                		+ ",'"+orderDetailsInfo.getShirtDetails().getFabric()+"'"
                		+ ",'"+orderDetailsInfo.getShirtDetails().getSleeve()+"'"
                		+ ",'"+orderDetailsInfo.getShirtDetails().getCollar()+"'"
                		+ ",'"+orderDetailsInfo.getShirtDetails().getCuff()+"'"
                		+ ",'"+orderDetailsInfo.getShirtDetails().getButton()+"'"
                		+ ",'"+orderDetailsInfo.getShirtDetails().getPocket()+"'"
                		+ ",'"+orderDetailsInfo.getShirtDetails().getPlacket()+"'"
                		+ ",'"+orderDetailsInfo.getShirtDetails().getBack()+"'"
                		+ ",'"+orderDetailsInfo.getShirtDetails().getBottomStyle()+"'"
                		+ ",'"+orderDetailsInfo.getShirtDetails().getSignature()+"'"
                		+ ",'"+orderDetailsInfo.getShirtDetails().getOuterContrast()+"'"
                		+ ",'"+orderDetailsInfo.getShirtDetails().getInnerContrast()+"'"
                		+ ",'"+strDate+"'"
                		+ ",'"+strDate+"'"
                		+ ",'"+0+"')";
				
				int executeStatus = st.executeUpdate(query);
				if(executeStatus ==1){
					String query1 = "INSERT INTO offline_order_details " +
			                "VALUES ('"+cont+"'"
			                		+ ",'"+orderDetailsInfo.getShirtMeasurements().getHeight()+"'"
			                		+ ",'"+orderDetailsInfo.getShirtMeasurements().getWidth()+"'"
			                		+ ",'"+orderDetailsInfo.getShirtMeasurements().getPosture()+"'"
			                		+ ",'"+orderDetailsInfo.getShirtMeasurements().getShouldertype()+"'"
			                		+ ",'"+orderDetailsInfo.getShirtMeasurements().getShoulderAngle()+"'"
			                		+ ",'"+orderDetailsInfo.getShirtMeasurements().getFit()+"'"
			                		+ ",'"+orderDetailsInfo.getShirtMeasurements().getCollor()+"'"
			                		+ ",'"+orderDetailsInfo.getShirtMeasurements().getShoulder()+"'"
			                		+ ",'"+orderDetailsInfo.getShirtMeasurements().getSleeve()+"'"
			                		+ ",'"+orderDetailsInfo.getShirtMeasurements().getArmhole()+"'"
			                		+ ",'"+orderDetailsInfo.getShirtMeasurements().getBicep()+"'"
			                		+ ",'"+orderDetailsInfo.getShirtMeasurements().getChest()+"'"
			                		+ ",'"+orderDetailsInfo.getShirtMeasurements().getWaist()+"'"
			                		+ ",'"+orderDetailsInfo.getShirtMeasurements().getHips()+"'"
			                		+ ",'"+orderDetailsInfo.getShirtMeasurements().getShirtlength()+"')";
							
							st.executeUpdate(query1);
				}
			}
			response += "/"+cont;
		/*SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		if(sessionFactory != null){
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(orderDetailsInfo.getShirtDetails());
			transaction.commit();
		}
		*/}catch(SQLException exception){
			response = "Problem While Connecting with Database";
		}catch(Exception e){
			response = "Something went wrong!!";
		}
		return response;
	}

}
