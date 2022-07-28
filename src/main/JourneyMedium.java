/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class to help fetch and process all journey data from database
 * @author MBEAH
 */
public class JourneyMedium {
    
    //Class properties
    private ArrayList<Journey> journeys; // a list of journeys
    private FileReader fileReader; // to read data from a file
    private Scanner scanner; // to user file reader read data from a file
    private PrintWriter printWriter; // to write data to a file
    private MySqlConnector mySqlConnector; // to connect to mysql database
    
    private static String JOURNEY_DATA = "datafiles/journey.txt"; // text file storage
    private static String EOL = "\n";
    private String currentJourneys = "";
    /**
     * Constructor to initialize ArrayList of journeys
     * @param journeys ArrayList of journey objects
     */
    public JourneyMedium(ArrayList<Journey> journeys) {
        this.journeys = journeys;
    }

    /**
     * Class Constructor. Initializes empty ArrayList
     */
    public JourneyMedium() {
        journeys = new ArrayList<Journey>();
        mySqlConnector = new MySqlConnector();
        fetchJourneys();

        
    }
    
//    public boolean createNewJourney(Journey journey){
//        this.journeys.add(journey);
//        return saveJourneys();
//    }
    
    /**
     * To add a new journey to database
     * @param journey the journey object
     * @param dispatchId the id of dispatcher creating journey (current logged in dispatcher)
     * @return true if successful
     */
    public boolean addNewJourney(Journey journey, String dispatchId){
        String q = "INSERT INTO journey (starttime, pickuppoint, destination, driverid, "
                    + "passengername, accountname, phone, fare, tip, dispatchid) "
                    + "VALUES ( '"+journey.getStartTime()+"', '"+journey.getPickupPoint()+"',"
                    + " '"+journey.getDestination()+"', '"+journey.getDriversId()+"',"
                    + " '"+journey.getPassengerName()+"', '"+journey.getAccountName()+"',"
                    + " '"+journey.getPhoneNumber()+"', '"+journey.getFare()+"',"
                    + " '"+journey.getOptionalTip()+"', '"+dispatchId+"')";
           
//        System.out.println(q);
        boolean res = mySqlConnector.queryExecute(q);
        fetchJourneys(); // load all journeys from db
        return res;
    }
    /**
     * Saves all journey data into database
     * @return true if successful, false if error occurred
     */
    public boolean saveJourneys(){
        
        for (Journey journey : journeys) {
            
            String q = "INSERT INTO journey ( starttime, pickuppoint, destination, driverid,"
                    + "passengername, accountname, phone, fare, tip)"
                    + "VALUES ( '"+journey.getStartTime()+"', '"+journey.getPickupPoint()+"',"
                    + " '"+journey.getDestination()+"', '"+journey.getDriversId()+"',"
                    + " '"+journey.getPassengerName()+"', '"+journey.getAccountName()+"',"
                    + " '"+journey.getPhoneNumber()+"', '"+journey.getFare()+"', '"+journey.getOptionalTip()+"')";
            
            mySqlConnector.queryExecute(q);
        }
        
       
        return true;
    }
    
    /**
     * Update the data for a journey, when edited
     * @param journey the journey whose data needs to be saved
     * @return 
     */
    public boolean updateJourney(Journey journey){
        String q = "UPDATE journey SET starttime = '"+journey.getStartTime()+"',  pickuppoint = '"+journey.getPickupPoint()+"',"
                + " destination = '"+journey.getDestination()+"', driverid = '"+journey.getDriversId()+"',"
                    + "passengername = '"+journey.getPassengerName()+"', accountname = '"+journey.getAccountName()+"',"
                + " phone = '"+journey.getPhoneNumber()+"', fare = '"+journey.getFare()+"', tip = '"+journey.getOptionalTip()+"' "
                    + "WHERE id ='"+journey.getJourneyId()+"' ";
            
        mySqlConnector.queryExecute(q);
        return true;
    }
    
    /**
     * Reads all journey data from file, creates journey objects from each and saves into ArrayList
     */
    public void fetchJourneys(){  
        ResultSet resultSet = mySqlConnector.query("SELECT * FROM journey");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {                
                    Journey journey = new Journey();
                    journey.setJourneyId(resultSet.getString("id"));// get journey id
                    journey.setStartTime(resultSet.getString("starttime"));
                    journey.setPickupPoint(resultSet.getString("pickuppoint"));
                    journey.setDestination(resultSet.getString("destination"));
                    journey.setDriversId(resultSet.getInt("driverid"));
                    journey.setPassengerName(resultSet.getString("passengername"));
                    journey.setAccountName(resultSet.getString("accountname"));
                    journey.setPhoneNumber(resultSet.getString("phone"));
                    journey.setFare(resultSet.getDouble("fare"));
                    journey.setOptionalTip(resultSet.getDouble("tip"));
                    journey.setDispatchId(resultSet.getString("dispatchid"));
                    journey.setDate(resultSet.getString("date"));

                    journeys.add(journey);
                }
                resultSet.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
        
           
    }

    public ArrayList<Journey> getJourneys() {
        return journeys;
    }
    
    public int getJourneysCount() {
        return journeys.size();
    }
    
    public Journey findJourney(String JourneyID){
        for (Journey journey : journeys) {
            if (journey.getJourneyId().equalsIgnoreCase(JourneyID)) {
                return journey;
            }
        }
        return null;
    }
    
    public double getTotalAmount(){
        double amount = 0;
        for (Journey j : journeys) {
           amount +=  j.getFare();
        }
        return amount;
    }
    
//    public static void main(String[] args) {
//        JourneyMedium medium = new JourneyMedium();
////        medium.fetchJourneys();
//       // medium.saveJourneys();
//    }
}
