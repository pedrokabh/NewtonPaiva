/**
 * @(#)Loteria.java (Sem Interface)
 *
 *
 * @author Pedro Lucas Silva C�mara / RA 12119362
 * @version 1.00 2024/3/19
 */

import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class Loteria {
  	
  	public static String Opcao1(int number){
		String message = null;
  		try{
	  		Random rand = new Random();
	  		int random = rand.nextInt(101);

	  		if (number>100 || number<0){
				  message = "INSIRA UM VALOR ENTRE 0 E 100\nVALOR INVALIDO INSERIDO ("+number+")";
	  		} else if (random == number){
				  message = "SORTED NUMBER: ("+random+") " + "\n[WINNER] VOCE GANHOU R$1.000,00.";
	  		}
	  		else{
				  message = "SORTED NUMBER: ("+random+")" + "\n[YOU LOSE] QUE PENA! O NUMERO SORTEADO FOI ("+ random +")";
	  		}

			return message;

  		} catch (Exception err){
			  message = "\n[ERROR] AO EXECUTAR APOSTA1 | ERROR CODE (003) | "+err;
			  return message;
  		}
  	}
  	
  	public static String Opcao2(char letra, char letraPremiada){
		  String message = null;
  		try{
			  letra = Character.toUpperCase(letra);
			  message = "[INFO] LETRA SORTEADA ("+letraPremiada+")\nLETRA APOSTA ("+letra+").\n";
			
			if (letra == letraPremiada) {
				message += "[WINNER] PARABÉNS VOCE GANHOU\n  R$500,00 REAIS.";
			} else {
				message += "[LOSER] QUE PENA VOCÊ PERDEU!\n A LETRA SORTEADA FOI: ("+letraPremiada+").";
			}
			return message;

  		}catch(Exception err){
  			message = "[ERROR] AO EXECUTAR APOSTA2\nERROR CODE (004)\n"+err;
			return message;
  		}
  	}
  	
  	public static String Opcao3(int number){
	  	String message = null;
  		try{
			  if (number % 2 == 0){
				  message = "[WINNER] PARABENS VOCE GANHOU R$100,00 REAIS.\n";
				  message+= "SEU NUMERO FOI PREMIADO("+number+")";
			  }else{
				  message = "[LOSER] --- QUE PENA VOCE PERDEU!\n";
				  message+= "A PREMIACAO FOI PARA NUMEROS PARES.\n";
				  message+= "SEU NUMERO FOI ("+number+")";
			  }

			  return message;

  		}catch(Exception err){
			  message = "[ERROR] AO EXECUTAR APOSTA3\nERROR CODE (005)\n"+err;
			  return message;
  		}
  	}

    public static void main(String[] args) {
    }
}
