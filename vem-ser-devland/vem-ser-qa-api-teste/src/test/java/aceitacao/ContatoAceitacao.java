package aceitacao;

import aceitacao.dto.ContatoDTO;
import aceitacao.service.ContatoService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ContatoAceitacao {

    ContatoService contatoService = new ContatoService();

    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    }


    //==================================================================================================================
    //                                                 POST
    //==================================================================================================================

    // PERMISSÃO TESTADA: ROLE_DEV
    // ENDPOINT: 6 de contato-controller
    // CAMINHO: /contato/adicionar-se
    // RESULTADO DO TESTE: ok

    @Test
    public void incluirContato() throws IOException {

        String jsonBody = lerJson("src/test/resources/data/contato.json");

        ContatoDTO resultService = contatoService.adicionarContato(jsonBody);

        // VALIDAÇÃO
        Assert.assertEquals(resultService.getDescricao(), "Radio");
    }

    //==================================================================================================================
    //                                                   PUT
    //==================================================================================================================

    // PERMISSÃO TESTADA: ROLE_DEV
    // ENDPOINT: 7 de contato-controller
    // CAMINHO: /contato/editar-se
    // RESULTADO DO TESTE: ok

    @Test
    public void editarContato() throws IOException {

        // Iniciando o ciclo adicionando um contato
        incluirContato();

        // Inserindo o parâmetro necessário para editar
        Integer idContato = 10;

        // Leitura da massa de dados
        String jsonBody = lerJson("src/test/resources/data/contatoEditado.json");


        ContatoDTO resultService = contatoService.editarContato(idContato, jsonBody);

        // VALIDAÇÃO
        Assert.assertEquals(resultService.getDescricao(), "Whatsapp");


        // Finalizo o ciclo excluindo
        //deletarUser();
    }

    //==================================================================================================================
    //                                                 DELETE
    //==================================================================================================================

    // PERMISSÃO TESTADA: ROLE_DEV
    // ENDPOINT: 1 de contato-controller
    // CAMINHO: /contato/deletar-se
    // RESULTADO DO TESTE: fixme 403 no endpoint - não está deletando contato do usuário no teste da aplicação pelo Swagger
    // Conversado sobre com a equipe, checaremos as autorizações e depois refarei o código do teste.

    //==================================================================================================================
    //                                                 GET
    //==================================================================================================================

    //todo


}
