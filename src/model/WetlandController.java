package model;
// Esta es la controladora del model
public class WetlandController{
	/**
	* Descripción: This array it's going to save the information of the Wetlands </br>
	*/
    private Wetland[] wetlands;
	/**
	* Descripción: This variable it's going to save the maximount of wetlands that can be registred in the array </br>
	*/	
	public static final int MAX_WETLANDS = 80;
	/**
	* Descripción: This variable it's going to let the array's have an index </br>
	*/	
	private int indexWetlands;

	/** 
	* Descripción: The constructor of the class WetlandController <br>
	* <b> pre:</b>  weltands has to be declared and MAX_WETLANDS has to be incializated <br>
	* <b> pos: wetlands are inicializated with the size of MAX_WETLANDS <b> 
	*/
	public WetlandController ()
	{
		wetlands= new Wetland [MAX_WETLANDS]; 
	}

	/** 
	* Descripción: search if the array of wetlands has an empty position to save a new wetland and returns a boolean to let the user 
	in the main register the new wetlands <br>
	* <b> pre:</b> indexWetlands has to be declared </br>
	* <b> pos:</b> indexWetlands it's inicializated
	* @return emptyPosition boolean, define if there it's space in the array wetlands
	*/
	public boolean hasSpace(){	// REVISA SI EL HUMEDAL TIENE ESPACIO PARA AGREGARLO
		indexWetlands=-1;
		boolean emptyPosition= false;
		for (int i=0; i<MAX_WETLANDS && !emptyPosition; i++){
			if(wetlands[i]==null){
				emptyPosition= true;
				indexWetlands=i; // Esa es la posicion vacia 
			}
		}
		return emptyPosition;
	}
	
	/** 
	* Descripción: This methods it's called if has space it's true and create a wetland in the array wetlands, if the register was sucefully 
	return an String <br>
	* <b> pre:</b> indexWetlands has to be incializated </br>
	* @param name String, it's inicializated in MainSystem
	* @param locationZone int, it's inicializated in MainSystem 
	* @param type int, it's inicializated in MainSystem
	* @param size Double, it's inicializated in MainSystem 
	* @param urlPicutre String, it's inicializated in MainSystem
	* @param protection Boolean, it's inicializated in MainSystem
	* @param nameOfTheZone String, it's inicializated in MainSystem
	* @return out String, returns the message if the register was succesful or not 
	*/
	public String addWetland(String name, int locationZone, int type,Double size, String urlPicture,Boolean protection, String nameOfTheZone) {	// AÑADIR UN HUMEDAL
		String out = "";
		int emptyPos=indexWetlands; //busco la primera posición vacía

		// si el arreglo está lleno?
		out = "Entra al metodo";

		if(emptyPos == -1){ // está lleno

			//no se puede agregar
			out = "The array is full";
		}else{ //Si no está lleno
			wetlands[indexWetlands] =  new Wetland (name, locationZone,type, size, urlPicture, protection, nameOfTheZone);
			out = "Registration was successful";
		}
		return out;
	}
  
	/** 
	* Descripción: This method valide if the weltand exist and if exist add the specie to the wetland in first 
	free position and if does't exist returns an String warning <br>
	* @param wetlandName String, it has to be inicializated 
	* @param name String, it has to be inicializated 
	* @param scientificName String, it has to be inicializated 
	* @param migratoryType String, it has to be inicializated 
	* @param type String, it has to be inicializated
	* @return out String, returns a String with the information if the register was succesful or not 
	*/
	public String addSpecie2Wetland(String wetlandName, String name, String scientificName, String migratoryType, String type) {	//AÑADIR UNA ESPECIE 
        String out="";
        boolean control=true;

        for(int i=0; i<MAX_WETLANDS && control==true; i++){
            if(wetlands[i].getName().equalsIgnoreCase(wetlandName)){
                control= false; // Para que no se repita 
                wetlands[i].addSpecie(name, scientificName, migratoryType, type);
                out="The specie "+name+" was successfully registered in the wetland "+wetlandName;
            }else{
                out="The register was not successful because the wetland "+ wetlandName+" doesn't exist";
                control=false;
			}
        }
        return out;
    }

	/** 
	* Descripción: This string returns the wetlands created <br>
	* @return out String, returns the Tostring of the wetland 
	*/	
	public String stringWetland(){ //IMPRIME LOS HUMEDALES CREADOS
		String out="";
		for(int i=0; i<MAX_WETLANDS && wetlands[i]!=null; i++){
			out+=wetlands[i].toStringWetland();
		}
		
		return out;
	}
	
	/** 
	* Descripción: This string returns the Species created <br>
	* @return out String, returns the Tostring of the species 
	*/	
	public String stringSpecies(){ //IMPRIME LOS ESPECIES CREADOS
		String out="";
		out=wetlands[0].stringAllSpecies();
		return out;
	}

	/** 
	* Descripción: This method valide if the weltand exist and if exist add the event to the wetland in first 
	free position and if does't exist returns an String warning <br>
	* @param wetlandselected String, it has to be inicializated 
	* @param manager String, it has to be inicializated 
	* @param cost Double, it has to be inicializated 
	* @param description String, it has to be inicializated 
	* @param day String, it has to be inicializated
	* @param month String, it has to be inicializated
	* @param year String, it has to be inicializated
	* @return out String, returns a String with the information if the register was succesful or not 
	*/
	public String addEvent2Wetland(String wetlandselected,String manager, Double cost, String description, String day, String month, String year) {	//AÑADIR EVENTO AL WETLAND

		String out="";
		Date date1 = new Date(day, month,year);

        boolean control=true;

        for(int i=0; i<MAX_WETLANDS && control==true; i++){
            if(wetlands[i].getName().equalsIgnoreCase(wetlandselected)){
                control= false; // Para que no se repita 
                wetlands[i].addEvent(manager, cost, description, date1);
                out="The event by  "+manager+" was successfully registered in the wetland "+wetlandselected;

            }else{
                out="The register was not successful because the wetland "+ wetlandselected+" doesn't exist";
                control=false;
			}
        }
        return out;		
	}
	
