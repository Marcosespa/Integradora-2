package ui;
import java.text.BreakIterator;
import java.util.Scanner;


import model.WetlandController;

/*
To compile: javac --release 8 -cp src src/ui/MainSystem.java -d bin
To excecute: java -cp bin ui.MainSystem

javadoc src/ui/MainSystem.java -d doc/API/
javadoc src/model/Date.java -d doc/API/
*/

//PLANTILLA METODOS
	/** 
	* Descripción: ¿qué hace mi método? (concisa, un par de líneas)</br>
	* <b> pre:</b> ¿cuáles son las condiciones sobre las variables globales? --> si hay una condición sobre var glob. </br>
	* <b> pos:</b> ¿Cuales fueron los cambios sobre las variables globales? --> si ocurrio un cambio cn var glob.
	* @param <nombre_par> <tipo>, condiciones sobre el parametro --> si tiene
	* @return <nombre_var> <tipo>, informacion sobre variable de retorno --> retorno
	*/

/** 
 * @author Marcosespi
 * */

public class MainSystem{

	/**
	 * wetland it's the conecction with the class MainSystem with the WetlandController in the model 
	 */

	 private WetlandController wetland = new WetlandController();
	/**
	 * sc es el objeto que permite leer informaciOn digitada por el usuario
	 */
	public Scanner sc;

	public static int option;

    public MainSystem(){
        sc = new Scanner(System.in);
    }	
	/** 
	* Descripción: The main method initializes the application and calls the menu method and the option chosen in the menu. <br>
	* <b> pre:</b> option has to be declared </br>
	* <b> pos:</b> option it's inicializted
	*/
	public static void main(String [] args) {
		
		System.out.println("Iniciando la aplicación");
        int option = 0;
        MainSystem myMain = new MainSystem();

		do{
			option = myMain.showMenu();
			myMain.executeOperation(option);
			
		}while (option!=0);
		
	}	
	
	/** 
	* Descripción: My method displays the menu and asks the user to choose an option </br>
	* @return option int, returns the option chosen by the user
	*/
	public int showMenu() {// MENU
		int option=0;

		System.out.println(
				"Seleccione una opción para empezar\n" +
				"(1) To create the wetland\n" +
				"(2) To create a species in the wetland  \n"+
				"(3) Wetland Event Log \n"+
				"(4) Show maintenance of the Wetlands \n" +  
				"(5) Show wetland with the fewer species of flora \n" +  
				"(6) Given the name of a species, display the wetlands where it is found \n" +  
				"(7) Display the information of all wetlands, including the total number of species by type \n" +  				
				"(8) Display the name of the wetland with the largest number of animals \n" +  				
				"(0) To go out"
				);

		option= sc.nextInt();
		return option;
	}
	
