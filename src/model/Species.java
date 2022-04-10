package model;

public class Species
{
	// Attributes
	/**
	* Descripción: This variable it's going to save the name's of the Species</br>
	*/
	private String name;
	/**
	* Descripción: This variable it's going to save the scientific name of the Species</br>
	*/	
	private String scientificName;
	/**
	* Descripción: This variable it's going to save the migratory Type of the Species</br>
	*/	
	private String migratoryType;
	/**
	* Descripción: This variable it's going to save the type of the Species</br>
	*/	
	private String type;

	// Constructor without parameters
	/*
	public Species()
	{
		this.name = "NoName";
		this.scientificZone = "NoScientificZone";
		this.migratoryType = "NoMigratoryType";
		this.type = "";
	}
	*/
	/**
	* Descripción: El metodo constructor va a crear los objetos de tipo Species<br>
	* <b> pre:</b> La variable name deben estar declarada</br>
	* La variable migratoryType deben estar declarada
	* La variable scientificZone deben estar declarada
	* La variable type deben estar declarada
	* <b> pos:</b> La variable name queda incializada
	* La variable scientificZone queda incializada
	* La variable migratoryType queda incializada
	* La variable type queda incializada
	* @param name String, Debe ser inicializada 
	* @param scientificName String, Debe ser inicializada 
	* @param migratoryType String, Debe ser inicializada 
	* @param type double, Debe ser inicializada 
	*/
	// Constructor with parameters
	public Species(String name, String scientificName, String migratoryType, String type)
	{
		this.name = name;
		this.scientificName = scientificName;
		this.migratoryType = migratoryType;
		this.type = type;
	}

	// Accessors
	public String getName()
	{
		return name;
	}
	public String getScientificName()
	{
		return scientificName;
	}
	public String getMigratoryType()
	{
		return migratoryType;
	}
	public String getType()
	{
		return type;
	}

	// Mutators
	public void setName(String name)
	{
		this.name = name;
	}
	public void setscientificName(String scientificName)
	{
		this.scientificName = scientificName;
	}
	public void setMigratoryType(String migratoryType)
	{
		this.migratoryType = migratoryType;
	}
	public void setType(String type)
	{
		this.type = type;
	}


	// toString()
	/** 
	public String toString()
	{
		return "\n Name: "+this.getName()+"\n ScientificZone: "+this.scientificName+"\n migratoryType:"+this.getMigratoryType+"\n Type:"+this.getType;
	}
	*/
}