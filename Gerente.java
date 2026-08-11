package pdv;

public class Gerente extends Funcionario {

    private String setor;
    private float bonus;

    public Gerente() {
        setCargo("Gerente");
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\n===== DADOS DO GERENTE =====");
        super.mostrarDados();
        System.out.println("Setor: " + setor);
        System.out.println("Bônus: R$ " + bonus);
    }
}