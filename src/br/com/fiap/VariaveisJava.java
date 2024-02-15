package br.com.fiap;

public class VariaveisJava {
	
	public static void main(String[] args) {
		
		// declarando e atribuindo valores nas variáveis
		// convenção: nome de variável sempre começar letra minúscula
		
		// tipo nome; -> apenas declarando sem atribuir valor
		// tipo nome = valor; -> atribui valor
		
		// TIPOS PRIMITIVOS 
		
		char sexo = 'f'; // ATENÇÃO: char o valor usa o ' ' apostofro
		byte idade = 25;
		short codigo = 15650;
		
		// dá pra atribuir várias variaveis do mesmo tipo numa unica linha              
		int alunos = 50, turma = 11; 
		
		long brasileiros = 216535749;
		
		float media = 9.9f; // somente para o float usar o f depois do número para indicar
		
		double cotacaoDolar = 4.94;
		
		boolean alternativa = false;
		
		// mostrando para o usuário -> tem que concatenar na variável
		
		System.out.println("Sexo: " + sexo + " Idade: " + idade);
		System.out.println("Código do produto: " + codigo);
		
		System.out.println("Alunos: " + alunos + "; Turma pertencente: " + turma
				+ "; Média de um aluno qualquer: " + media);
		
		System.out.println("Habitantes brasileiros: " + brasileiros);
		
		System.out.println("Cotação dólar: " + cotacaoDolar);
		
		System.out.println("Alternativa escolhida: " + alternativa);
		
		// NÃO PRIMITIVO
		
		String teste = "oi";
		
		System.out.println(teste);
	}
}
