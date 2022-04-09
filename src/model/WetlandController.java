package model;
// Esta es la controladora del model
public class WetlandController{

    public  Wetland[] wetlands;
	public static final int MAX_WETLANDS = 80;
	private int indexWetlands;


	public WetlandController ()
	{
		wetlands= new Wetland [MAX_WETLANDS]; 
	}


	public boolean hasSpace(){
		indexWetlands=0;
		boolean emptyPosition= false;
		for (int i=0; i<MAX_WETLANDS && !emptyPosition; i++){

			if(wetlands[i] ==null){
				emptyPosition= true;
				indexWetlands=i; // Esa es la posicion vacia 

			}
		}
		return emptyPosition;
	}
	/**
	 * @return un entero con la primera posición vacía en el arreglo
	 *  y -1 si el arreglo está lleno 
	 * */	
	public int getEmptyPosition(){
		int n=0;
		if(indexWetlands==0){
			n=indexWetlands;	
		}else if (!hasSpace())
		{
			n=-1;
		}
		return n;
	}

	public String addWetland(String name, int locationZone, int type,Double size, String urlPicture,Boolean protection, String nameOfTheZone) {
		String out = "";
		int emptyPos=getEmptyPosition(); //busco la primera posición vacía

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


    public String addSpecie2Wetland(String wetlandName, String name, String scientificName, String migratoryType, String type) {
        String out="";
        boolean control=true;

        for(int i=0; i<MAX_WETLANDS && control==true; i++){
            if(wetlands[i]){

            }
        }


        return out;
    }


    //AÑADIR UNA ESPECIE 





}