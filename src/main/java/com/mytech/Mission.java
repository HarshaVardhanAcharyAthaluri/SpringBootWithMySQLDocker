package com.mytech;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mission {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer missionId;
	private String missionName;
	private String missionStatus;
	
	public Integer getMissionId() {
		return missionId;
	}
	public void setMissionId(Integer missionId) {
		this.missionId = missionId;
	}
	public String getMissionName() {
		return missionName;
	}
	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}
	public String getMissionStatus() {
		return missionStatus;
	}
	public void setMissionStatus(String missionStatus) {
		this.missionStatus = missionStatus;
	}
	
	
}
