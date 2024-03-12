import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;

public class Exec01 {
        
    public Exec01() {
    }
    
    // static final double PI = 3.14;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("\nInsira seu nome: ");
        String nome = entrada.next();
        
        System.out.println("\nInforme sua idade:");
        int idade = Integer.parseInt(entrada.next());
        
        System.out.println("\nInforme um numero salario:");
        double salario = Double.parseDouble(entrada.next());
        
        System.out.println("\nInforme 3 numeros:");
        int value1 = Integer.parseInt(entrada.next());
        int value2 = Integer.parseInt(entrada.next());
        int value3 = Integer.parseInt(entrada.next());
        double media = value+value2+value3/3;
        
        System.out.println("\n---Informacoes Levantadas ---\nNome:"+nome+"\nIdade:"+idade+"\nSalario:"+salario+"\nA soma dos seus numeros e:"+media);
        
        System.out.println("\n3 elevado a 2 = " + Math.pow(3, 2));
        System.out.println("Seno de 30 = " + Math.sin(Math.PI / 6));
        
    }
}
