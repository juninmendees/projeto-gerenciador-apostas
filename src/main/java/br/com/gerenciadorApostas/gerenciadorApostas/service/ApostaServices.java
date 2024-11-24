package br.com.gerenciadorApostas.gerenciadorApostas.service;

import br.com.gerenciadorApostas.gerenciadorApostas.exceptions.ResourceNotFoundException;
import br.com.gerenciadorApostas.gerenciadorApostas.model.Aposta;
import br.com.gerenciadorApostas.gerenciadorApostas.repositorio.ApostaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class ApostaServices {


    private Logger logger = Logger.getLogger(Aposta.class.getName());

    @Autowired
    ApostaRepositorio apostaRepositorio;

    public Aposta buscarApostaPorId(Long id){
        logger.info("Localizando aposta...");

        return apostaRepositorio.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Nenhum registro encontrado para o id informado"));
    }

    public List <Aposta> listarTodasApostas (){
        logger.info("Listando todas as apostas...");
        return apostaRepositorio.findAll();
    }


    public Aposta cadastrarAposta (Aposta aposta){
        logger.info("Cadastrando Aposta...");
        return apostaRepositorio.save(aposta);
    }

    public Aposta alterarAposta (Aposta aposta){
        if (aposta.getProcessada()){
            //TODO Melhorar a mensagem e utilizar o statusCode correto (400)
            throw new RuntimeException("Não é possivel alterar aposta já processada.");
        }
        logger.info("Alterando Aposta...");

        Aposta apostaASerAlterada = apostaRepositorio.findById(aposta.getIdBilhete())
                .orElseThrow(()-> new ResourceNotFoundException("Nenhum registro encontrado para o id informado"));

        apostaASerAlterada.setVencida(aposta.getVencida());
        apostaASerAlterada.setData(aposta.getData());
        apostaASerAlterada.setOdd(aposta.getOdd());
        apostaASerAlterada.setProcessada(aposta.getProcessada());
        apostaASerAlterada.setValor(aposta.getValor());
        apostaASerAlterada.setValorRecebido(aposta.getValorRecebido());

        return apostaRepositorio.save(apostaASerAlterada);
    }

    public void deletarAposta (Long idAposta){
        Aposta apostaaSerDeletada = apostaRepositorio.findById(idAposta)
                .orElseThrow(()-> new ResourceNotFoundException("Nenhum registro encontrado para o id informado"));
        logger.info("Deletando Aposta...");

        apostaRepositorio.delete(apostaaSerDeletada);
    }
}
