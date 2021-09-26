package com.plantplaces.dto;

public class SpecimenDTO {
	private int specimenID;
	private String lat;
	private String longit;
	private String desc;

	public int getSpecimenID() {
		return specimenID;
	}

	public void setSpecimenID(int specimenID) {
		this.specimenID = specimenID;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLongit() {
		return longit;
	}

	public void setLongit(String longit) {
		this.longit = longit;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {

		return specimenID + " " + lat + " " + longit + " " + desc;
	}
}
