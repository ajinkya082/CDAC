package io_programming;

import java.io.Serializable;

public class Flight implements Serializable{
	private String flightNo;
	private String airline;
	private String source;
	private String destination;
	public Flight() {
		
	}
	public Flight(String flightNo, String airline, String source, String destination) {
		super();
		this.flightNo = flightNo;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", airline=" + airline + ", source=" + source + ", destination="
				+ destination + "]";
	}
	
}