	/** 
	* Descripción: This method valide if the weltand exist and if exist add the Envoirmental plan to the wetland in first 
	free position and if does't exist returns an String warning <br>
	* @param wetlandselected String, it has to be inicializated 
	* @param typeEvent String, it has to be inicializated 
	* @param percentaje Double, it has to be inicializated 
	* @param day String, it has to be inicializated
	* @param month String, it has to be inicializated
	* @param year String, it has to be inicializated
	* @return out String, returns a String with the information if the register was succesful or not 
	*/
	public String addEnvoirmentalPlan2Wetland(String wetlandselected,String typeEvent, Double percentaje, String day, String month, String year) { 	//AÑADIR MANEJO AMBIENTAL AL WETLAND
		String out="";
		Date date1 = new Date(day, month,year);

        boolean control=true;

        for(int i=0; i<MAX_WETLANDS && control==true; i++){
            if(wetlands[i].getName().equalsIgnoreCase(wetlandselected)){
                control= false; // Para que no se repita 
                wetlands[i].addEnvoirmentalPlan(typeEvent, percentaje, date1);
                out="The event it's  "+typeEvent+" was successfully registered in the wetland "+wetlandselected;
            }else{
                out="The register was not successful because the wetland "+ wetlandselected+" doesn't exist";
                control=false;
			}
        }
        return out;		

	}

	/** 
	* Descripción: This string returns the name of the Wetland and the Maintance information <br>
	* @return out String, returns the information of the wetland and the maintance 
	*/	
    public String stringWetlandandMaintance(){  //IMPRIME LOS HUMEDALES CREADOS 
        String out = "";
        for(int i=0; i<MAX_WETLANDS && wetlands[i]!=null;i++){

            out +=  "The name of the Wetland "+ wetlands[i].getName()+ "\n";
			out += "The Maintance info it's: "+ wetlands[i].stringMaintanceWetlands() + "\n";
        }
        return out;
    }

	/** 
	* Descripción: This method search the wetland with the less amount of flora<br>
	* @return out String, returns the information of wetland and the amount of flora
	*/	
	public String lessFlora(){	// Busca la especie con la menor cantidad de flora
		int index=0;
		int menor;
		String menorN;
		int igual;
		String igualN;
		String out="";

		menor=wetlands[0].amountOfFlora();
		menorN=wetlands[0].getName();

        for(int i=0;i<MAX_WETLANDS && wetlands[i]!=null;i++){
			if (menor>wetlands[i].amountOfFlora()){
				menor=wetlands[i].amountOfFlora();
				menorN=wetlands[i].getName();	
				index=i;
				out+="The wetland with the less amount of flora it's "+ menorN +" with the amount of "+menor +" species registred ";
			}		
		}


	return out;
	}
	
	/** 
	* Descripción: This method search the wetland with the largest amount of animals <br>
	* @return out String, returns the information of wetland and the amount of animals
	*/	
	public String moreSpecies(){ // Busca la especie con la menor cantidad de animales
		int index=0;
		int mayor;
		String mayorN;
		int igual;
		String igualN;
		String out="";

		mayor=wetlands[0].amountOfAnimals();
		mayorN=wetlands[0].getName();

        for(int i=0;i<MAX_WETLANDS && wetlands[i]!=null;i++){
			if (mayor<wetlands[i].amountOfAnimals()){
				mayor=wetlands[i].amountOfAnimals();
				mayorN=wetlands[i].getName();	
				index=i;
				out+="The wetland with the largest amount of animals it's "+ mayorN +" with the amount of "+mayor +" species registred ";

			}		
		}


	return out;		

	}

	/** 
	* Descripción: Returns the ToString of the wetland and the amount of every specie in that Wetland<br>
	* @return out String, The information of the Weltand and the amount of every Specie in that wetland
	*/
	public String wetlandBySpecies(){ // Devuelve el string del humedal y la cantidad de especies en ese humedal
	String out="";
	for(int i=0; i<MAX_WETLANDS && wetlands[i]!=null; i++){
		out+=wetlands[i].toStringWetland();
		out+=wetlands[i].amountOfEverySpecies();
	}
	return out;	
	}

	/** 
	* Descripción: This method search the specie in the Wetland and returns an String with the name in the Wetland found</br>
	* @param name String, It has to be inicializated
	* @return out String, returns the information in wich wetland it's registred the specie  
	*/	
	public String searchSpeciesinWetland(String name){ // BUSCA LA ESPECIE EN EL WETLAND
	String out="";
	boolean a=true;
        for(int i=0;i<MAX_WETLANDS && wetlands[i]!=null && a==true ;i++){
			
			if(wetlands[i].searchSpecies(name)==true){// SIGNIFICA QUE SI EXISTE LA ESPECIE EN LA POSICION I
				out="The species it's registred in the Wetland "+wetlands[i].getName()+
				"\n";
				a=true;
			}else if(wetlands[i].searchSpecies(name)==false){
				out= "The specie "+ name +"it's not registred";
				a=false;
			}
		
		}		
	return out;
	}

}