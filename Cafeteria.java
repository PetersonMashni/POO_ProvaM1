package provam1petersonmashni;

/**
 *
 * @author alu201612581
 */
public class Cafeteria {
    private String nome;
    private String[] sabores = new String[5];
    private Float[] valores = new Float[5];

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void mostraNome()
    {
        System.out.println("+---------------------------------------+");
        System.out.println(" Seja Bem-vindo à " + nome);
        System.out.println("+---------------------------------------+");
    }

    public void setSabor(int pos, String sabor) {
        sabores [pos] = sabor;
    }
    
    public String getSabor(int pos) {
        return sabores [pos];
    }

    public void setValor(int pos, Float valor) {
        valores [pos] = valor;
    }
    
    public Float getValor(int pos) {
        return valores [pos];
    }
    
    public Float[] getValores() {
        return valores;
    }

    public void setValores(Float[] valores) {
        this.valores = valores;
    }
    
    public void listarSaboresEValores ()
    {
        System.out.println("-------- [ MENU ] --------");
        for(int i=0; i<5; i++)
        {
            System.out.print((i+1) + "º " + sabores[i] + "\t" + valores[i] + "\n");
        }
        System.out.println("--------------------------");
    }
    
    
    
    
}
