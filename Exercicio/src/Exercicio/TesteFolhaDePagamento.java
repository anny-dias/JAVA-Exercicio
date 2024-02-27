package Exercicio;

public class TesteFolhaDePagamento {

	public static void main(String[] args) {
		FolhaDePagamentos fp = new FolhaDePagamentos();
		
		fp.salarioBruto = 5000;
		fp.numeroDeDependentes = 2;
		fp.descontoINSS = 10;
		fp.valorPlanoDeSaude = 50;
		
		fp.calcularSalarioLiquido(0);

	}

}
