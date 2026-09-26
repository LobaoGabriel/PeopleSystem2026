package tech.lobao.pessoas;

import java.time.LocalDate;

public class Cliente extends Pessoa {
    public Cliente() {
        super();
    }

    public Cliente(int matricula, String nome, LocalDate dataNascimento) {
        super(matricula, nome, dataNascimento);
    }
}