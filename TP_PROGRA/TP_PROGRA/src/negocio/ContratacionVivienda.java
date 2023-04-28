package negocio;

public class ContratacionVivienda extends Contratacion {
    private int precio; //E
    private static final double valorVivienda=8500;
   
    public ContratacionVivienda(int i, int i1, boolean b, Domicilio domicilio, int i2) {
        super(i, i1, b, domicilio, i2);
        this.precio=
    }
    
    public void promo(Promo promo){
       promo.promo(this);
     }

     public void aplicaPromocionDorada(){
       this.precio -= 1500;
     }

     public void aplicaPromocionPlatino(){
       this.precio *= 0.7;
     }
}
