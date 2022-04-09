package model;

public class Event
{
	// Attributes
	/**
	* Descripción: This variable it's going to save the name of the Event</br>
	*/	
	private String manager;
	/**
	* Descripción: This variable it's going to save the cost of the Event</br>
	*/	
	private double cost;
	/**
	* Descripción: This variable it's going to save the description of the Event</br>
	*/	
	private String description;

	// Constructor without parameters
	/*
	public Event()
	{
		this.manager = "NoManager";
		this.cost = "NoCost";
		this.description = "NoDescription";
	}
	*/

	/**
	* Descripción: El metodo constructor va a crear los objetos de tipo Events<br>
	* <b> pre:</b> La variable manager deben estar declarada</br>
	* La variable cost deben estar declarada
	* La variable description deben estar declarada
	* <b> pos:</b> La variable manager queda incializada
	* La variable cost queda incializada
	* La variable description queda incializada
	* @param manager String, Debe ser inicializada 
	* @param cost double, Debe ser inicializada 
	* @param description String, Debe ser inicializada 
	*/	

	// Constructor with parameters
	public Event (String manager, double cost, String description)
	{
		this.manager = manager;
		this.cost = cost;
		this.description = description;
	}

	// Accessors
	public String getManager()
	{
		return manager;
	}
	public Double getCost()
	{
		return cost;
	}
	public String getDescription()
	{
		return description;
	}

	// Mutators
	public void setManager(String manager)
	{
		this.manager = manager;
	}
	
	public void setCost(double cost)
	{
		this.cost = cost;

	}	
	public void setDescription(String description)
	{
		this.description = description;	
	}

	/*
	// toString()
	public String toString()
	{
		return "\n Name: "+this.getName()+"\n ScientificZone: "+this.getScientificZone+"\n migratoryType:"+this.getMigratoryType+"\n Type:"+this.getType;
	}
	*/
}