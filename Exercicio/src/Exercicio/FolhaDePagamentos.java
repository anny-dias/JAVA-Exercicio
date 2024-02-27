package Exercicio;

public class FolhaDePagamentos {

	public double salarioBruto;
	public int numeroDeDependentes;
	public double descontoINSS;
	public double valorPlanoDeSaude;
	
	public void calcularSalarioLiquido(double x) {
		x = (salarioBruto - (((descontoINSS * salarioBruto) / 100) + valorPlanoDeSaude * (numeroDeDependentes + 1)));
		System.out.println("Salario Liquido: " + x );
	}

}
