package model;

public class Wetland
{
	/**
	* Descripción: This variable it's going to save the name's of the Wetlands</br>
	*/
	private String name;
	/**
	* Descripción: This variable it's going to save the location of the Wetland </br>
	*/
	private int locationZone;
	/**
	* Descripción: This variable it's going to save the type of the Wetland </br>
	*/
	private int type;
	/**
	* Descripción: This variable it's going to save the size of the Wetland </br>
	*/
	private	double size;
	/**
	* Descripción: This variable it's going to save a picture of the Wetland </br>
	*/
	private String urlPicture;
	/**
	* Descripción: This variable it's going to let you chose the option of the Wetland if it's protected</br>
	*/
	private boolean protection;
	/**
	* Descripción: This variable it's going to save the name of the zone with the location of the Wetland </br>
	*/
	private String nameOfTheZone;

    public  Species[] species;
	public static final int MAX_SPECIES = 80;

	

	//Relaciones
	/*
	private Species SpeciesOfWetlan;

	/**
	* Descripción: El metodo constructor va a crear los objetos de tipo wetland<br>
	* <b> pre:</b> La variable name deben estar declarada</br>
	* La variable locationZone deben estar declarada
	* La variable type deben estar declarada
	* La variable size deben estar declarada
	* La variable urlPicture deben estar declarada
	* La variable protection deben estar declarada
	* La variable nameOfTheZone deben estar declarada
	* <b> pos:</b> La variable name queda incializada
	* La variable locationZone queda incializada
	* La variable type queda incializada
	* La variable size queda incializada
	* La variable urlPicture queda incializada
	* La variable protection queda incializada
	* La variable nameOfTheZone queda incializada 
	* @param name String, Debe ser inicializada 
	* @param locationZone int, Debe ser inicializada 
	* @param type int, Debe ser inicializada 
	* @param size double, Debe ser inicializada 
	* @param urlPicture String, Debe ser inicializada 
	* @param protection urlPicture, Debe ser inicializada 
	* @param nameOfTheZone urlPicture, Debe ser inicializada 
	*/

	// Constructor with parameters
	public Wetland (String name, int locationZone, int type,double size,String urlPicture, boolean protection, String nameOfTheZone)
	{
		this.name = name;
		this.locationZone = locationZone;
		this.type = type;
		this.size= size;
		this.urlPicture=urlPicture;
		this.protection=protection;
		this.nameOfTheZone=nameOfTheZone;
		species= new Species [MAX_SPECIES]; 


	}

	// Accessors
	public String getName()
	{
		return name;
	}
	public int getLocationZone()
	{
		return locationZone;
	}
	public int getType()
	{
		return type;
	}
	public double getSize()
	{
		return size;
	}
	public String getUrlPicture(){
		return urlPicture;
	}
	public boolean getProtection()
	{
		return protection;
	}
	public String getNameOfTheZone()
	{
		return nameOfTheZone;
	}


	// Mutators

	public void setName(String name)
	{
		this.name = name;
	}
	public void setLocationZone (int locationZone)
	{		
		this.locationZone = locationZone;
	}	
	public void setType(int type)
	{
		this.type = type;

	}
	public void setSize(double size)
	{
		this.size = size;	
	}
	public void setUrlPicture(String urlPicture)
	{
		this.urlPicture=urlPicture;
	}
	public void setProtection(boolean protection)
	{
		this.protection=protection;
	}
	public void setNameOfTheZone(String nameOfTheZone)
	{
		this.nameOfTheZone=nameOfTheZone;
	}	

	/*
	// toString()
	public String toString()
	{
		return "\n Name: "+this.getName()+"\n ScientificZone: "+this.getScientificZone+"\n migratoryType:"+this.getMigratoryType+"\n Type:"+this.getType;
	}
	*/

	public int getEmptyPositionSpecies(){
        boolean emptyPosition = false;
		int position = -1;
		for (int i=0; i<MAX_SPECIES && !emptyPosition; i++){
			if(species[i] == null){
				emptyPosition = true;
				position = i;
			}
		}
		return position;
    }
    public String addSpecie(String name, String scientificName, String migratoryType, String type) {
		String out = "";		
		int emptyPos=getEmptyPositionSpecies(); //busco la primera posición vacía
		// si el arreglo está lleno?
		out = "Entra al metodo";
		if(emptyPos == -1){ // está lleno
			//no se puede agregar
			out = "El arreglo está lleno";
		}else{ //Si no está lleno
			species[emptyPos]= new Species(name, scientificName, migratoryType, type); 
			out = "El registro fue exitoso";
		}
		return out;
	}	


	
	
}