package entitites;

public class EmployeeExercicioLista {

	private Integer id;
	private String nome;
	private Double salario;

	public EmployeeExercicioLista() {
	}

	public EmployeeExercicioLista(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;

	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void increaseSalary(double percentage) {
		salario += salario * percentage / 100.0;
	}

}
