package Encapsulacion;

public class Main {

	public static void main(String[] args) {
		System.out.println("1)PERSONA");
        Persona p1 = new Persona("Wendy", "Lopez", 20);
        Persona p2 = new Persona("Juan", "Perez", 15);
        Persona p3 = new Persona("Maria", "Garcia", 65);
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
        
        System.out.println("2)RECTÁNGULO");
        Rectangulo r1 = new Rectangulo(10, 5);
        Rectangulo r2 = new Rectangulo(8, 7);
        System.out.println("Rectángulo 1 - Área: " + r1.area());
        System.out.println("Rectángulo 2 - Área: " + r2.area());
        
        if (r1.area() > r2.area()) {
            System.out.println("El Rectángulo 1 tiene mayor área.");
        } else if (r2.area() > r1.area()) {
            System.out.println("El Rectángulo 2 tiene mayor área.");
        } else {
            System.out.println("Ambos tienen la misma área.");
        }
        
        System.out.println("3)PRODUCTO");
        Producto prod1 = new Producto(101, "Laptop", 1000.0);
        Producto prod2 = new Producto(102, "Mouse", 50.0);
        prod1.aplicarDescuento(10); // 10% descuento
        prod2.aplicarDescuento(50);  // 50% descuento
        System.out.println("Precio final Laptop: $" + prod1.getPrecio());
        System.out.println("Precio final Mouse: $" + prod2.getPrecio());
        
        System.out.println("4)CUENTA");
        Cuenta miCuenta = new Cuenta("Wendy Lopez", 500.0);
        miCuenta.depositar(200);
        miCuenta.retirar(800); // Intento retirar más de lo que hay
        miCuenta.retirar(100); // Retiro válido
        System.out.println("Saldo final de " + miCuenta.getTitular() + ": $" + miCuenta.getSaldo());

        System.out.println("5)LIBRO ");
        Libro l1 = new Libro("Java Básico", "Autor Rebeca Lucero", 150);
        Libro l2 = new Libro("POO Avanzada", "Autor Lusina de PAula", 450);
        Libro l3 = new Libro("Algoritmos", "Autor Albert Willy", 305);
        
        Libro[] libros = {l1, l2, l3};
        for (Libro l : libros) {
            System.out.println("¿'" + l.getTitulo() + "' es largo?: " + (l.esLargo() ? "SÍ" : "NO"));
        }
        
        System.out.println("6)CALCULADORA");
        Calculadora calc = new Calculadora();
        double n1 = 20, n2 = 0;
        System.out.println("Suma: " + calc.sumar(n1, n2));
        System.out.println("División: " + calc.dividir(n1, n2));
        
        System.out.println("\n=== 7. EJERCICIO FECHA ===");
        Fecha f1 = new Fecha(15, 5, 2024);
        Fecha f2 = new Fecha(40, 1, 2023); // Inválida
        Fecha f3 = new Fecha(10, 13, 2022); // Inválida
        
        System.out.println("Fecha 1 válida: " + f1.esValida());
        System.out.println("Fecha 2 válida: " + f2.esValida());
        System.out.println("Fecha 3 válida: " + f3.esValida());
    }



        
	}

