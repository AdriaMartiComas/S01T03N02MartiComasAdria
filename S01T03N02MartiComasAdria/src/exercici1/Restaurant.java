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
        return Restaurant.class.hashCode();
    }
	

}
