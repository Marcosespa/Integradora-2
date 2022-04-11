package model;
// Esta es la controladora del model
public class WetlandController{

    private Wetland[] wetlands;
	public static final int MAX_WETLANDS = 80;
	private int indexWetlands;


	public WetlandController ()
	{
		wetlands= new Wetland [MAX_WETLANDS]; 
	}

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

	public String stringSpecies(){ //IMPRIME LOS HUMEDALES CREADOS
		String out="";
		out=wetlands[0].stringAllSpecies();
		return out;
	}





}