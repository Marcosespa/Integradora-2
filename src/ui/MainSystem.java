package ui;
import java.util.Scanner;


import model.WetlandController;

/*
To compile: javac -cp src src/ui/MainSystem.java -d bin
To excecute: java -cp bin ui.MainSystem

javadoc src/ui/MainSystem.java -d doc/API/
javadoc src/model/Date.java -d doc/API/
*/



public class MainSystem{

	/**
	 * store es la conexiOn con la clase Shop en el paquete model
	 */
	private WetlandController wetland = new WetlandController();
	/**
	 * sc es el objeto que permite leer informaciOn digitada por el usuario
	 */

	public Scanner sc;
	/**
	 * Constructor de la clase, no recibe prametros.  
	 * El mEtodo inicializa el objeto lector 
	 */

	//private Wetland newWetland;
	public static int option;

    public MainSystem(){
        sc = new Scanner(System.in);
    }	

	public static void main(String [] args) {
		
		System.out.println("Iniciando la aplicación");
        int option = 0;
        MainSystem myMain = new MainSystem();

		do{
			option = myMain.showMenu();
			myMain.executeOperation(option);
			
		}while (option!=0);
		
	}	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Seleccione una opción para empezar\n" +
				"(1) To create the wetland\n" +
				"(2) To create a species in the wetland  \n"+
				"(3) Wetland Event Log \n"+
				"(4) Show maintenance of the Wetlands \n" +  
				"(5) Show wetland with the minimun species of flora \n" +  
				"(0) To go out"
				);

		option= sc.nextInt();
		return option;
	}
	
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
			//	showFigures();
			break;

		case 5:
			//	showFigures();
			break;	

		case 6:
			//	showFigures();
			break;				
		default:
			System.out.println("Error, opción no válida");
		
		}
	}

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
			
			System.out.println("Please enter the location of the wetland \n 1.)urban \n 2.)rural");
			locationZone= sc.nextInt();
			
			System.out.println("Please enter the type of the wetland \n 1) Public \n 2.)Private");
			type= sc.nextInt();

			System.out.println("Please enter the size of the wetland");
			size= sc.nextDouble();		

			System.out.println("Please enter the URL of the wetland picture");
			urlPicture= sc.nextLine();

			System.out.println("Define the type of protection as a boolean 1.Protected 2.)Not Protected");
			int d=sc.nextInt();
			if(d==1){
				protection=true;
			}else{
				protection=false;
			}
			System.out.println("Please enter the name of the zone");
			sc.nextLine();
			nameOfTheZone= sc.nextLine();

			// Se crea el Wetland
			System.out.println(wetland.addWetland(name, locationZone, type, size, urlPicture,protection, nameOfTheZone));
		}else{
			System.out.println("You can't create another wetland, the array it's full");
		}

	}


	public void createSpecies() {

		System.out.println("Creating the species");

		System.out.println(wetland.stringWetland());


		

		String wetlandName,name, scientificName, migratoryType ,type;
		int a;
		type="";

		System.out.println("Please enter the name of the Wetland you are going to add the species");
		wetlandName= sc.nextLine();
		sc.nextLine();

		System.out.println("Please enter the name of the species");
		name= sc.nextLine();
		
		System.out.println("Please enter the scientific name of the species");
		scientificName= sc.nextLine();
		
		System.out.println("Please enter the if it's a migratory type of the species \n 1.)Yes \n 2.)No ");
		migratoryType= sc.nextLine();
		boolean flag = false;		
		while (flag==false){
		System.out.println("Please enter the type of the species"+ 
							"1.) Terrestrial flora"+
							"2.) Aquatic flora"+
							"3.) Bird "+
							"4.) Mammal"+
							"5.) Aquatic"
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

	}
	
	public void wetlandEvent() {
		System.out.println("Creating the Event");

		String manager,description;
		double cost;
		System.out.println("Please choice the option of the event you want to register \1.) ");


		System.out.println("Please enter the name of the manager of the event");
		manager= sc.nextLine();
		System.out.println("Please enter the price of the event");
		cost= sc.nextDouble();		
		System.out.println("Please enter the name of the description of the event");
		description= sc.nextLine();

	//	Wetland.addWetland(name, locationZone,type, size, urlPicture, nameOfTheZone);
	}

}		
