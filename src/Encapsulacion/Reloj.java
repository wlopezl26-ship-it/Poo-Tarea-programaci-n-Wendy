package Encapsulacion;

public class Reloj {
  
    private int hora;
    private int minuto;
    private int segundo;

    
    public Reloj() {}

    public void setHora(int hora) throws Exception {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            throw new Exception("Hora no válida: debe estar entre 0 y 23.");
        }
    }

    public void setMinuto(int minuto) throws Exception {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            throw new Exception("Minuto no válido: debe estar entre 0 y 59.");
        }
    }

    public void setSegundo(int segundo) throws Exception {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            throw new Exception("Segundo no válido: debe estar entre 0 y 59.");
        }
    }

    public String mostrarHora() {
        
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
}
