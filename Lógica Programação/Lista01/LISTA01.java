/**
 * @(#)LISTA01.java
 *
 *
 * @author 
 * @version 1.00 2024/3/12
 */
 
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class LISTA01 {
        
    	public static void exec02(){
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    	List<Double> numbers = new ArrayList();
    	double input = 0;
    	
        while (input != -1){
        	
        		System.out.println("Insira um numero (Ou -1 para sair): ");
        		double entrada = scanner.nextDouble();
        		
        		if (entrada == -1){
        			input = -1;
        		} else {
        			numbers.add(entrada);
        		}
       	}
       	int contagem = numbers.size();
       	int soma = 0;
       	for (int i = 0; i < contagem; i++){
       		soma += numbers.get(i);
       	}
       	System.out.println("O sistema teve "+contagem+" Numeros inseridos.");
       	System.out.println("Soma dos numeros inseridos:  "+soma+".");
       	scanner.close();
	}
	
		public static void exec01(){
			int par = 0;
			int impar = 0;
			double input = 1;
			Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
			
			while (input != 0){
				
				System.out.println("Insira um numero (Ou 0 para sair): ");
				double entrada = scanner.nextDouble();
				
				if (entrada == 0){
					input = 0;
				}else{
					if (entrada % 2 == 0 ){
						par++;
					} else {
						impar ++;
					}
				}
			}
			System.out.println("Quantidade de numeros pares inseridos: "+par);
			System.out.println("Quantidade de numeros impares inseridos: "+impar);
			scanner.close();
		
	}
	
		public static void exec03(){
			
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("--- Insira 3 notas ---");
		
		double soma = 0;
		
		for (int i = 1; i<4; i++){
			System.out.println("digite a "+i+" nota: ");
			double nota1 = scanner.nextDouble();
			soma = soma + nota1;
		}
		
		double media = soma/3;
		
		System.out.println("\nA sua media de notas foi de: "+ String.format("%.2f", media) );
		scanner.close();
			
		}
	
    public static void main(String[] args) {
        // exec01();
        // exec02();
        exec03();
    }
}
