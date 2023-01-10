package med.voll.API.paciente;

import med.voll.API.endereco.DadosEndereco;

public record DadosCasdastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco enderecoPaciente) {
}
