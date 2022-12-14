package futbol;

public abstract class Futbolista implements Comparable{
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		
	}
	
	public Futbolista() {
		this.nombre = "Maradona";
		this.edad = 30;
		this.posicion = "delantero";
		
	}
	
	
	@Override
	public String toString() {
		String txt = "El futbolista "+ nombre + " tiene "+ edad+ ", y juega de "+ posicion;
		return txt;
	}
	
	public boolean equals(Futbolista f) {
		if (this.compareTo(f) == 0 && this.hashCode() == f.hashCode()) {
			return true;
		}else {
			return false;
		}
	}
	
	public abstract boolean jugarConLasManos();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}
	
	
	
}
