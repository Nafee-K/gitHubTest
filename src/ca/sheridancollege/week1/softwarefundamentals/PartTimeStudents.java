/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author Nafee
 */
public class PartTimeStudents extends Student{
    private int noOfHours; //Number of credit hours.
    
    /**
     * Subclass constructor.
     */
    public PartTimeStudents(String name, String stdId, int hours){
        super(name, stdId);
        this.noOfHours;
    }

    /**
     * @return the noOfHours
     */
    public int getNoOfHours() {
        return noOfHours;
    }

    /**
     * @param noOfHours the noOfHours to set
     */
    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }
    
    
}
