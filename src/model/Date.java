package model;

import javax.print.DocFlavor.STRING;

public class Date
{
	// Attributes
	/**
	* Descripción: This variable it's going to save the day of the class date <br>
	*/	
	private String day;
	/**
	* Descripción: This variable it's going to save the moth of the class date<br>
	*/	
	private String month;
	/**
	* Descripción: This variable it's going to save the year of the class date </br>
	*/		
	private String year;

	// Constructor without parameters
	/*
	public Date()
	{
		this.day = "NoDay";
		this.month = "NoCost";
		this.year = "NoDescription";
	}
	*/
	/**
	* Descripción: El metodo constructor va a crear los objetos de tipo Date<br>
	* <b> pre:</b> La variable day deben estar declarada</br>
	* La variable month deben estar declarada
	* La variable year deben estar declarada
	* <b> pos:</b> La variable day queda incializada
	* La variable month queda incializada
	* La variable year queda incializada
	* @param day String, Debe ser inicializada 
	* @param month String, Debe ser inicializada 
	* @param year String, Debe ser inicializada 	
	*/	

	// Constructor with parameters
	public Date (String day, String month, String year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// Accessors
	public String getDay()
	{
		return day;
	}
	public String getMonth()
	{
		return month;
	}
	public String getYear()
	{
		return year;
	}

	// Mutators
	public void setDay(String day)
	{
		this.day = day;
	}
	
	public void setMonth (String month)
	{
		this.month = month;

	}	
	public void setYear(String year)
	{
		this.year = year;	
	}

	/*
	// toString()
	public String toString()
	{
		return "\n Name: "+this.getName()+"\n ScientificZone: "+this.getScientificZone+"\n migratoryType:"+this.getMigratoryType+"\n Type:"+this.getType;
	}
	*/
}