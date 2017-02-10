/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author 203p21
 */
public class Fecha {

        int dia;
        int mes;
        int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public Fecha(){
    Calendar c=new GregorianCalendar();
    dia=c.get(Calendar.DAY_OF_MONTH);
    mes=c.get(Calendar.DAY_OF_WEEK);
    anio=c.get(Calendar.DAY_OF_YEAR);
    }
}
