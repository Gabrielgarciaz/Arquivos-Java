package aplicacao;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Entre com o caminho da pasta:  ");
	String caminhoPasta = sc.nextLine();
	
	File caminho = new File(caminhoPasta);
		
	File[] pastas = caminho.listFiles(File::isDirectory); // Somente quem for diretorio ou pasta
	
	System.out.println("PASTAS: ");
	for(File pasta : pastas) {
		System.out.println(pasta);
		
	}
	
	File[] arquivos = caminho.listFiles(File::isFile);
	System.out.println("ARQUIVOS: ");
	for(File arquivo : arquivos){
		System.out.println(arquivo);
	}
	
	boolean sucesso = new File(caminhoPasta + "\\subPasta").mkdir(); // Criar subpasta
	if(sucesso == true) {
		System.out.println("Sucesso!");
	}
	
	
		sc.close();
	}
}
