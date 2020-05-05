package forca;

import java.util.Scanner;

public class Programa {
public static void forcaImagem() {
	System.out.println("  º-------");
	System.out.println("  °      -");
	System.out.println("  °      -");
	System.out.println("  °");
	System.out.println("  °");
	System.out.println("  °");
	System.out.println("  °");
	System.out.println("  °");
	System.out.print("--º--    ");
}
public static void forcaImagem1() {
	System.out.println("  º-------");
	System.out.println("  °      -");
	System.out.println("  °      -");
	System.out.println("  °      O");
	System.out.println("  °");
	System.out.println("  °");
	System.out.println("  °");
	System.out.println("  °");
	System.out.print("--º--    ");
}
public static void forcaImagem2() {
	System.out.println("  º-------");
	System.out.println("  °      -");
	System.out.println("  °      -");
	System.out.println("  °      O");
	System.out.println("  °      |");
	System.out.println("  °    --|-- ");
	System.out.println("  °");
	System.out.println("  °");
	System.out.print("--º--    ");
}
public static void forcaImagem3() {
	System.out.println("  º-------");
	System.out.println("  °      -");
	System.out.println("  °      -");
	System.out.println("  °      O");
	System.out.println("  °      |");
	System.out.println("  °    --|-- ");
	System.out.println("  °      |");
	System.out.println("  °      A");
	System.out.print("--º--    ");
}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Palavra cores = new Palavra(Tipo.valueOf("CORES")); 
		cores.nome("azul");
		cores.nome("verde");
		cores.nome("vermelho");
		cores.nome("amarelo");
		cores.nome("mostarda");
		cores.nome("roxo");
		cores.nome("laranja");
		cores.nome("rosa");
		cores.nome("cinza");
		cores.nome("magenta");
		cores.nome("vinho");
		cores.nome("marrom");
		
		Palavra animais = new Palavra(Tipo.valueOf("ANIMAIS"));
		animais.nome("abelha");
		animais.nome("abutre");
		animais.nome("alce");
		animais.nome("alpaca");
		animais.nome("anaconda");
		animais.nome("andorinha");
		animais.nome("baleia");
		animais.nome("besouro");
		animais.nome("cabra");
		animais.nome("camelo");
		animais.nome("capivara");
		animais.nome("canguru");
		
		Palavra corEmIngles = new Palavra(Tipo.valueOf("CORES_EM_INGLES"));
		corEmIngles.nome("white");
		corEmIngles.nome("yellow");
		corEmIngles.nome("blue");
		corEmIngles.nome("red");
		corEmIngles.nome("green");
		corEmIngles.nome("black");
		corEmIngles.nome("brown");
		corEmIngles.nome("grey");
		corEmIngles.nome("orange");
		corEmIngles.nome("fuchsia");
		corEmIngles.nome("lime");
		corEmIngles.nome("hot pink");
		corEmIngles.nome("olive");
		corEmIngles.nome("charcoal");
		corEmIngles.nome("magenta");
		
		System.out.println("  J - G -  D A  F - R C A  (Matheus Edition)");
		System.out.println("\n");
		forcaImagem();
		System.out.println("\n~~~~~~~~~~~~~~~~~~");
		
		System.out.println("1- CORES \n"
				+ "2- ANIMAIS \n"
				+ "3- CORES EM INGLÊS");
		
		System.out.println("~~~~~~~~~~~~~~~~~~\n");
		int chutes = 0;
		int acertos = 0;
		
		System.out.print("Digite o número pra começar a jogar: ");
		int numero = scan.nextInt();
		
		switch(numero) {
		
			case 1:
				System.out.println("Você escolheu CORES.");
				String resposta1 = cores.sorteioNome();
				String[] resultado = new String[resposta1.length()];
				int i = 0;
				for (i =0; i < resposta1.length(); i++ ) {
					resultado[i] = " - ";
				}
				
				while (chutes < 3 && acertos < (resposta1.length())) {
					System.out.print("\nDigite uma letra: ");
					String letra = scan.next();
					
					if (resposta1.contains(letra)) {
						int index = resposta1.indexOf(letra);
						while (index >= 0) {
						    resultado[index] = letra;						    
							index = resposta1.indexOf(letra, index + 1);
							acertos = acertos + 1;
						}
						
						forcaImagem();
						for (i =0; i < resposta1.length(); i++ ) { //escrever a palavra com os chutes
							System.out.print(resultado[i]);	
						}
						
						System.out.println();
						if(acertos >= (resposta1.length())) {
							System.out.println("Parabéns, você acertou! ");
						}
					}
					
					else {
						chutes += 1;
						switch(chutes) {
						case 1: 
							forcaImagem1();
							break;
						case 2: 
							forcaImagem2();
							break;
						case 3: 
							forcaImagem3();
							break;
						}
						System.out.println("Você tem mais " + (3 -chutes) + " chutes.");
					}
				
				}
			break;
		
		case 2:
			System.out.println("Você escolheu ANIMAIS.");
			String resposta2 = animais.sorteioNome();
			String[] resultado2 = new String[resposta2.length()];
			i = 0;
			for (i =0; i < resposta2.length(); i++ ) {
				resultado2[i] = " - ";
			}
			
			while (chutes < 3 && acertos < (resposta2.length())) {
				System.out.print("\nDigite uma letra: ");
				String letra = scan.next();
				
				if (resposta2.contains(letra)) {
					int index = resposta2.indexOf(letra);
					while (index >= 0) {
					    resultado2[index] = letra;						    
						index = resposta2.indexOf(letra, index + 1);
						acertos = acertos + 1;
					}
					
					forcaImagem();
					for (i =0; i < resposta2.length(); i++ ) { //escrever a palavra com os chutes
						System.out.print(resultado2[i]);	
					}
					
					System.out.println();
					if(acertos >= (resposta2.length())) {
						System.out.println("Parabéns, você acertou! ");
					}
				}
				
				else {
					chutes += 1;
					switch(chutes) {
					case 1: 
						forcaImagem1();
						break;
					case 2: 
						forcaImagem2();
						break;
					case 3: 
						forcaImagem3();
						break;
					}
					System.out.println("Você tem mais " + (3 -chutes) + " chutes.");
				}
			
			}
			
		break;
		
		case 3:
			System.out.println("Você escolheu CORES IN ENGLISH.");
			String resposta3 = corEmIngles.sorteioNome();
			String[] resultado3 = new String[resposta3.length()];
			i = 0;
			for (i =0; i < resposta3.length(); i++ ) {
				resultado3[i] = " - ";
			}
			
			while (chutes < 3 && acertos < (resposta3.length())) {
				System.out.print("\nDigite uma letra: ");
				String letra = scan.next();
				
				if (resposta3.contains(letra)) {
					int index = resposta3.indexOf(letra);
					while (index >= 0) {
					    resultado3[index] = letra;						    
						index = resposta3.indexOf(letra, index + 1);
						acertos = acertos + 1;
					}
					
					forcaImagem();
					for (i =0; i < resposta3.length(); i++ ) { //escrever a palavra com os chutes
						System.out.print(resultado3[i]);	
					}
					
					System.out.println();
					if(acertos >= (resposta3.length())) {
						System.out.println("Parabéns, você acertou! ");
					}
				}
				
				else {
					chutes += 1;
					switch(chutes) {
					case 1: 
						forcaImagem1();
						break;
					case 2: 
						forcaImagem2();
						break;
					case 3: 
						forcaImagem3();
						System.out.println("Você perdeu! :(");
						break;
					}
					System.out.println("Você tem mais " + (3 -chutes) + " chutes.");
				}
			
			}
		break;

		}
			
				
	}

}
