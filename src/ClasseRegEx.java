import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClasseRegEx {

	public static void main(String[] args) {
		
	String texto = "@gmail";
	String password = "123456";
		
		Pattern subtextoPadrao = Pattern.compile("[a-zA-Z0-9_#-]{1}+@gmail.com");
		Pattern PadraoSenha = Pattern.compile("[0-9]{6}");
		
		Matcher combina = subtextoPadrao.matcher(texto);
		Matcher combina2 = PadraoSenha.matcher(password);
		
		
		if(!combina.matches()) {
			System.out.println("Validado!");
		} else{
			System.out.println("Não validado!");
		}


	}

}
