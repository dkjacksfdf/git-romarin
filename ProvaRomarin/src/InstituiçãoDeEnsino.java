import java.util.Scanner;

public class InstituiçãoDeEnsino {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		String nomealuno;
		double nota, media = 0, somamedia = 0;
		String msg1 = "";
		String msg2 = "Aluno:";
		System.out.println("Informe o nome do professor:");
		String prof = sc.next();
		System.out.println("Digite o nome da turma:");
		String turma = sc.next();
		System.out.println("Informe a disciplina aplicada:");
		String disc = sc.next();
		System.out.println("Qual o número de alunos na turma?");
		int numalunos = sc.nextInt();
		System.out.println("Qual o número de avaliações realizadas na turma?");
		int numaval = sc.nextInt();
		for (i = 0; i < numalunos; i++) {
			System.out.println("Nome do aluno:");
			nomealuno = sc.next();
			for (int j = 0; j < numaval; j++) {
				System.out.println("Nota aluno:");
				nota = sc.nextDouble();
				msg1 += "\n" + nota + "\n";
				// operação
				somamedia += nota;

			}
			media = somamedia / numaval;
			msg2 += "\n" + nomealuno + ":\n" + msg1 + media;
			somamedia = 0;

		}
		if (media >= 7) {
			System.out.println("Aprovado");
		}
		if (media < 5) {
			System.out.println("Reprovado");
		}
		if (media >= 5 && media < 7) {
			System.out.println("Em exame");
		}

		System.out.println("Nome do professor: " + prof + "\nNome da turma: " + turma + "\nA disciplina aplicada foi: "
				+ disc + "\nO numero de alunos na turma é de: " + numalunos + "\nO total de avaliações foi de:"
				+ numaval + "\nAs notas e nomes dos alunos: " + msg2);
	}
}
