package gestao.equipamentos.equipamento;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table (name = "equipamentos")
@Entity (name = "Equipamento")
@EqualsAndHashCode (of = "Id")

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Equipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_equipamento;
    private String tipo;
    private String patrimonio;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Equipamento(RegistroEquipamento equipamento) {
        this.nome_equipamento = equipamento.nome();
        this.tipo = equipamento.tipo();
        this.patrimonio = equipamento.patrimonio();
        this.status = equipamento.status();
    }
}
