package fiap.com.br;

public class UsaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Anny");
		funcionario1.setValorHora(120);
		
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.salario(3000));

	}

}
