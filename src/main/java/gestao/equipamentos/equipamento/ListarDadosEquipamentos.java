package gestao.equipamentos.equipamento;

public record ListarDadosEquipamentos(String nome, String tipoEquipamento, String Patrimonio) {
    public ListarDadosEquipamentos (Equipamento equipamento) {
        this(equipamento.getNome_equipamento(), equipamento.getTipo(), equipamento.getTipo());
    }
}
