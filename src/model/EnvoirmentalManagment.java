package model;

public class EnvoirmentalManagment
{
	// Attributes
	/**
	* Descripción: This variable it's going to save the type of activity in the Wetland</br>
	*/	
	private int maintance;
	/**
	* Descripción: This variable it's going to save the type of activity in the Wetland</br>
	*/	
	private int conservation;
	/**
	* Descripción: This variable it's going to save the type of activity in the Wetland</br>
	*/	
	private int restoration;

	// Constructor without parameters
	/*
	public EnvoirmentalManagment()
	{
		this.maintance = "NoMaintance";
		this.conservation = "NoConservationData";
		this.restoration = "NoRestoration";
	}
	*/

	/**
	* Descripción: El metodo constructor va a crear los objetos de tipo EnvoirmentalManagment<br>
	* <b> pre:</b> La variable maintance deben estar declarada</br>
	* La variable conservation deben estar declarada
	* La variable restoration deben estar declarada
	* <b> pos:</b> La variable maintance queda incializada
	* La variable conservation queda incializada
	* La variable restoration queda incializada
	* @param maintance String, Debe ser inicializada 
	* @param conservation String, Debe ser inicializada 
	* @param restoration String, Debe ser inicializada 
	*/	

	// Constructor with parameters
	public EnvoirmentalManagment (int maintance, int conservation, int restoration)
	{
		this.maintance = maintance;
		this.conservation = conservation;
		this.restoration = restoration;
	}

	// Accessors
	public String getMaintance()
	{
		return maintance;
	}
	public String getConservation()
	{
		return conservation;
	}
	public String getRestoration()
	{
		return restoration;
	}

	// Mutators
	public void setMaintance(int maintance)
	{
		this.maintance = maintance;

	}
	
	public void setScientificZone(int conservation)
	{
		this.conservation = conservation;

	}	
	public void setRestoration(int restoration)
	{
		this.restoration = restoration;	
	}

	/*
	// toString()
	public String toString()
	{
		return "\n Name: "+this.getName()+"\n ScientificZone: "+this.getScientificZone+"\n migratoryType:"+this.getMigratoryType+"\n Type:"+this.getType;
	}
	*/
}