	/** 
	* Descripción: This method with the return of ShowMenu decide wich method has to be used <br>
	* @param operation int, has to be initialized
	*/	
	public void executeOperation(int operation) {
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			createWetland() ;
			break;
		case 2:
			createSpecies();
			break;
	
		case 3:
			wetlandEvent();
			break;

		case 4:
			wetlandMaitance();
			break;

		case 5:
			wetlandWLessFlora();
			break;	

		case 6:
			findSpecies();
			break;
		case 7:
			wetlandAndSpecies();
			break;								
		case 8:
			wetlandWMoreFlora();
			break;				
			
		default:
			System.out.println("Error, opción no válida");
		
		}
	}

	/** 
	* Descripción: Create wetland works if the method hasSpace it's true means that has space, and ask the information of the wetland 
	to be send to addWetland and create a Wetland in the array of Wetlands <br>
	*/	
	public void createWetland() {

		if(wetland.hasSpace()==true){

			System.out.println("Creating the Wetland");

			String name,urlPicture, nameOfTheZone;
			int locationZone, type;
			double size;
			boolean protection;

			System.out.println("Please enter the name of the wetland");
			sc.nextLine();
			name= sc.nextLine();
			
			System.out.println("Please enter the location of the wetland \n 1.)Urban \n 2.)Rural");
			locationZone= sc.nextInt();
			
			System.out.println("Please enter the type of the wetland \n 1.)Public \n 2.)Private");
			type= sc.nextInt();

			System.out.println("Please enter the size of the wetland");
			size= sc.nextDouble();		

			System.out.println("Please enter the URL of the wetland picture");
			sc.nextLine();
			urlPicture= sc.nextLine();

			System.out.println("Define the type of protection as a boolean \n 1.) Protected \n 2.) Not Protected");
			int d=sc.nextInt();
			if(d==1){
				protection=true;
			}else{
				protection=false;
			}

			if(locationZone==1){
				System.out.println("Please enter the name of the neighborhood");
				sc.nextLine();
				nameOfTheZone= sc.nextLine();				
			}else{
				System.out.println("Please enter the name of the small town ");
				sc.nextLine();
				nameOfTheZone= sc.nextLine();					
			}


			// Se crea el Wetland
			System.out.println(wetland.addWetland(name, locationZone, type, size, urlPicture,protection, nameOfTheZone));
		}else{
			System.out.println("You can't create another wetland, the array it's full");
		}

	}

	/** 
	* Descripción: This method ask the information of the Specie that wants to be created and it's send to addSpecie2Wetland where it check if has space and
	then procede to create species, ending the method with a print that show the species created <br>
	*/
	public void createSpecies() {

		String wetlandName,name, scientificName, migratoryType ,type;
		int a;
		type="";

		System.out.println("Creating the species");
		System.out.println("Take a look of the wetlands existing ");

		System.out.println(wetland.stringWetland());



		System.out.println("Please enter the name of the Wetland you are going to add the species");
		sc.nextLine();
		wetlandName= sc.nextLine();

		System.out.println("Please enter the name of the species");
		name= sc.nextLine();
		
		System.out.println("Please enter the scientific name of the species");
		scientificName= sc.nextLine();
		
		System.out.println("Please enter the if it's a migratory type of the species \n 1.)Yes \n 2.)No ");
		migratoryType= sc.nextLine();
		boolean flag = false;		
		while (flag==false){
		System.out.println("Please enter the type of the species"+ 
							"\n 1.) Terrestrial flora"+
							"\n 2.) Aquatic flora"+
							"\n 3.) Bird "+
							"\n 4.) Mammal"+
							"\n 5.) Aquatic"
							);
		a= sc.nextInt();
			switch(a){
				case 1:
					type="Terrestrial flora";
					flag=true;
					break;
				case 2: 
					type="Aquatic flora";
					flag=true;
					break;
				case 3:
					type="Bird";
					flag=true;
					break;
				case 4:
					type="Mammal";
					flag=true;
					break;
				case 5:
					type="Aquatic";
					flag=true;
					break;
				default:
				flag=false;	
			}
			System.out.println(wetland.addSpecie2Wetland(wetlandName, name, scientificName,migratoryType, type));
	
		}
		System.out.println(wetland.stringSpecies());


	}

	/** 
	* Descripción: This method ask if wants to be created an event or a Maintance, if the option it's Maintance calls the method envoirmentalManagment
	else ask the information to create and Event, and send it to addEvent2Wetland<br>
	*/
	public void wetlandEvent() {
		System.out.println("Creating the Event");

		String wetlandselected,manager,description;
		double cost;
		String day,month,year;
		int d;
		System.out.println("1.) Event \n 2.) Maintence");
		d=sc.nextInt();
		if(d==2){
			envoirmentalManagment();
		}else{
			System.out.println("This are the Wetlands already registred \n \n");

			System.out.println(wetland.stringWetland());


			System.out.println("\n Please select the weltand name you want to register an event");
			sc.nextLine();			
			wetlandselected=sc.nextLine();
	
			System.out.println("Please enter the name of the manager of the event");
			manager= sc.nextLine();
			System.out.println("Please enter the price of the event");
			cost= sc.nextDouble();		
			System.out.println("Please enter the name of the description of the event");
			sc.nextDouble();		
			description= sc.nextLine();
	
			System.out.println("Please enter the day of the event");
			day=sc.nextLine();
			System.out.println("Please enter the month of the event");
			month=sc.nextLine();	
			System.out.println("Please enter the year of the event");
			year=sc.nextLine();		
			System.out.println(wetland.addEvent2Wetland(wetlandselected ,manager, cost, description,day, month, year));
		}

	}
	
	/** 
	* Descripción:This method works if the user choice in wetlandEvent the option of envoirmental managment.
	It's showed all the Wetlands created and ask to select wich weltand want the envoirmental managment then ask
	the information and it's send to addEnvoirmentalPlan2Wetland <br>
	*/
	public void envoirmentalManagment(){
		System.out.println("Making the envoirmental Managment plan ");
		String typeEvent, wetlandselected,day,month,year;
		double percentaje;

		typeEvent="";
		System.out.println("This are the Wetlands already registred \n \n");

		System.out.println(wetland.stringWetland());

		System.out.println("\n Please select the weltand name you want to register an event");
		sc.nextLine();			
		wetlandselected=sc.nextLine();		

		System.out.println("Please choice the option of maintenance you want to register" +
			"\n 1.) Restoration"+
			"\n 2.) Maintenance"+
			"\n 3.) Conservation") ;
		int decision= sc.nextInt();	
		switch(decision){
			case 1:
			typeEvent="Restoration";
			break;
			case 2:
			typeEvent="Maintenance";
			break;
			case 3: 
			typeEvent="Conservation";
			break;
		}	
		System.out.println("Please chose the percentaje of compliance");
		percentaje=sc.nextDouble();

		System.out.println("Please enter the day of the "+typeEvent);
		sc.nextLine();
		day=sc.nextLine();
		System.out.println("Please enter the month of the "+typeEvent);
		month=sc.nextLine();	
		System.out.println("Please enter the year of the "+ typeEvent);
		year=sc.nextLine();	

		System.out.println(wetland.addEnvoirmentalPlan2Wetland(wetlandselected ,typeEvent, percentaje,day, month, year));		
	}
	
	/** 
	* Descripción:This method shows the weltands and their information of maintence registred calling the method stringWetlandandMaintance<br>
	*/
	public void wetlandMaitance(){ // INFORMACION DE LOS WETLANDS CON SUS RESPECTIVOS MANTENIMIENTOS
		System.out.println("This are the Wetlands with the information of their maintance \n");	
		System.out.println(wetland.stringWetlandandMaintance());
	}
	
	/** 
	* Descripción: Show the wetland with the less amount of flora calling the method lessFlora<br>
	*/
	public void wetlandWLessFlora(){ //EL HUMEDAL CON LA CANTIDAD MENOR DE FLORA
		System.out.println("This is the with the least amount of flora \n");	
		System.out.println(wetland.lessFlora());
	}

	/** 
	* Descripción: Ask the name of the Species that want to be searched and call the method searchSpeciesinWetland with the 
	parameter of the name returning the name of the Weltand if exist <br>
	*/	
	public void findSpecies(){
		String name;
		System.out.println("Please write the name of the species that want to be searched ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.println(wetland.searchSpeciesinWetland(name));


	}
	
	/** 
	* Descripción: This method shows the information of the Wetland and the amount of species <br>
	*/
	public void wetlandAndSpecies(){ // WETLAND Y LA INFO DE CADA ESPECIE 
		System.out.println("This are the Wetlands with the information of species \n");	
		System.out.println(wetland.wetlandBySpecies());		
	}

	/** 
	* Descripción: Show the wetland with the largest amount of animals calling the method moreSpecies<br>
	*/
	public void wetlandWMoreFlora(){// WETLAND CON LA MAYOR CANTIDA DE ANIMALES 
		System.out.println("This is the wetland with the largest amount of flora \n");	
		System.out.println(wetland.moreSpecies());		
	}

}		
