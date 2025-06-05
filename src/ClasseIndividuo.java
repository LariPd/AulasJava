
public class ClasseIndividuo {

	 private String nomeAt;
	 private int rendaAt;
	
	public ClasseIndividuo(String nome, int renda) {
		this.nomeAt = nome;
		this.rendaAt = renda; 
	}
	
	public void mostrarNome() {
		System.out.println(this.nomeAt);
		}
	
		public void mostrarRenda() {
			System.out.println(this.rendaAt);
		}
	
}
