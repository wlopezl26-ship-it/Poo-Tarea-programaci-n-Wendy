package Encapsulacion;

public class Factura {
    private String codigoFactura, descripcion;
    private int cantidad;
    private double precioUnitario;

    public Factura(String string, String string2, int i, double d) {
		// TODO Auto-generated constructor stub
	}

	public void setDatos(int cant, double precio) throws Exception {
        if (cant > 0 && precio > 0) {
            this.cantidad = cant;
            this.precioUnitario = precio;
        } else {
            throw new Exception("Cantidad y precio deben ser mayores a 0.");
        }
    }

    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarFactura() {
        System.out.println("Factura: " + codigoFactura);
        System.out.println("Total a pagar: $" + calcularTotal());
    }
}


