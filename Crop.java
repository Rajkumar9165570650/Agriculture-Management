package com.raj.bean;

public class Crop {
	private int cropId;
	private String cropname;
	private String cropSeason;
	private double cropRate;
	public Crop(int cropId, String cropname, String cropSeason, double cropRate) {
		super();
		this.cropId = cropId;
		this.cropname = cropname;
		this.cropSeason = cropSeason;
		this.cropRate = cropRate;
	}
	public int getCropId() {
		return cropId;
	}
	public void setCropId(int cropId) {
		this.cropId = cropId;
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public String getCropSeason() {
		return cropSeason;
	}
	public void setCropSeason(String cropSeason) {
		this.cropSeason = cropSeason;
	}
	public double getCropRate() {
		return cropRate;
	}
	public void setCropRate(double cropRate) {
		this.cropRate = cropRate;
	}
	

}
