package med.voll.API.controller;


import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import med.voll.API.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarMedico(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new MedicoEntity(dados)); // passando o valid para o bean se integrar com o spring para fazer as validacoes encima do DTO
    }

    @GetMapping
    public Page<DadosListagemMedico> listagemMedica(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        return repository.findAllByAtivoTrue    (paginacao).map(DadosListagemMedico::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados) {
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletarMedico(@PathVariable long id){
        var medico = repository.getReferenceById(id);
        medico.excluir();
    }
}


