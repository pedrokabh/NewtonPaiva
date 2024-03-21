import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;

public class Main {
        
    public Main() {
    }
    
    // Assigning value to PI inside a method or a static initialization block
    static final double PI = 3.14;
    	
    public static void main(String[] args) {
        // Correcting the usage of Locale
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("3 elevado a 2 = " + Math.pow(3, 2));
        System.out.println("Seno de 30 = " + Math.sin(Math.PI / 6));
        
        // Correcting the typo in System.out.println
        System.out.println("Informe um numero inteiro:");
        int valor1 = Integer.parseInt(entrada.next());
        System.out.println("O valor digitado foi: " + valor1);
        
        System.out.println("Informe um numero real:");
        double valor2 = Double.parseDouble(entrada.next());
        System.out.println("O valor digitado foi: " + valor2);
        
        System.out.println("Insira seu nome: ");
        String nome = entrada.next();
        System.out.println("O seu nome e: " + nome);
    }
}
