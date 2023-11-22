package calculator_plus;
import java.util.Scanner;
public class Calculator_plus {
    public static void main(String[] args) {
        Atalho at = new Atalho();
        at.logo();
        Scanner input = new Scanner(System.in);
        System.out.print("digite um numero: ");
        double display = input.nextDouble();
        Operacoes calc1=new Operacoes(display);
        at.linha1();
        OUTER:
        while(true){
            at.linha1();
            System.out.println("\nESCOLHA UMA OPCAO:\n[1-SOMAR]\n[2-SUBTRAIR]\n[3-MULTIPLICAR]\n[4-DIVIDIR]\n[5-MOSTRAR DISPLAY]\n[6-ZERAR DISPLAY]\n[7-SAIR]\n"); 
            at.linha2();
            int opcao = input.nextInt();
        
            switch (opcao) {
                
                case 1:

                    calc1.somar();
                    break;
                case 2:
                   
                    calc1.subtrair();
                    break;   
                case 3:
                    calc1.multiplicar();
                    break;
                case 4:
                    calc1.dividir();
                    break;
                case 5:
                    calc1.show_display();
                    break;
                case 6:
                    calc1.zerar_display();
                    
                    break;
                case 7:
                    break OUTER;
                default:
                    System.out.println("\n\t\tOPCAO INVALIDA! tente novamente.\n");
            }
        
        }
    } 
}
