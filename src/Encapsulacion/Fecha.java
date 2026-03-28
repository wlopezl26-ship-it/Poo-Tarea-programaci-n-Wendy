package Encapsulacion;

public class Fecha {

	int dia, mes, año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public boolean esValida() {
        return (dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12);
    }
	
}
