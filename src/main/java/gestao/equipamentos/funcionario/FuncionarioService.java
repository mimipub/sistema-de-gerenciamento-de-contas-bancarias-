package gestao.equipamentos.funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioService extends JpaRepository<Funcionario, Long> {
}
