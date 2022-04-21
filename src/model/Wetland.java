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
	// ARREGLOS Y CANTIDADES MAXIMAS
	
	/**
	* Descripción: This array it's going to save the species of the Wetland </br>
	*/
    public  Species[] species;
	/**
	* Descripción: This variable it's going to maximount of species that can be registred in the array </br>
	*/	
	public static final int MAX_SPECIES = 80;
	/**
	* Descripción: This array it's going to save the Event's of the Wetland </br>
	*/	
	public  Event[] event;
	/**
	* Descripción: This variable it's going to save the maximount of events that can be registred in the array </br>
	*/		
	public static final int MAX_EVENTS = 80;
	/**
	* Descripción: This array it's going to save the Envoirmental managments of the Wetland </br>
	*/		
	public  EnvoirmentalManagment[] envoirmentalmanagment;
	/**
	* Descripción: This variable it's going to save the maximount of Envoirmental plans that can be registred in the array </br>
	*/	
	public static final int MAX_EM = 80;





	

	
	/**
	* Descripción: El metodo constructor va a crear los objetos de tipo wetland<br> 
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
		event = new Event[MAX_EVENTS];
		envoirmentalmanagment = new EnvoirmentalManagment[MAX_EM];
	}


	// Accessors
    /**
	* Description: the getName method returns the name .<br>
	* <b> pre:</b> The variable "name" must be initialized.<br>
	* @return name String, return the name of the Wetland.
	*/	
	public String getName()
	{
		return name;
	}

    /**
	* Description: the getLocationZone method returns the locationZone. <br>
	* <b> pre:</b> The variable "locationZone" must be initialized.<br>
	* @return locationZone int, return the value of the LocationZone.
	*/		
	public int getLocationZone()
	{
		return locationZone;
	}
    /**
	* Description: the getType method returns the type. <br>
	* <b> pre:</b> The variable "type" must be initialized.<br>
	* @return type int, return the value of the type.
	*/	
	public int getType()
	{
		return type;
	}
    
	/**
	* Description: the getSize method returns the size. <br>
	* <b> pre:</b> The variable "size" must be initialized.<br>
	* @return size double, return the value of the size.
	*/		
	public double getSize()
	{
		return size;
	}

	/**
	* Description: the getUrlPicture method returns the urlPicture. <br>
	* <b> pre:</b> The variable "urlPicture" must be initialized.<br>
	* @return urlPicture String, return the value of the urlPicture.
	*/	
	public String getUrlPicture(){
		return urlPicture;
	}

	/**
	* Description: the getProtection method returns the protection. <br>
	* <b> pre:</b> The variable "protection" must be initialized.<br>
	* @return protection boolean, return the value of the protection.
	*/	
	public boolean getProtection()
	{
		return protection;
	}
	
	/**
	* Description: the getNameOfTheZone method returns the nameOfTheZone. <br>
	* <b> pre:</b> The variable "nameOfTheZone" must be initialized.<br>
	* @return nameOfTheZone String, return the value of the nameOfTheZone.
	*/		
	public String getNameOfTheZone()
	{
		return nameOfTheZone;
	}


	// Mutators
    /**
	* Description: The setName method modifies variable name.<br>
	* <b> pre:</b> The variable "name" must be declared.<br>
	* <b> pos:</b> the variable "name" is modified.
    * @param name String, name should be initialized.
	*/
	public void setName(String name)
	{
		this.name = name;
	}

    /**
	* Description: The setLocationZone method modifies variable locationZone.<br>
	* <b> pre:</b> The variable "locationZone" must be declared.<br>
	* <b> pos:</b> the variable "locationZone" is modified.
    * @param locationZone int, locationZone should be initialized.
	*/
	public void setLocationZone (int locationZone)
	{		
		this.locationZone = locationZone;
	}

    /**
	* Description: The setType method modifies variable locationZone.<br>
	* <b> pre:</b> The variable "locationZone" must be declared.<br>
	* <b> pos:</b> the variable "locationZone" is modified.
    * @param locationZone int, locationZone should be initialized.
	*/		
	public void setType(int type)
	{
		this.type = type;

	}

    /**
	* Description: The setSize method modifies variable size.<br>
	* <b> pre:</b> The variable "size" must be declared.<br>
	* <b> pos:</b> the variable "size" is modified.
    * @param size double, size should be initialized.
	*/		
	public void setSize(double size)
	{
		this.size = size;	
	}

    /**
	* Description: The setUrlPicture method modifies variable urlPicture.<br>
	* <b> pre:</b> The variable "urlPicture" must be declared.<br>
	* <b> pos:</b> the variable "urlPicture" is modified.
    * @param urlPicture String, urlPicture should be initialized.
	*/			
	public void setUrlPicture(String urlPicture)
	{
		this.urlPicture=urlPicture;
	}

   /**
	* Description: The setProtection method modifies variable protection.<br>
	* <b> pre:</b> The variable "protection" must be declared.<br>
	* <b> pos:</b> the variable "protection" is modified.
    * @param protection boolean, protection should be initialized.
	*/
	public void setProtection(boolean protection)
	{
		this.protection=protection;
	}

   /**
	* Description: The setNameOfTheZone method modifies variable nameOfTheZone.<br>
	* <b> pre:</b> The variable "nameOfTheZone" must be declared.<br>
	* <b> pos:</b> the variable "nameOfTheZone" is modified.
    * @param nameOfTheZone String, nameOfTheZone should be initialized.
	*/
	public void setNameOfTheZone(String nameOfTheZone)
	{
		this.nameOfTheZone=nameOfTheZone;
	}	

	
	// toString()

	/** 
	* Descripción: This method print the info of the Wetland <br>
	* @return String, has all the Get's of the wetland
	*/
	public  String toStringWetland()
	{
		return "\n The name: "+this.getName()+
		" \n Location Zone: "+this.getLocationZone()+
		"\n type: "+this.getType()+
		"\n Size: "+this.getSize()+
		"\n Url picture: "+this.getUrlPicture()+
		"\n Protection: "+ this.getProtection()+
		"\n Name of the zone: "+this.getNameOfTheZone()+
		"\n";
	}	


	/** 
	* Descripción: This method get's the empty positions of the array of the species <br>
	* @return position boolean, informacion sobre variable de retorno --> retorno
	*/
	public int getEmptyPositionSpecies(){	//EMPTY POSITIO - ADD SPECIES - STRING SPECIES
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

	public String stringAllSpecies(){ //IMPRIME LAS ESPECIES CREADAS
		String out="";

		for(int i=0; i<MAX_SPECIES; i++){
			if(species[i]!=null){
				out+=species[i].toStringSpecies();
			}
		}
		if(out.equals("")){
			out="There's not species registred";
		}
		return out;
	}

	// EMPTY POSITION - ADD EVENTS  
	public int getEmptyPositionEvent(){
        boolean emptyPosition = false;
		int position = -1;
		for (int i=0; i<MAX_EVENTS && !emptyPosition; i++){
			if(event[i] == null){
				emptyPosition = true;
				position = i;
			}
		}
		return position;
    }	
    public String addEvent(String manager, Double cost, String description,Date date1) {
		String out = "";		
		int emptyPos=getEmptyPositionEvent(); //busco la primera posición vacía
		// si el arreglo está lleno?
		out = "Entra al metodo";
		if(emptyPos == -1){ // está lleno
			//no se puede agregar
			out = "El arreglo está lleno";
		}else{ //Si no está lleno
			event[emptyPos]= new Event (manager, cost, description, date1); 
			out = "El registro fue exitoso";
		}
		return out;
	}		
	//  EMPTY POSITION - ADD ENVOIRMENTAL PLAN
	public int getEmptyPositionEnvoirmentalPlan(){
        boolean emptyPosition = false;
		int position = -1;
		for (int i=0; i<MAX_EVENTS && !emptyPosition; i++){
			if(event[i] == null){
				emptyPosition = true;
				position = i;
			}
		}
		return position;
    }		
    public String addEnvoirmentalPlan(String typeEvent,double percentaje, Date date1) {
		String out = "";		
		int emptyPos=getEmptyPositionEnvoirmentalPlan(); //busco la primera posición vacía
		// si el arreglo está lleno?
		out = "Entra al metodo";
		if(emptyPos == -1){ // está lleno
			//no se puede agregar
			out = "El arreglo está lleno";
		}else{ //Si no está lleno
			envoirmentalmanagment[emptyPos]= new EnvoirmentalManagment (typeEvent, percentaje, date1); 
			out = "El registro fue exitoso";
		}
		return out;
	}		


    public String stringMaintanceWetlands(){ // TRAE EL STRING DE ENVOIRMENTAL MANAGMWENT
        String out = "";
        for(int i=0;i<MAX_EM && envoirmentalmanagment[i]!=null;i++){
            out += envoirmentalmanagment[i].toStringEM();
        }
        return out;
    }	
 	// LA CANTIDAD DE FLORA POR CADA WETLAND
	public int amountOfFlora(){
		int total=0;
        for(int i=0;i<MAX_SPECIES && species[i]!=null;i++){
            if(species[i].getType().equalsIgnoreCase("Terrestrial flora") || species[i].getType().equalsIgnoreCase("Aquatic flora"))
			{
                total++;
            }
        }
        return total;
    }

	// LA CANTIDAD DE ESPECIES POR CADA WETLAND
	public String amountOfEverySpecies(){
		int tf=0;
		int af=0;
		int bd=0;
		int mml=0;
		int aq=0;
		String out="";
        for(int i=0;i<MAX_SPECIES && species[i]!=null;i++){

            if (species[i].getType().equalsIgnoreCase("Terrestrial flora")) {
				tf++;
			}
			if (species[i].getType().equalsIgnoreCase("Aquatic flora")) {
				af++;
			}
			if (species[i].getType().equalsIgnoreCase("Bird")){
				bd++;
			}
			if (species[i].getType().equalsIgnoreCase("Mammal")){
				mml++;
			} 
			if (species[i].getType().equalsIgnoreCase("Aquatic")){
				aq++;
			}
        }
		out+= "\n The final amount of species for type it's "+
			"\n Terrestrial flora: "+ tf +
			"\n Aquatic flora: "+af+
			"\n Bird: "+bd+
			"\n Mammal: "+mml+
			"\n Aquatic: "+aq;

        return out;
    }	

	public int amountOfAnimals(){ // LA CANTIDAD DE ANIMALES POR CADA WETLAND
		int total=0;
        for(int i=0;i<MAX_SPECIES && species[i]!=null;i++){
            if(species[i].getType().equalsIgnoreCase("Bird") || species[i].getType().equalsIgnoreCase("Mammal") || species[i].getType().equalsIgnoreCase("Aquatic"))
			{
                total++;
            }
        }
        return total;		
	}

	public boolean searchSpecies(String name){
	boolean a=false;
        for(int i=0;i<MAX_SPECIES && species[i]!=null;i++){
			if(species[i].getName().equalsIgnoreCase(name)){
				a=true;
			}
		}
	return a;
	}
}