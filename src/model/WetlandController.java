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


	public WetlandController ()
	{
		wetlands= new Wetland [MAX_WETLANDS]; 
	}
	// REVISA SI EL HUMEDAL TIENE ESPACIO PARA AGREGARLO
	public boolean hasSpace(){
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
	// AÑADIR UN HUMEDAL
	public String addWetland(String name, int locationZone, int type,Double size, String urlPicture,Boolean protection, String nameOfTheZone) {
		String out = "";
		int emptyPos=indexWetlands; //busco la primera posición vacía

		// si el arreglo está lleno?
		out = "Entra al metodo";

		if(emptyPos == -1){ // está lleno

			//no se puede agregar
			out = "El arreglo está lleno";
		}else{ //Si no está lleno
			wetlands[indexWetlands] =  new Wetland (name, locationZone,type, size, urlPicture, protection, nameOfTheZone);
			out = "El registro fue exitoso";
		}
		return out;
	}
    //AÑADIR UNA ESPECIE 
    public String addSpecie2Wetland(String wetlandName, String name, String scientificName, String migratoryType, String type) {
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

	public String stringWetland(){ //IMPRIME LOS HUMEDALES CREADOS
		String out="";
		for(int i=0; i<MAX_WETLANDS && wetlands[i]!=null; i++){
			out+=wetlands[i].toStringWetland();
		}
		
		return out;
	}

	public String stringSpecies(){ //IMPRIME LOS ESPECIES CREADOS
		String out="";
		out=wetlands[0].stringAllSpecies();
		return out;
	}
	//AÑADIR EVENTO AL WETLAND
	public String addEvent2Wetland(String wetlandselected,String manager, Double cost, String description, String day, String month, String year) {
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
	//AÑADIR MANEJO AMBIENTAL AL WETLAND
	public String addEnvoirmentalPlan2Wetland(String wetlandselected,String typeEvent, Double percentaje, String day, String month, String year) {
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

    public String stringWetlandandMaintance(){  //IMPRIME LOS HUMEDALES CREADOS 
        String out = "";
        for(int i=0; i<MAX_WETLANDS && wetlands[i]!=null;i++){

            out +=  "The name of the Wetland "+ wetlands[i].getName()+ "\n";
			out += "The Maintance info it's: "+ wetlands[i].stringMaintanceWetlands() + "\n";
        }
        return out;
    }

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
	
	public String wetlandBySpecies(){ // Devuelve el string del humedal y la cantidad de especies en ese humedal
	String out="";
	for(int i=0; i<MAX_WETLANDS && wetlands[i]!=null; i++){
		out+=wetlands[i].toStringWetland();
		out+=wetlands[i].amountOfEverySpecies();
	}
	return out;	
	}

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