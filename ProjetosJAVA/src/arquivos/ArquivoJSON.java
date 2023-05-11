package arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ArquivoJSON {
	public static void main(String[] args) throws IOException {
		Usuario usuario1 = new Usuario();
		usuario1.setCpf("07346422457");
		usuario1.setLogin("Joao");
		usuario1.setSenha("123");

		Usuario usuario2 = new Usuario();
		usuario2.setCpf("987654321");
		usuario2.setLogin("Alex");
		usuario2.setSenha("12345");

		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
				
		String jsonUser = gson.toJson(usuarios);
		System.out.println(jsonUser);

		FileWriter fileWriter = new FileWriter("D:\\\\Projetos_Programacao\\\\ProjetosJAVA\\\\ProjetosJAVA\\\\src\\\\arquivos\\\\fileJson.txt");
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
	}
}
