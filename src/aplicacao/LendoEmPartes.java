package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Funcionario;

public class LendoEmPartes {
	public static void main(String[] args) {
		List<Funcionario> lista = new ArrayList<>();
		
		String caminho = "C:\\temp\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			String funcionarioCSV = br.readLine();
			
			while(funcionarioCSV != null) {
				String[] campos = funcionarioCSV.split(",");
				lista.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));
				funcionarioCSV = br.readLine();
			}
			Collections.sort(lista);
			for(Funcionario funcionario : lista) {
				System.out.println(funcionario.getNome() + ", " + funcionario.getSalario());
			}
		} catch (IOException e){
			e.getMessage();
		}
	}
}
