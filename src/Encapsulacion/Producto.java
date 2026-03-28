package Encapsulacion;

public class Producto {

	int codigo;
    String nombre;
    double precio;

    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void aplicarDescuento(double porcentaje) {
        this.precio -= (this.precio * (porcentaje / 100));
    }

    public double getPrecio() { return precio; }
	
}
