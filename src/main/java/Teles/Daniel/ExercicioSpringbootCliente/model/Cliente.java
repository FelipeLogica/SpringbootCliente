package Teles.Daniel.ExercicioSpringbootCliente.model;

public class Cliente {

    private String nome;
    private String sobrenome;
    private int renda;

    public Cliente() {
    }

    /**
     *
     * @param nome Recebe o nome de um cliente
     * @param sobrenome Recebe o sobrenome de um cliente
     * @param renda Recebe a idade de um cliente
     */
    public Cliente(String nome, String sobrenome, int renda) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getRenda() {
        return renda;
    }

    public void setRenda(int renda) {
        this.renda = renda;
    }

    public double adicionarDezPorCentoNaRenda() {
        return this.renda *1.10;
    }

    @Override
    public String toString() {
        return   "\nNome: " + this.nome +" "+ this.sobrenome
                +"\nRenda: " + this.renda
                +"\nRenda mais 10%: " + this.adicionarDezPorCentoNaRenda();
    }
}
