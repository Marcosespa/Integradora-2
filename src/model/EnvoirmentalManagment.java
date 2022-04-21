package model;

public class EnvoirmentalManagment
{
	// Attributes

	/**
	* Descripción: This variable it's going to save the type of plan in the Wetland</br>
	*/	
	private String typePlan;
	/**
	* Descripción: This variable it's going to save the type of Percentaje of compliance in the Wetland</br>
	*/		
	private double percentajePlan;
	/**
	* Descripción: This variable it's going to allow to save date's in the Envoirmental Managment</br>
	*/	
	private Date date;


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
	public EnvoirmentalManagment (String typePlan, double percentajePlan,Date date){	// Constructor with parameters
		this.typePlan=typePlan;
		this.percentajePlan=percentajePlan;
		this.date=date;
	}

	// Accessors

    /**
     * @return double return the percentajePlan
     */
    public double getPercentajePlan() {
        return percentajePlan;
    }	
	/**
     * @param percentajePlan the percentajePlan to set
     */
    public void setPercentajePlan(double percentajePlan) {
        this.percentajePlan = percentajePlan;
    }
    /**
     * @return String return the typePlan
     */
    public String getTypePlan() {
        return typePlan;
    }

    /**
     * @param typePlan the typePlan to set
     */
    public void setTypePlan(String typePlan) {
        this.typePlan = typePlan;
    }


	// toString()
	public String toStringEM()
	{
		return "\n The type of maintence it's : "+this.getTypePlan()+
		"\n the percentaje of compliance : "+this.getPercentajePlan()+
		"\n the date it's:"+date.toString();
	}









}