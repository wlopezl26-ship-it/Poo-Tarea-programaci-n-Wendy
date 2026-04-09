package Encapsulacion;

public class Estudiante {
  
    private String carnet;
    private String nombre;
    private double promedio;


    public Estudiante(String carnet, String nombre, double promedio) throws Exception {
        this.carnet = carnet;
        this.nombre = nombre;
        setPromedio(promedio); 
    }

    public void setPromedio(double promedio) throws Exception {
        if (promedio >= 0 && promedio <= 100) {
            this.promedio = promedio;
        } else {
            throw new Exception("El promedio debe estar en el rango de 0 a 100.");
        }
    }

 
    public boolean esBecado() {

        return this.promedio >= 85;
    }

    public String getNombre() { return nombre; }
    public double getPromedio() { return promedio; }
}


