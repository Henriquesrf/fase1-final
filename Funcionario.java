package pdv;

public abstract class Funcionario {

    private int id;
    private String nome;
    private String CPF;
    private float salario;
    private String cargo;

    public void mostrarDados() {
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Cargo: " + cargo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}