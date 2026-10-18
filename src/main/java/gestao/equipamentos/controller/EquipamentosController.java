package gestao.equipamentos.controller;

import gestao.equipamentos.equipamento.Equipamento;
import gestao.equipamentos.equipamento.EquipamentoService;
import gestao.equipamentos.equipamento.ListarDadosEquipamentos;
import gestao.equipamentos.equipamento.RegistroEquipamento;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipamento")
public class EquipamentosController{

    @Autowired
    private EquipamentoService equipamentoService;
    @PostMapping
    @Transactional
    public void cadastrarEquipamento(@RequestBody @Valid RegistroEquipamento equipamento){
        equipamentoService.save(new Equipamento(equipamento));
    }

//    @GetMapping
//    public List<Equipamento> listarEquipamentos(){
//        return equipamentoService.findAll().stream().map(ListarDadosEquipamentos::new).toList();
//    }
}