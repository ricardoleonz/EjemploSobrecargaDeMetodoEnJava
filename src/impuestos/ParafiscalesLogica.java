package impuestos;
import static constantes.ParafiscalesEnteros.NOVIECIENTOS;
import  static constantes.ParafiscalesDouble.*;

public class ParafiscalesLogica extends ParafiscalesNombre {

    public double calcularSalud(){
        if(this.getSalario()>NOVIECIENTOS.getEnteros()){
            return (this.getSalario()*CUATROPORCIENTO.getDobles());
        }else {
            return (this.getSalario()*DOSPORCIENTO.getDobles());

        }

    }

    public double calcularPension(){
        if(this.getSalario()<=NOVIECIENTOS.getEnteros()){
            return (this.getSalario()*CINCOPORCIENTO.getDobles());
        }else {
            return (this.getSalario()*DOSPORCIENTO.getDobles());

        }
    }

    public double totalSalario(){
        return (this.getSalario()-(this.calcularSalud()+this.calcularPension()));
    }
}
