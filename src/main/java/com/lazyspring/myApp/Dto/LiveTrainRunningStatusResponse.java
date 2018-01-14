package com.lazyspring.myApp.Dto;

import java.io.Serializable;
import java.util.List;

public class LiveTrainRunningStatusResponse implements Serializable{

	/**
	 * Author Lazy Don
	 */
	private static final long serialVersionUID = 1L;
	private Integer responseCode;
	private String message;
	private  String startDate;
	private Integer trainNumber;
	private String currentPostion;
	private LiveTrainRunningEachStationResponse currentStation;
	private List<LiveTrainRunningEachStationResponse> trainRoute;
	public Integer getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public Integer getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(Integer trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getCurrentPostion() {
		return currentPostion;
	}
	public void setCurrentPostion(String currentPostion) {
		this.currentPostion = currentPostion;
	}
	public LiveTrainRunningEachStationResponse getCurrentStation() {
		return currentStation;
	}
	public void setCurrentStation(LiveTrainRunningEachStationResponse currentStation) {
		this.currentStation = currentStation;
	}
	public List<LiveTrainRunningEachStationResponse> getTrainRoute() {
		return trainRoute;
	}
	public void setTrainRoute(List<LiveTrainRunningEachStationResponse> trainRoute) {
		this.trainRoute = trainRoute;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "LiveTrainRunningStatusResponse [responseCode=" + responseCode + ", message=" + message + ", startDate="
				+ startDate + ", trainNumber=" + trainNumber + ", currentPostion=" + currentPostion
				+ ", currentStation=" + currentStation + ", trainRoute=" + trainRoute + "]";
	}
	
	
}
