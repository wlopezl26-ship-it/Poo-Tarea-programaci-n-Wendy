package Encapsulacion;

public class Curso {
	    private String nombreCurso;
	    private double nota1, nota2, nota3;

	    public Curso(String nombre, double n1, double n2, double n3) throws Exception {
	        if (validarNota(n1) && validarNota(n2) && validarNota(n3)) {
	            this.nombreCurso = nombre;
	            this.nota1 = n1; this.nota2 = n2; this.nota3 = n3;
	        } else {
	            throw new Exception("Las notas deben estar entre 0 y 100.");
	        }
	    }

	    private boolean validarNota(double nota) {
	        return nota >= 0 && nota <= 100;
	    }

	    public double promedio() {
	        return (nota1 + nota2 + nota3) / 3;
	    }

	    public String estado() {
	        return (promedio() >= 61) ? "Aprobado" : "Reprobado";
	    }
	}
	

