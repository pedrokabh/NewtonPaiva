/**
 * @(#)Lista02.java
 *
 *
 * @author 
 * @version 1.00 2024/3/21
 */
 import java.util.Scanner;
 import java.util.Locale;
 import java.util.ArrayList;

public class Lista02 {
        
    /**
     * Creates a new instance of <code>Lista02</code>.
     */
    public Lista02() {
    }
    
    public static void exercicio01(){
    	try{
    	
	    	Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
	    	
	    	System.out.println("Digite 4 numeros para saber sua soma: ");
	    	double soma = 0;
	    	
	    	for (int i = 0; i<4; i++){
	    		System.out.println("--> Digite um numero");
	    		double number = 0;
	    		number = Double.parseDouble(entrada.next());
	    		soma = soma+number;
	    	}
	    	
	    	System.out.println("\n[RESULT] Soma dos numeros e igual = "+soma);
    	}
		catch(Exception err){
			System.err.println("ERROR 001 | "+err);
		}
    }
    
    public static void exercicio02(){
    	try{
    		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
	    	
	    	System.out.println("Digite 3 notas para obter a media aritmetica: ");
	    	double[] notes = new double[5];
	    	
	    	for (int i = 0; i<3; i++){
	    		System.out.print("Digite uma nota --> ");
	    		double number = 0;
	    		number = Double.parseDouble(entrada.next());
	    		notes[i] = number;
	    	}
	    	double soma = 0;
	    	for (int i = 0; i < 4;i++){
	    		soma += notes[i];
	    	}
	    	System.out.println("\n[RESULT] MEDIA ARITMETICA CALCULADA = "+(soma/3));
    	}catch (Exception err){
    		System.err.println("ERROR 002 | "+err);
    	}
    }
    
    public static void exercicio03(){
    	try{
    		System.out.println("\n-- EXERCICIO 03 -- \n-- DIGITE O SALARIO DO FUNCIONARIO: ");
    		System.out.print("--> ");
    		
    		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
    		double salario = Double.parseDouble(entrada.next());
		    		
    		double novoSalario = salario + (salario*0.25);
    		
    		System.out.println("\n[RESULT] NOVO SALARIO CALCULADO ("+novoSalario+")");
    		
    		entrada.close();
    	}catch(Exception err){
    		System.err.println("ERROR 003 | "+err.getMessage());
    	}
    }
    
    public static void exercicio04(){
    	try {
    		System.out.println("\n-- EXERCICIO 04 -- \n-- DIGITE O SALARIO DO FUNCIONARIO E PERCENTUAL DE AUMENTO: ");
    		
    		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
    		
    		System.out.print("Salario --> ");
    		double salario = Double.parseDouble(entrada.next());
    		
    		System.out.print("Percentual (0% a 100%) --> ");
    		double percent = Double.parseDouble(entrada.next());
		    		
    		double novoSalario = salario + (salario*(percent/100));
    		
    		System.out.println("\n[RESULT] NOVO SALARIO CALCULADO (R$ "+novoSalario+")");
    		
    		entrada.close();
    	} catch (Exception err){
    		System.err.println("ERROR 004 | "+err);
    	}
    }
    
    public static void exercicio05(){
    	try {
    		System.out.println("\n-- EXERCICIO 05 -- \n-- DIGITE O SALARIO DO FUNCIONARIO: ");
    		
    		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
    		
    		System.out.print("Salario --> ");
    		double salario = Double.parseDouble(entrada.next());
    	
    		double conta = (salario*0.05) - (salario*0.07); // gratificacao - imposto
    		
    		
    		System.out.println("\n[RESULT] SALARIO (R$ "+salario+") | DESCONTOS (R$ "+conta+") | TOTAL (R$ "+(salario+conta)+") ");
    		
    		entrada.close();
    	} catch (Exception err){
    		System.err.println("ERROR 005 | "+err);
    	}
    }
    
     public static void exercicio06(){
    	try {
    		System.out.println("\n-- EXERCICIO 06 -- \n-- DIGITE O VALOR DE 4 PRODUTOS: ");
    		
    		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
    		double[] valorProdutos = new double[4];
    		double total = 0;
    		
    		for (int i = 0; i<4; i++){
	    		System.out.print("Digite o valor do produto --> ");
	    		double number = Double.parseDouble(entrada.next());
	    		valorProdutos[i]=number;
	    		total = total+number;
	    	}
    		
    		
    		if (total <= 100){
    			System.out.println("[TOTAL] R$"+total);
    		
    		}else if (total>100 && total<200){
    			double desconto = valorProdutos[0]*0.1;
    			double totalMenosDesc =  total - desconto;
    			System.out.println("\n[TOTAL] R$"+total+" | DESCONTOS R$"+desconto+" | TOTAL C/ DESCONTOS R$"+totalMenosDesc);
    			
    		}else if (total>200 && total<500){
    			double desconto = (valorProdutos[0]*0.15) + (valorProdutos[1]*0.15);
    			double totalMenosDesc = total - desconto;
    			System.out.println("\n[TOTAL] R$"+total+" | DESCONTOS R$"+desconto+" | TOTAL C/ DESCONTOS R$"+totalMenosDesc);
    		}else{
    			double desconto = total*0.25;
    			double totalMenosDesc = total - desconto;
    			System.out.println("\n[TOTAL] R$"+total+" | DESCONTOS R$"+desconto+" | TOTAL C/ DESCONTOS R$"+totalMenosDesc);
    		}
    		
    		entrada.close();
    	} catch (Exception err){
    		System.err.println("ERROR 005 | "+err);
    	}
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	exercicio06();
    }
}
