import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;
import java.util.HashMap;
import java.util.Map;

public class Lista01 {
        
    public static void Exercicio01() {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("----- Exercicio 01 -----");
        
        System.out.println("Digite os valores de a, b e c da equacao ax^2 + bx + c = 0:");
        
        System.out.println("-> Digite a: ");
        double valorA = Double.parseDouble(scanner.next());
        
        System.out.println("-> Digite o b: ");
        double valorB = Double.parseDouble(scanner.next());
        
        System.out.println("-> Digite o c: ");
        double valorC = Double.parseDouble(scanner.next());
        
        double delta = valorB * valorB - 4 * valorA * valorC;

        if (delta < 0 || valorA == 0) {
            System.out.println("Impossivel calcular. Delta negativo ou a igual a zero.");
        } else {
            double x1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);
            double x2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);
			
			System.out.println("\n----- RESULTADO -----");
            System.out.println("Raiz 1: " + x1);
            System.out.println("Raiz 2: " + x2);
        }

        scanner.close();
        
    }
    
    public static void Exercicio02(){
    	try{
    	
	    	System.out.println("----- Exercicio 2 -----");
	    		
	    	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	    	System.out.println("Insira duas notas: (formato: Double |0.0 a 10.0)");
	    	System.out.println("-> Insira a primeira nota:");
	    	double notaA = scanner.nextDouble();
	    	System.out.println("-> Insira a segunda nota:");
	    	double notaB = scanner.nextDouble();
	    	
	    	double media = (( (notaA*3.5) + (notaB*7.5)))  / (7.5 + 3.5);
	    	System.out.println("\n----- RESULTADO ----- \n"+"-> "+media);
	    	
    	}
	    catch (Exception e){
	    	System.out.println("Exeption: "+e);
	    }
    }
    
    public static void Exercicio03(){
    	System.out.println("----- Exercicio 3 -----");
    	
    	System.out.println("Digite um valor para saber o troco:");
    	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    	
    	double valor = scanner.nextDouble();
    	Map<String, Integer> dictionary = new HashMap<>();
    	// NOTAS 100, 50, 20, 10, 5, 2 
    	dictionary.put("100", 0);
    	dictionary.put("50", 0);
    	dictionary.put("20", 0);
    	dictionary.put("10", 0);
    	dictionary.put("5", 0);
    	dictionary.put("2", 0);
    	
    	// MOEDAS 1, 0.50, 0.25, 0.10, 0.05 e 0.01
    	dictionary.put("1", 0);
    	dictionary.put("0.50", 0);
    	dictionary.put("0.25", 0);
    	dictionary.put("0.10", 0);
    	dictionary.put("0.05", 0);
    	dictionary.put("0.01", 0);
    		
		while(valor > 0){
			for (String key : dictionary.keySet()){
				if (valor / Double.parseDouble(key) > 0){
					valor -= Double.parseDouble(key);
					dictionary.put(key, dictionary.get(key) + 1);
					break;
				}
			
			}
		}
	
    	System.out.println("Valor: "+valor);
    		
		System.out.println(
			"----- TROCO -----\n100 = "+dictionary.get("100")
			+"\n50 = "+dictionary.get("50")
			+"\n20 = "+dictionary.get("20")
			+"\n10 = "+dictionary.get("10")
			+"\n5 = "+dictionary.get("5")
			+"\n2 = "+dictionary.get("2")
			+"\n1 = "+dictionary.get("1")
			+"\n0.5 = "+dictionary.get("0.50")
			+"\n0.25 = "+dictionary.get("0.25")
			+"\n0.10 = "+dictionary.get("0.10")
			+"\n0.05 = "+dictionary.get("0.05")
			+"\n0.01 = "+dictionary.get("0.01")
			+"\nValor = "+valor);
    }
    
    public static void main(String[] args) {
        Exercicio03();
    }
}
