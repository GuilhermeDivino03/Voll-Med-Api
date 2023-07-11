package med.voll.API.controller;

import med.voll.API.domain.paciente.DadosCasdastroPaciente;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    public void cadastrarPaciente(@RequestBody DadosCasdastroPaciente dadosPaciente) {
        System.out.println(dadosPaciente);
    }


}
