package tech.lobao.pessoas;

import java.time.LocalDate;
import java.time.Period;

public class Funcionario extends Pessoa {
    public Funcionario() {
        super();
    }

    public Funcionario(int matricula, String nome, LocalDate dataNascimento) {
        super(matricula, nome, dataNascimento);
    }

    /**
     * Cadastra (popula) os dados deste funcionário.
     */
    public void cadastrar(int matricula, String nome, LocalDate dataNascimento) {
        setMatricula(matricula);
        setNome(nome);
        setDataNascimento(dataNascimento);
    }

    /**
     * Retorna a idade em anos com base em dataNascimento. Retorna -1 se dataNascimento for nula.
     */
    public int obterIdade() {
        LocalDate nasc = getDataNascimento();
        if (nasc == null) return -1;
        return Period.between(nasc, LocalDate.now()).getYears();
    }

    // Compatibilidade com nome pedido: obteridade()
    public int obteridade() {
        return obterIdade();
    }
}