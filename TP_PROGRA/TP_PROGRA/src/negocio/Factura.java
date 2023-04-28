package negocio;

import java.util.ArrayList;
import java.util.Date;

// puede clonarse o no dependiendo del abonado
public class Factura implements Cloneable {
    private Abonado abonado;
    private Date fecha;
    private ArrayList<Contratacion> contrataciones = new ArrayList<Contratacion>();
    

    
    public Factura() {
        super();
    }
    
    public double getPrecioTotal(){
        return this.abonado.getPrecio(this);
        
    }
    
    public double getPrecioPFisica(){
        double montoTotal;
        for (){
            montoTotal+=;
        }
        
        return montoTotal;
    }
    
    public double getPrecioPJuridica(){
        double montoTotal;
        for (){
            montoTotal+=;
        }
        
        return montoTotal;
    }
    
}

