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
    /**
     * @return String return the name
     */		
	public String getName()
	{
		return name;
	}
    /**
     * @return String return the scientificName
     */		
	public String getScientificName()
	{
		return scientificName;
	}

    /**
     * @return String return the migratoryType
     */		
	public String getMigratoryType()
	{
		return migratoryType;
	}

    /**
     * @return String return the type
     */		
	public String getType()
	{
		return type;
	}

	// Mutators
	/**
     * @param name the name to set
     */		
	public void setName(String name)
	{
		this.name = name;
	}

	/**
     * @param scientificName the scientificName to set
     */		
	public void setscientificName(String scientificName)
	{
		this.scientificName = scientificName;
	}
	
	/**
     * @param migratoryType the migratoryType to set
     */		
	public void setMigratoryType(String migratoryType)
	{
		this.migratoryType = migratoryType;
	}
	
	
	/**
     * @param type the type to set
     */		
	public void setType(String type)
	{
		this.type = type;
	}


	// toString()
	/** 
	* Descripción: This method prints the information of the species <br>
	* <b> pre:</b> name, scientific name, migratory type and type has to be incializated <br>
	* @return String, return the geters of the species
	*/
	public String toStringSpecies()
	{
		return "\n Normal name: "+this.getName()+
		"\n Scientific Zone: "+this.getScientificName()+
		"\n Migratory Type: "+this.getMigratoryType()+
		"\n Type: "+this.getType()+
		"\n";
	}
	
}