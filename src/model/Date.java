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
	public Date (String day, String month, String year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// Accessors

    /**
     * @return String return the day
     */	
	public String getDay()
	{
		return day;
	}

    /**
     * @return String return the month
     */	
	public String getMonth()
	{
		return month;
	}

    /**
     * @return String return the year
     */	
	public String getYear()
	{
		return year;
	}

	// Mutators
	/**
     * @param day the day to set
     */
	public void setDay(String day)
	{
		this.day = day;
	}
	
	/**
     * @param month the month to set
     */	
	public void setMonth (String month)
	{
		this.month = month;
	}		
	
	/**
     * @param year the year to set
     */		
	public void setYear(String year)
	{
		this.year = year;	
	}

	/** 
	* Descripción: This method prints the information of the date <br>
	* <b> pre:</b> day, month and year has to be incializated <br>
	* @return String, return the geters of the date
	*/	
	public String toString()
	{
		return "\n The day: "+this.getDay()+
		" \n The month: "+this.getMonth()+
		" \n The year: "+this.getYear()+
		"\n";
	}
	
}