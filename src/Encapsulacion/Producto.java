package Encapsulacion;

    public class Producto {

        private int codigo;
        private String nombre;
        private double precio;
        private int stock;

        public Producto(int codigo, String nombre, double precio, int stock) throws Exception {

            valoresValidos(precio, stock);
            
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        private void valoresValidos(double precio, int stock) throws Exception {
            if (precio <= 0) {
                throw new Exception("El precio debe ser mayor a 0.");
            }
            if (stock < 0) {
                throw new Exception("El stock no puede ser negativo.");
            }
        }
        
        public void vender(int cantidad) throws Exception {
            if (cantidad > this.stock) {
                throw new Exception("Stock insuficiente para vender " + cantidad + " unidades.");
            }
            this.stock -= cantidad; 
            System.out.println("Venta exitosa. Nuevo stock: " + this.stock);
        }

        public void aplicarDescuento(int porcentaje) {
            this.precio -= (this.precio * (porcentaje / 100.0));
        }

        public double getPrecio() { return precio; }
        public int getStock() { return stock; }
    }
