package med.voll.API.domain.paciente;

import med.voll.API.domain.endereco.DadosEndereco;

public record DadosCasdastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco enderecoPaciente) {
}
