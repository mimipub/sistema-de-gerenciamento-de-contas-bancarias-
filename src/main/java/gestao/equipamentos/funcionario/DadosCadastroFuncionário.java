package gestao.equipamentos.funcionario;

public record DadosCadastroFuncionário(
        String nome,
        String email,
        String cargo,
        String departamento,
        StatusFuncionario status
) {
}
