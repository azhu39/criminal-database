/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW3;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import javax.imageio.ImageIO;

/**
 *
 * @author andrew.abel
 */
public class Person {

    // Instance variables
    private String firstName;
    private String familyName;
    private String nickname;
    private int reward;
    private String nationality;
    private String idCode;
    private String crimes;
    private LocalDate dob;
    private Image photo;

    public Person(String[] info) {
        // Constructor to take a String array and assign it to instance variables

        // Complete this method
    	this.firstName=info[0].trim();
    	this.familyName=info[1].trim();
    	this.nickname=info[2].trim();
    	this.reward=Integer.parseInt(info[3].trim());
    	this.nationality=info[4].trim();
    	this.idCode=info[5].trim();
    	this.crimes=info[6].trim();
    	this.dob=convertDateOfBirth(info[7].trim());
    	this.photo=readImage(info[8].trim());
    	
    }

    public Person(String line) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        // Constructor to take a single string, the entire line of a file, and assign
        // it to instance variables

        // Complete this method
    	String[] personDetails = line.split(",");
    	this.firstName = personDetails[0].trim();
    	this.familyName = personDetails[1].trim();
    	this.nickname = personDetails[2].trim();
    	this.reward=Integer.parseInt(personDetails[3].trim());
    	this.nationality = personDetails[4].trim();
    	this.idCode = personDetails[5].trim();
    	this.crimes = personDetails[6].trim();
    	dob=convertDateOfBirth(personDetails[7].trim());
    	photo=readImage(personDetails[8].trim());
    }

    public BufferedImage readImage(String filename) {
        // Read an image from a file and return a Buffered image
    	BufferedImage image = null;
    	try {
			image=ImageIO.read(new File(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Read image error!");
		}
        // Complete this method
        // Return temporary value, change this
        return image;
    }

    public LocalDate convertDateOfBirth(String inputDate) {
        // Take a date input String and convert to a local date
        // If the date is an incorrect value, assign a default value of 1/1/1991
    	boolean isValid = false;
    	String[] dayMonthYear = inputDate.split("/");
    	int dayInt=Integer.parseInt(dayMonthYear[0]);
    	int monthInt=Integer.parseInt(dayMonthYear[1]);
    	int yearInt=Integer.parseInt(dayMonthYear[2]);
    	LocalDate ld = LocalDate.of(1991,1,1);
    	if((monthInt==1)||(monthInt==3)||(monthInt==5)||(monthInt==7)||(monthInt==8)||(monthInt==10)||(monthInt==12))
    	{
    		if((dayInt>=1)&&(dayInt<=31))
    		{
    			isValid=true;
    		}
    	}
    	else if((monthInt==4)||(monthInt==6)||(monthInt==9)||(monthInt==11))
		{
			if((dayInt>=1)&&(dayInt<=30))
    		{
				isValid=true;
    		}
		}
    	else if(yearInt%4==0)
    	{
    		 if (monthInt==2)
    		{
    			if((dayInt>=1)&&(dayInt<=29))
        		{
    				isValid=true;
        		}
    		}
    	}
    	else if(yearInt%4!=0)
    	{
    		 if (monthInt==2)
     		{
     			if((dayInt>=1)&&(dayInt<=28))
         		{
     				isValid=true;
         		}
     		}
    	}
    	if(isValid==true)
    	{
    		 ld =LocalDate.of(yearInt,monthInt,dayInt);
    	}
    	
        // Complete this method
        // Return temporary value, change this
        return ld;
    }

    public int getAgeinYears() {
        // return the age of the person in years

        // Complete this method
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public String toString() {
        // Output method as String

        // Do not change!
        String out = "***\n" + getIdCode() + ", " + getFirstName() + " "
                + getFamilyName() + ", Reward: " + getReward() + ", " + getNationality()
                + ", " + getDob().toString() + ", " + getNickname() + ", " + getCrimes();

        return out;
    }

    // All getters are completed, do not change
    public String getFirstName() {

        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public int getReward() {
        return reward;
    }

    public String getNationality() {
        return nationality;
    }

    public String getIdCode() {
        return idCode;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Image getPhoto() {
        return photo;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCrimes() {
        return crimes;
    }

}
