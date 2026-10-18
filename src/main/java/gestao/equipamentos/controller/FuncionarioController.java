package gestao.equipamentos.controller;


import gestao.equipamentos.funcionario.DadosCadastroFuncionário;
import gestao.equipamentos.funcionario.Funcionario;
import gestao.equipamentos.funcionario.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public void CadastraFuncionario(@RequestBody DadosCadastroFuncionário dados){
        funcionarioService.save(new Funcionario(dados));
    }
}
