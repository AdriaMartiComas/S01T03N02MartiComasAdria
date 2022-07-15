package exercici1;

public class Restaurant {
	private String nom;
	private int puntuacio;
	
	public Restaurant(String nom, int puntuacio) {
		this.nom = nom;
		this.puntuacio = puntuacio;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Restaurant [nom=" + nom + ", puntuacio=" + puntuacio + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean equal = false;

	    if(this == obj)
	            equal = true;

	        if(obj == null || obj.getClass()!= this.getClass())
	            equal = false;
	          
	        Restaurant restaurant = (Restaurant) obj;
	          
	      
	        equal = (restaurant.nom.equals(this.nom)  && restaurant.puntuacio == this.puntuacio);
	    
		return equal;
	}
	
	@Override
    public int hashCode()
    {
         int n = Restaurant.class.hashCode();
         
//         if ()
        // We are returning the Geek_id 
        // as a hashcode value.
        // we can also return some 
        // other calculated value or may
        // be memory address of the 
        // Object on which it is invoked. 
        // it depends on how you implement 
        // hashCode() method.
        return n;
    }
	

}
