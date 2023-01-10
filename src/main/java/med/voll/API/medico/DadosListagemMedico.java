package med.voll.API.medico;

public record DadosListagemMedico(long id,String nome, String email, String crm, Especialidade especialidade) {

    public DadosListagemMedico(MedicoEntity medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
