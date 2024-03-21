/**
 * @(#)Loteria.java (Sem Interface)
 *
 *
 * @author Pedro Lucas Silva Câmara / RA 12119362
 * @version 1.00 2024/3/19
 */

import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class Loteria {
  	
  	public static void opcao1(int number){
  		try{
	  		Random rand = new Random();
	  		int random = rand.nextInt(101);
	  		
	  		if (number>100 || number<0){
	  			System.out.println("[INFO] !! APOSTA INVALIDA !! VALOR INVALIDO INSERIDO ("+number+")!!");
	  		} else if (random == number){
	  			System.out.println("[INFO] -- SORTED NUMBER: ("+random+") --");
	  			System.out.println("[WINNER] --- VOCE GANHOU R$1.000,00. ---");
	  		}
	  		else{
	  			System.out.println("[INFO] -- SORTED NUMBER: ("+random+") --");
	  			System.out.println("[LOSER] --- QUE PENA! O NUMERO SORTEADO FOI ("+ random +") ---");
	  		}
	  		
  		} catch (Exception err){
  			System.err.println("\n[ERROR] AO EXECUTAR APOSTA1 | ERROR CODE (003) | "+err);
    		// ENCERRAR SISTEMA;
  		}
  	}
  	
  	public static void opcao2(char letra, char letraPremiada){
  		try{
  			letra = Character.toUpperCase(letra);
			System.out.println("[INFO] LETRA SORTEADA ("+letraPremiada+") | LETRA APOSTA ("+letra+").");
			
			if (letra == letraPremiada) {
			    System.out.println("[WINNER] -- VOCE GANHOU R$500,00 REAIS. --");
			} else {
			    System.out.println("[LOSER] -- QUE PENA! A LETRA SORTEADA FOI: ("+letraPremiada+"). --");
			}
		
  		}catch(Exception err){
  			System.err.println("\n[ERROR] AO EXECUTAR APOSTA2 | ERROR CODE (004) | "+err);
    		// ENCERRAR SISTEMA;
  		}
  	}
  	
  	public static void opcao3(int number){
  		try{
  			if (number % 2 == 0){
  				System.out.println("[WINNER] --- VOCE GANHOU R$100,00 REAIS. ---");
  			}else{
  				System.out.println("[LOSER] --- QUE PENA! O NUMERO DIGITADO E IMPAR E A PREMIACAO FOI PARA NUMEROS PARES. ---");
  			}
  		}catch(Exception err){
  			System.err.println("\n[ERROR] AO EXECUTAR APOSTA3 | ERROR CODE (005) | "+err);
  		}
  	}
  	
    public static void PrintMenu() {
    	try{
    		System.out.println("\n----- LOTO FACIL -----");
			System.out.println("Digite uma abaixo opcao para prosseguir: ");
			System.out.println("1) Apostar de 0 a 100.\n2) Apostar de A a Z.\n3) Apostar em numero Par ou Impar.\n0) Sair.");
    	}catch(Exception err){
    		System.err.println("\n[ERROR] AO IMPRIMIR MENU | ERROR CODE (001) | "+err);
    		// ENCERRAR SISTEMA;
    	}
    }
    
    public static void menuLoteria(){
    	try{
    	
	    	Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
	    	
	    	int navMenu = 10;
	    	
	    	do{
	    		PrintMenu();
	    		
	    		System.out.print("--> ");
	    		navMenu = Integer.parseInt(entrada.next());
	    		
	    		switch (navMenu){
	    			case 1:
	    				System.out.println("\n---- APOSTAR DE 0 A 100 SELECIONADA ----");
	    				System.out.print("INSIRA UM VALOR DE 0 A 100 (INTEIRO) --> ");
  						int value = Integer.parseInt(entrada.next());
  						opcao1(value);
	    				break;
	    				
	    			case 2:
	    				System.out.println("\n---- APOSTAR DE A a Z SELECIONADA ----");
	    				System.out.print("INSIRA UMA LETRA DE A a Z --> ");
	    				
	    				int byteRead = System.in.read();
	    				char letra = (char) byteRead;
	    				
  						if (Character.isLetter(letra)){
  							char letraPremiada = "P".charAt(0);
  							opcao2(letra, letraPremiada);
  						}else{
  							System.out.println("[ERROR] !! ("+letra+") CARACTER INVALIDO | INSIRA UMA LETRA !!");
  						}
						break;
						
	    			case 3:
	    				System.out.println("\n---- APOSTAR NUMERO IMPAR OU PAR SELECIONADA ----");
	    				System.out.print("INFORME UM NUMERO (INTEIRO) --> ");
	    				int number = Integer.parseInt(entrada.next());
	    				opcao3(number);
	    				break;
	    			case 0:
	    				System.out.println("\n[EXIT] Encerrando Sistema...");
	    				break;
	    				
	    			default:
	    				System.err.println("\n[INFO] !! Opcao invalida !!");
	    				navMenu = 10;
	    				break;
	    			
	    		} // final do
	    	} while (navMenu != 0);
	    	
	    	entrada.close();
	    	
    	} catch(Exception err){
    		System.err.println("\n[ERROR] AO EXECUTAR MENU LOTERIA | ERROR CODE (002) | "+err);
    	} // Final do catch
    }

    public static void main(String[] args) {
        menuLoteria();
    }
}
