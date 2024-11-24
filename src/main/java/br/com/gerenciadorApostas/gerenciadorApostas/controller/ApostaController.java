package br.com.gerenciadorApostas.gerenciadorApostas.controller;

import br.com.gerenciadorApostas.gerenciadorApostas.model.Aposta;
import br.com.gerenciadorApostas.gerenciadorApostas.service.ApostaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aposta")
public class ApostaController {

@Autowired
private ApostaServices apostaServices;

@GetMapping( produces = MediaType.APPLICATION_JSON_VALUE)
public List<Aposta> listarTodasApostas(){
    return  apostaServices.listarTodasApostas();
}

@GetMapping(value = "/{idBilhete}", produces = MediaType.APPLICATION_JSON_VALUE)
public Aposta buscarApostaPorId (@PathVariable (value = "idBilhete") String idBilhete){
    return apostaServices.buscarApostaPorId(idBilhete);
}

    @PostMapping (value = "/cadastrar-aposta",
            consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Aposta cadastrarAposta(@RequestBody Aposta aposta){
        return apostaServices.cadastrarAposta(aposta);
    }
}
