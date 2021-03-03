package HERANCA;

public class TesteInterface {
//programaprincipal
	public static void main(String[] args) {
		ParticipanteForum participante = new ParticipanteForum();  //instanciar
		
		Leitor leitor = participante;  //funciona igual instanciar
		System.out.println("O participante está lendo" + leitor.lendo()); 
		
		Programador programador = participante;
		String java = "JAVA";
		programador.pensando(java.toCharArray());
		System.out.println(" E programando: " + programador.digitando());
		
		

	}

}
