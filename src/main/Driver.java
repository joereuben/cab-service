/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *A driver class to represent each driver
 * @author MBEAH
 */
public class Driver {
    
    //driver properties
    private int id;
    private String name;
    private int jobs;
    private Double takings;
    private Double percentage;

    public Driver() {
        
    }

    /**
     * Constructor
     * @param id driver id
     * @param name driver name
     * @param jobs number of jobs done by driver
     * @param takings total amount driver accrued from jobs
     * @param percentage drivers percentage
     */
    public Driver(int id, String name, int jobs, Double takings, Double percentage) {
        this.id = id;
        this.name = name;
        this.jobs = jobs;
        this.takings = takings;
        this.percentage = percentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJobs() {
        return jobs;
    }

    public void setJobs(int jobs) {
        this.jobs = jobs;
    }

    public Double getTakings() {
        return takings;
    }

    public void setTakings(Double takings) {
        this.takings = takings;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
    
    
}
