package negocio;

public class DecoratorPago implements IPago{
    private IPago encapsulado;
    
    public DecoratorPago() {
        super();
    }
}
