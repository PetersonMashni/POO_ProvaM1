package provam1petersonmashni;

import java.util.Scanner;

/**
 *
 * @author alu201612581
 */
public class ProvaM1PetersonMashni {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        Cafeteria cafeteria = new Cafeteria();
        cafeteria.setNome("Cafeteria FADERGS");
        cafeteria.mostraNome();
        
        for(int i=0; i<5; i++)
        {
            System.out.print("Digite o " + (i+1) + "º sabor: ");
            cafeteria.setSabor(i, leitor.nextLine());
            
            System.out.print("Digite o Valor deste sabor: ");
            cafeteria.setValor(i, leitor.nextFloat());
            
            leitor.nextLine();
        }
        
        cafeteria.listarSaboresEValores();
        
        System.out.print("Por favor, selecione o seu sabor: ");
        int sabor = leitor.nextInt() -1;
        leitor.nextLine();
        
        System.out.print("Informe a quantidade desejada: ");
        int quant = leitor.nextInt();
        leitor.nextLine();
        
        Cafe cafe = new Cafe();
        cafe.setSabor(cafeteria.getSabor(sabor));
        cafe.setValor(cafeteria.getValor(sabor));
        cafe.setQuantidade(quant);
        
        cafe.fecharCafe();
    }
    
}
