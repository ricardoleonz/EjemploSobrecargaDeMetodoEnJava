package main;

import impuestos.ParafiscalesLogica;
import static constantes.Mensajes.*;



import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {

    public static void main(String[] args){

        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();

        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');

        DecimalFormat formateador = new DecimalFormat("###,###.##", simbolo);

        ParafiscalesLogica parafiscalesLogica = new ParafiscalesLogica();

            String nombre = JOptionPane.showInputDialog(null, MENSAJE_NOMBRE.getMensaje());

            String salario = JOptionPane.showInputDialog(null,MENSAJE_SALARIO.getMensaje());

            parafiscalesLogica.setNombre(nombre);
            parafiscalesLogica.setSalario(Double.parseDouble(salario));

            JOptionPane.showMessageDialog(null,MENSAJE_EMPLEADO.getMensaje()+parafiscalesLogica.getNombre()+MENSAJE_SALTO_LINEA.getMensaje()+
                    MENSAJE_COMPLEMENTO.getMensaje()+formateador.format(parafiscalesLogica.getSalario())+MENSAJE_SALTO_LINEA.getMensaje()+MENSAJE_SALUD.getMensaje()+formateador.format(parafiscalesLogica.calcularSalud())+
                    MENSAJE_SALTO_LINEA.getMensaje()+MENSAJE_PENSION.getMensaje()+formateador.format(parafiscalesLogica.calcularPension())+MENSAJE_SALTO_LINEA.getMensaje()+MENSAJE_TOTAL.getMensaje()+formateador.format(parafiscalesLogica.totalSalario()));




    }

}
