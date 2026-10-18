package gestao.equipamentos.funcionario;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Table(name = "funcionario")
@Entity (name = "Funcionario")

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Funcionario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cargo;
    private String departamento;
    private StatusFuncionario status;

    public Funcionario(DadosCadastroFuncionário dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.cargo = dados.cargo();
        this.departamento = dados.departamento();
        this.status = dados.status();
    }
}
