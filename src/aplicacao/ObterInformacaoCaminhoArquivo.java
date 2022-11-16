package aplicacao;

import java.io.File;
import java.util.Scanner;

public class ObterInformacaoCaminhoArquivo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Entre com o caminho: ");
		 
		 String caminho = sc.nextLine();
		 
		 File cam = new File(caminho);
		  System.out.println("getName: " + cam.getName()); //Pega o nome do arquivo
		 
		  System.out.println("getParent " + cam.getParent()); // Somente caminho sem nome
		  
		  System.out.println("getPath " + cam.getPath()); // Todo o caminho completo
		  System.out.println("Teste: " + cam.getTotalSpace());
		 sc.close();
	}
}
