package provam1petersonmashni;

/**
 *
 * @author alu201612581
 */
public class Cafe {
    private String sabor;
    private Float valor;
    private int quantidade;
   
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
   
    public void fecharCafe()
    {
        System.out.println("Seu café " + sabor + " ficou R$" + (valor * quantidade));
    }
}
