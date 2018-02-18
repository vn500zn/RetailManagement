package com.stylior.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "offline_order_details")
public class OrderDetailsMeaserements {
	
	@Id
	@Column(name = "order_id")
	private String orderId;
	
	@Column(name = "height")
	private String height;
	
	@Column(name = "width")
	private String width;
	
	@Column(name = "posture")
	private String posture;
	
	@Column(name = "shoulder_type")
	private String shoulderType;
	
	@Column(name = "shoulder_angle")
	private String shoulderAngle;
	
	@Column(name = "fit")
	private String fit;
	
	@Column(name = "collar")
	private String collar;
	
	@Column(name = "shoulder")
	private String shoulder;
	
	@Column(name = "sleeve_length")
	private String sleeveLength;
	
	@Column(name = "armhole")
	private String armhole;
	
	@Column(name = "bicep")
	private String bicep;
	
	@Column(name = "chest")
	private String chest;
	
	@Column(name = "waist")
	private String waist;
	
	@Column(name = "hips")
	private String hips;
	
	@Column(name = "shirt_length")
	private String shirtLength;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getPosture() {
		return posture;
	}

	public void setPosture(String posture) {
		this.posture = posture;
	}

	public String getShoulderType() {
		return shoulderType;
	}

	public void setShoulderType(String shoulderType) {
		this.shoulderType = shoulderType;
	}

	public String getShoulderAngle() {
		return shoulderAngle;
	}

	public void setShoulderAngle(String shoulderAngle) {
		this.shoulderAngle = shoulderAngle;
	}

	public String getFit() {
		return fit;
	}

	public void setFit(String fit) {
		this.fit = fit;
	}

	public String getCollar() {
		return collar;
	}

	public void setCollar(String collar) {
		this.collar = collar;
	}

	public String getShoulder() {
		return shoulder;
	}

	public void setShoulder(String shoulder) {
		this.shoulder = shoulder;
	}

	public String getSleeveLength() {
		return sleeveLength;
	}

	public void setSleeveLength(String sleeveLength) {
		this.sleeveLength = sleeveLength;
	}

	public String getArmhole() {
		return armhole;
	}

	public void setArmhole(String armhole) {
		this.armhole = armhole;
	}

	public String getBicep() {
		return bicep;
	}

	public void setBicep(String bicep) {
		this.bicep = bicep;
	}

	public String getChest() {
		return chest;
	}

	public void setChest(String chest) {
		this.chest = chest;
	}

	public String getWaist() {
		return waist;
	}

	public void setWaist(String waist) {
		this.waist = waist;
	}

	public String getHips() {
		return hips;
	}

	public void setHips(String hips) {
		this.hips = hips;
	}

	public String getShirtLength() {
		return shirtLength;
	}

	public void setShirtLength(String shirtLength) {
		this.shirtLength = shirtLength;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
