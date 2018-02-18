package com.stylior.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "offline_order")
public class OrderDetails {
	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int orderId;
	
	@Column(name = "order_for")
	private String orderFor;
	
	@Column(name = "fabric")
	private String fabric;
	
	@Column(name = "sleeve")
	private String sleeve;
	
	@Column(name = "collar")
	private String collar;
	
	@Column(name = "cuff")
	private String cuff;
	
	@Column(name = "button")
	private String button;
	
	@Column(name = "pocket")
	private String pocket;
	
	@Column(name = "placket")
	private String placket;
	
	@Column(name = "back")
	private String back;
	
	@Column(name = "bottom_style")
	private String bottomStyle;
	
	@Column(name = "signature")
	private String signature;
	
	@Column(name = "outer_contrast")
	private String outerContrast;
	
	@Column(name = "inner_contrast")
	private String innerContrast;
	
	@Column(name = "order_date")
	private Date orderDate;
	
	@Column(name = "sync_status")
	private boolean syncStatus;
	
	@Column(name = "updated_date")
	private Date updatedDate;

	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderFor() {
		return orderFor;
	}

	public void setOrderFor(String orderFor) {
		this.orderFor = orderFor;
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

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	
	
}
