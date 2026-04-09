package Encapsulacion;

public class Persona {
	private String nombre, apellido;
   private  int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Persona: " + nombre + " " + apellido + " (" + edad + " años)");
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {
		this.edad = edad;
		if (edad<=0) {
			throw new Exception("Edad debe ser mayor que cero");
			
		}
	}
	
}
