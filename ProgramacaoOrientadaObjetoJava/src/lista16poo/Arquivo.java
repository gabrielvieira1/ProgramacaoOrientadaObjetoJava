package lista16poo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.HashMap;

public class Arquivo<T> extends RegistroPessoas{
	T objet;
	// O caminho no linux não tem "//" 
	File arquivoAssinaturas = new File("/media/gabriel/NOVO/Eclipse/git/ProgramacaoOrientadaObjetoJava/ProgramacaoOrientadaObjetoJava/src/lista16poo/assinaturas.txt");
	Map<Object, Object> objeto = new HashMap<Object, Object>();
	
	public Arquivo(RegistroPessoas registroPessoas) {
		this.objet = (T) registroPessoas;
	}
	public String gravarLista(Map<Object, String> obj) throws IOException  {
		FileOutputStream fos;
		int cont = 0;
			if (!arquivoAssinaturas.exists()) {
				arquivoAssinaturas.createNewFile();
			}

				fos = new FileOutputStream(arquivoAssinaturas);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(obj);
				oos.close();
			return "Gravado com sucesso";
			
	}
	public Map<Object, Object> retornaLista() throws ClassNotFoundException, IOException{
		FileInputStream fis = new FileInputStream(arquivoAssinaturas);
		ObjectInputStream ois = new ObjectInputStream(fis);
		objeto = (Map<Object, Object>) ois.readObject();
		
		return objeto;
	}

}
