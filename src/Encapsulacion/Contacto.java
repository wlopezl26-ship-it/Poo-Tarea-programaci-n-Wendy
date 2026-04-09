package Encapsulacion;

public class Contacto {

	    private String nombre, telefono, email;

	    public void setTelefono(String tel) throws Exception {
	        if (tel.length() == 8) {
	            this.telefono = tel;
	        } else {
	            throw new Exception("El teléfono debe tener exactamente 8 dígitos.");
	        }
	    }

	    public void setEmail(String email) throws Exception {
	        if (email.contains("@")) {
	            this.email = email;
	        } else {
	            throw new Exception("Email inválido (falta @).");
	        }
	    }

	    public void mostrarContacto() {
	        System.out.println("Contacto: " + nombre + " | Tel: " + telefono + " | Email: " + email);
	    }
	}

