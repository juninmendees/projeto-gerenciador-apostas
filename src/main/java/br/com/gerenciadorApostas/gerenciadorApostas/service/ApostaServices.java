package br.com.gerenciadorApostas.gerenciadorApostas.service;

import br.com.gerenciadorApostas.gerenciadorApostas.model.Aposta;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class ApostaServices {

    private final AtomicLong geradorIds = new AtomicLong();
    private Logger logger = Logger.getLogger(Aposta.class.getName());

    public Aposta buscarApostaPorId(String id){
        logger.info("Localizando aposta...");

        //Mock
        Aposta aposta = new Aposta();

        aposta.setIdBilhete(geradorIds.incrementAndGet());
        aposta.setData(new Date());
        aposta.setProcessada(false);
        aposta.setVencida(false);
        aposta.setOdd(2.8);
        aposta.setValor(22.90);
        aposta.setValorRecebido(0.0);

        return aposta;
    }

    public List <Aposta> listarTodasApostas (){
        logger.info("Listando todas as apostas...");
        List<Aposta> listaApostas = new ArrayList<>();

        for (int i = 0; i<= 9; i++){
            Aposta aposta = mockarAposta();
            listaApostas.add(aposta);
        }
        return listaApostas;
    }

    public Aposta mockarAposta (){
        //Mock
        Aposta aposta = new Aposta();

        aposta.setIdBilhete(geradorIds.incrementAndGet());
        aposta.setData(new Date());
        aposta.setProcessada(false);
        aposta.setVencida(false);
        aposta.setOdd(2.8);
        aposta.setValor(22.90);
        aposta.setValorRecebido(0.0);

        return aposta;
    }

    public Aposta cadastrarAposta (Aposta aposta){
        logger.info("Cadastrando Aposta...");
        return aposta;
    }
}
