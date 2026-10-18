package gestao.equipamentos.equipamento;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record RegistroEquipamento(
        @NotBlank
        String nome,
        @NotBlank
        String tipo,
        @NotBlank
        String patrimonio,

        @NotBlank
        @Valid Status status) {
}
