package negocio;

public abstract class Contratacion { 
    protected int camaras;
    protected int botonesAntipanicos;
    protected boolean movilAcompanamiento;
    protected Domicilio domicilio; //NO SE PUEDE REPETIR
    protected int id;
    protected static int numeroId=0;
    protected double precio; //E

    protected static final double valorunidadCamara=3000;
    protected static final double valorunidadBotAntipanico=2000;
    protected static final double valorMovilAcompanamiento=7500;
                
    public Contratacion(int camaras, int botonesAntipanicos, boolean movilAcompanamiento, Domicilio domicilio, int id) {
        super();
        this.camaras = camaras;
        this.botonesAntipanicos = botonesAntipanicos;
        this.movilAcompanamiento = movilAcompanamiento;
        this.domicilio = domicilio;
        numeroId++;
        this.id=numeroId;
    }


    public int getCamaras() {
        return camaras;
    }

    public int getBotonesAntipanicos() {
        return botonesAntipanicos;
    }

    public boolean isMovilAcompanamiento() {
        return movilAcompanamiento;
    }
    
    public void aplicaPromo(Promo promo){
        promo.getPromocion(this);
    }
    
    public void aplicaPromocionPlatino();
    
    public void aplicaPromocionDorada();
}

