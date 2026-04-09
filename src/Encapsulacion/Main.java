package Encapsulacion;

public class Main {

    public static void main(String[] args) throws Exception {
        
        // --- 1) PERSONA ---
        System.out.println("1) PERSONA");
        Persona p1 = new Persona("Wendy", "Lopez", 20);
        Persona p2 = new Persona("Juan", "Perez", 15);
        p1.mostrar();
        
        try {
            p2.setEdad(-20); 
        } catch (Exception e) {
            System.out.println("Error en Persona: " + e.getMessage());
            p2.setEdad(0); 
        }

        // --- 2) RECTÁNGULO ---
        System.out.println("\n2) RECTÁNGULO");
        Rectangulo r1 = new Rectangulo(10, 5);
        Rectangulo r2 = new Rectangulo(8, 7);
        System.out.println("Área R1: " + r1.area() + " | Área R2: " + r2.area());
        
        if (r1.area() > r2.area()) {
            System.out.println("El Rectángulo 1 es más grande.");
        } else {
            System.out.println("El Rectángulo 2 es más grande o igual.");
        }

        // --- 3) PRODUCTO (Venta y Stock) ---
        System.out.println("\n3) PRODUCTO");
        try {
            Producto prod1 = new Producto(101, "Laptop", 1000.0, 10);
            prod1.aplicarDescuento(10);
            System.out.println("Precio con descuento: $" + prod1.getPrecio());
            
            prod1.vender(15); 
        } catch (Exception e) {
            System.out.println("Aviso de Producto: " + e.getMessage());
        }

        // --- 4) CUENTA BANCARIA (Seguridad PIN) ---
        System.out.println("\n4) CUENTA BANCARIA");
        Cuenta miCuenta = new Cuenta("Wendy Lopez", 500.0, 1234);
        miCuenta.retirar(100, 1111); // PIN Incorrecto
        miCuenta.retirar(100, 1234); // PIN Correcto

        // --- 5) ESTUDIANTE Y BECA ---
        System.out.println("\n5) ESTUDIANTE Y BECA");
        try {
            Estudiante est1 = new Estudiante("2024-001", "Wendy", 92.5);
            System.out.println("Estudiante: " + est1.getNombre());
            System.out.println("¿Es becado?: " + (est1.esBecado() ? "SÍ" : "NO"));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // --- 6) TERMÓMETRO ---
        System.out.println("\n6) TERMÓMETRO");
        try {
            Termometro temp = new Termometro();
            temp.setCelsius(25.0);
            System.out.println("25°C a Fahrenheit: " + temp.getFahrenheit());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // --- 7) RELOJ ---
        System.out.println("\n7) RELOJ");
        try {
            Reloj miReloj = new Reloj();
            miReloj.setHora(23);
            miReloj.setMinuto(59);
            miReloj.setSegundo(59);
            System.out.println("Hora actual: " + miReloj.mostrarHora());
        } catch (Exception e) {
            System.out.println("Error de tiempo: " + e.getMessage());
        }

        // --- 8) JUGADOR (Récord) ---
        System.out.println("\n8) JUGADOR");
        try {
            Jugador player = new Jugador("Wendy_Dev");
            player.actualizarPuntaje(1500);
            player.actualizarPuntaje(2000); // Supera récord
            System.out.println("Récord máximo: " + player.getPuntajeMaximo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // --- 9) FACTURA ---
        System.out.println("\n9) FACTURA");
        try {
            Factura fac = new Factura("FAC-001", "Servicios Progra", 2, 150.0);
            fac.mostrarFactura();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}




