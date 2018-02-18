package com.stylior.beans;

import java.util.Date;
/**
 * 
 * @author karnam karthimp
 *
 */
public class OrderOffline {

	private String fabric;
	private String sleeve;
	private String collar;
	private String cuff;
	private String button;
	private String pocket;
	private String placket;
	private String back;
	private String bottomStyle;
	private String signature;
	private String outerContrast;
	private String innerContrast;
	private Date orderDate;
	private boolean syncStatus;
	private String orderFor;
	private int orderId;
	
	
	public String getOrderFor() {
		return orderFor;
	}
	public void setOrderFor(String orderFor) {
		this.orderFor = orderFor;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public boolean isSyncStatus() {
		return syncStatus;
	}
	public void setSyncStatus(boolean syncStatus) {
		this.syncStatus = syncStatus;
	}
	public String getFabric() {
		return fabric;
	}
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}
	public String getSleeve() {
		return sleeve;
	}
	public void setSleeve(String sleeve) {
		this.sleeve = sleeve;
	}
	public String getCollar() {
		return collar;
	}
	public void setCollar(String collar) {
		this.collar = collar;
	}
	public String getCuff() {
		return cuff;
	}
	public void setCuff(String cuff) {
		this.cuff = cuff;
	}
	public String getButton() {
		return button;
	}
	public void setButton(String button) {
		this.button = button;
	}
	public String getPocket() {
		return pocket;
	}
	public void setPocket(String pocket) {
		this.pocket = pocket;
	}
	public String getPlacket() {
		return placket;
	}
	public void setPlacket(String placket) {
		this.placket = placket;
	}
	public String getBack() {
		return back;
	}
	public void setBack(String back) {
		this.back = back;
	}
	public String getBottomStyle() {
		return bottomStyle;
	}
	public void setBottomStyle(String bottomStyle) {
		this.bottomStyle = bottomStyle;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getOuterContrast() {
		return outerContrast;
	}
	public void setOuterContrast(String outerContrast) {
		this.outerContrast = outerContrast;
	}
	public String getInnerContrast() {
		return innerContrast;
	}
	public void setInnerContrast(String innerContrast) {
		this.innerContrast = innerContrast;
	}
	
	
	
}
