package com.lazyspring.myApp.Dto;

public class LiveTrainRunningEachStationResponse {

    	private Integer serialNo;
	private String stationName;
	private String stationCode;
	private Integer distance;
	private Boolean isDeparted;
	private Integer day;
	private String actualArrival;
	private String scheduledArrival;
	private String scheduledArrivalDate;
	private String scheduledDeparture;
	private Boolean isArrived;
	private String actualDeparture;
	private String actualArrivalDate;
	private Integer lateInMinute;
	private String status;
	
	public Integer getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getStationCode() {
		return stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	public Boolean getIsDeparted() {
		return isDeparted;
	}
	public void setIsDeparted(Boolean isDeparted) {
		this.isDeparted = isDeparted;
	}
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public String getActualArrival() {
		return actualArrival;
	}
	public void setActualArrival(String actualArrival) {
		this.actualArrival = actualArrival;
	}
	public String getScheduledArrival() {
		return scheduledArrival;
	}
	public void setScheduledArrival(String scheduledArrival) {
		this.scheduledArrival = scheduledArrival;
	}
	public String getScheduledArrivalDate() {
		return scheduledArrivalDate;
	}
	public void setScheduledArrivalDate(String scheduledArrivalDate) {
		this.scheduledArrivalDate = scheduledArrivalDate;
	}
	public String getScheduledDeparture() {
		return scheduledDeparture;
	}
	public void setScheduledDeparture(String scheduledDeparture) {
		this.scheduledDeparture = scheduledDeparture;
	}
	public Boolean getIsArrived() {
		return isArrived;
	}
	public void setIsArrived(Boolean isArrived) {
		this.isArrived = isArrived;
	}
	public String getActualDeparture() {
		return actualDeparture;
	}
	public void setActualDeparture(String actualDeparture) {
		this.actualDeparture = actualDeparture;
	}
	public String getActualArrivalDate() {
		return actualArrivalDate;
	}
	public void setActualArrivalDate(String actualArrivalDate) {
		this.actualArrivalDate = actualArrivalDate;
	}
	public Integer getLateInMinute() {
		return lateInMinute;
	}
	public void setLateInMinute(Integer lateInMinute) {
		this.lateInMinute = lateInMinute;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LiveTrainRunningCurrentStation [serialNo=" + serialNo + ", stationName=" + stationName
				+ ", stationCode=" + stationCode + ", distance=" + distance + ", isDeparted=" + isDeparted + ", day="
				+ day + ", actualArrival=" + actualArrival + ", scheduledArrival=" + scheduledArrival
				+ ", scheduledArrivalDate=" + scheduledArrivalDate + ", scheduledDeparture=" + scheduledDeparture
				+ ", isArrived=" + isArrived + ", actualDeparture=" + actualDeparture + ", actualArrivalDate="
				+ actualArrivalDate + ", lateInMinute=" + lateInMinute + ", status=" + status + "]";
	}
	
	
}
