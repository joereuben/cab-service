/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 * A class to represent each journey
 * @author MBEAH
 */
public class Journey {
    
    //Journey Object properties
    private String journeyId;//J#
    private String startTime;
    private String pickupPoint;
    private String destination;
    private int driversId;
    private String passengerName;
    private double fare;
    private double optionalTip;
    private String accountName;
    private String phoneNumber;
    private String dispatchId;
    private String date;
   
    
    public Journey(){
        
    }

    public String getStartTime() {
        return startTime;
    }

    /**
     * Constructor for a journey object
     * @param startTime the start time of the journey
     * @param pickupPoint the pickup point
     * @param destination the destination
     * @param driversId the drivers id
     * @param passengerName the passenger's name
     * @param fare the fare
     * @param optionalTip the tip
     * @param accountName // if it's an account job, the account name
     * @param phoneNumber // the phone number
     */
    public Journey(String startTime, String pickupPoint, String destination, int driversId, String passengerName,
            double fare, double optionalTip, String accountName, String phoneNumber) {
        this.startTime = startTime;
        this.pickupPoint = pickupPoint;
        this.destination = destination;
        this.driversId = driversId;
        this.passengerName = passengerName;
        this.fare = fare;
        this.optionalTip = optionalTip;
        this.accountName = accountName;
        this.phoneNumber = phoneNumber;
    }

    public String getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(String journeyId) {
        this.journeyId = journeyId;
    }

    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getPickupPoint() {
        return pickupPoint;
    }

    public void setPickupPoint(String pickupPoint) {
        this.pickupPoint = pickupPoint;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDriversId() {
        return driversId;
    }

    public void setDriversId(int driversId) {
        this.driversId = driversId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public double getOptionalTip() {
        return optionalTip;
    }

    public void setOptionalTip(double optionalTip) {
        this.optionalTip = optionalTip;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(String dispatchId) {
        this.dispatchId = dispatchId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
}
