package med.voll.API.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.API.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank // nao pode ser nulo e nem o campo esta vazio, notBlank so para Strings
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        //fazer a validacao do crm passando o D para dizer que sao digitos e entre chaves a quantidade que pode ser inserida, nesse caso entre 4 e 6
        String crm,
        @NotNull
        Especialidade especialidade,
        @NotNull @Valid DadosEndereco enderecoMedico) {
}
