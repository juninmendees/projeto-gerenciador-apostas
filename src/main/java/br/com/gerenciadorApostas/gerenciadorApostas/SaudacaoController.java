package br.com.gerenciadorApostas.gerenciadorApostas;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SaudacaoController {
    private static final String template ="Bem vindo, %s";
    private final AtomicLong geradorId = new AtomicLong();
    @RequestMapping("/saudacao")
    public Saudacao saudacao(
            @RequestParam(value = "name", defaultValue = "Usuário")
            String name) {
        return new Saudacao(geradorId.incrementAndGet(),
        String.format(template,name));


    }
}
