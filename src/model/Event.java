package model;

public class Event
{
	// Attributes
	/**
	* Descripción: This variable it's going to save the name of the Event<br>
	*/	
	private String manager;
	/**
	* Descripción: This variable it's going to save the cost of the Event<br>
	*/	
	private double cost;
	/**
	* Descripción: This variable it's going to save the description of the Event<br>
	*/	
	private String description;
	/**
	* Descripción: This variable it's going to allow the Event use a date <br>
	*/	
	private Date date;
	/**
	* Descripción: The constructor method it's going to create the objects of type event <br>
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
	public Event (String manager, double cost, String description, Date date)	// Constructor with parameters
	{
		this.manager = manager;
		this.cost = cost;
		this.description = description;
		this.date=date;
	}

	// Accessors
    /**
     * @return String return the manager
     */	
	public String getManager()
	{
		return manager;
	}

    /**
     * @return double return the cost
     */	
	public Double getCost()
	{
		return cost;
	}

    /**
     * @return String return the description
     */	
	public String getDescription()
	{
		return description;
	}

	// Mutators

	/**
     * @param manager the manager to set
     */	
	public void setManager(String manager)
	{
		this.manager = manager;
	}	

	/**
     * @param cost the cost to set
     */		
	public void setCost(double cost)
	{
		this.cost = cost;
	}	

	/**
     * @param description the description to set
     */			
	public void setDescription(String description)
	{
		this.description = description;	
	}

	
	// toString()
	/** 
	* Descripción: This method prints the information of the event<br>
	* <b> pre:</b> type, percentaje and date has to be incializated <br>
	* @return String, return the geters of the envoirmental managment
	*/	
	public String toString()
	{
		return "\n The manager of the event it's: "+this.getManager()+
		"\n The cost of the event it's: "+this.getCost()+
		"\n The description of the event it's: "+this.getDescription();	
	}
	
}