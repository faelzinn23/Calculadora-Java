package calculator_plus;
import java.util.Scanner;
public class Operacoes {
    double display;
    double x=0;
    double y=0;
    Scanner input = new Scanner(System.in);
    public Operacoes(double y){
        display=y;
    }
    
    
    public void somar(){
        System.out.print("digite para somar:");
        x = input.nextDouble();
        display = display + x;
        
    }
    public void subtrair(){
        System.out.print("digite para subtrair:");
        x = input.nextDouble();
        display = display - x;
        
    }
    
    public void multiplicar(){
        System.out.print("digite para multiplicar:");
        x = input.nextDouble();
        display = display * x;
        
    }
    
    public void dividir(){
        System.out.print("digite para dividir:");
        x = input.nextDouble();
        
        if(x==0 ){
            System.out.println("\n\n\t\tERRO! numero nao pode ser dividido por ZERO!\n");
        }else{
            display = display /x;
        }
        
            
        
    }
    
    public void zerar_display(){
        display=0;
        System.out.println("\n\tdysplay zerado com sucesso!\n");
    }
    public void show_display(){
        
        System.out.println("-------------------------------------------------------------------------------------\n");
        System.out.println("\t\t\t\t<-RESULTADO:"+display+"->");
        System.out.println("\n-------------------------------------------------------------------------------------\n");
    }
        
}
    
    
    
    

