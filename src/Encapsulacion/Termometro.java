package Encapsulacion;

public class Termometro {
	    private double celsius;

	    public void setCelsius(double temperatura) throws Exception {
	        if (temperatura < -273.15) {
	            throw new Exception("Temperatura por debajo del cero absoluto.");
	        }
	        this.celsius = temperatura;
	    }

	    public double getFahrenheit() {
	        return (celsius * 9/5) + 32;
	    }
	}
