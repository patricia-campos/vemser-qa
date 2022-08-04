package aceitacao;

import aceitacao.dto.EnderecoDTO;
import aceitacao.service.EnderecoService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EnderecoAceitacao {

    EnderecoService enderecoService = new EnderecoService();

    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    }


    //==================================================================================================================
    //                                                 POST
    //==================================================================================================================

    // PERMISSÃO TESTADA: ROLE_DEV
    // ENDPOINT: 8 de endereco-controller
    // CAMINHO: /endereco/adicionar-meu-endereco
    // RESULTADO DO TESTE: ok


    @Test
    public void incluirEndereco() throws IOException {

        String jsonBody = lerJson("src/test/resources/data/endereco.json");

        EnderecoDTO resultService = enderecoService.adicionarEndereco(jsonBody);

        // VALIDAÇÃO
        Assert.assertEquals(resultService.getCidade(), "San Antonio");
    }

    //==================================================================================================================
    //                                                   PUT
    //==================================================================================================================

    // PERMISSÃO TESTADA: ROLE_DEV
    // ENDPOINT: 9 de endereco-controller
    // CAMINHO: /endereco/editar-se
    // RESULTADO DO TESTE: ok

    @Test
    public void editarEndereco() throws IOException {

        // Iniciando o ciclo adicionando um contato
        incluirEndereco();

        // Inserindo o parâmetro necessário para editar
        Integer idEndereco = 6;

        // Leitura da massa de dados
        String jsonBody = lerJson("src/test/resources/data/enderecoEditado.json");

        EnderecoDTO resultService = enderecoService.editarEndereco(idEndereco, jsonBody);

        // VALIDAÇÃO
        Assert.assertEquals(resultService.getLogradouro(), "La Carcacha Street");


        // Finalizo o ciclo excluindo
        //deletarUser();
    }

    //==================================================================================================================
    //                                                 DELETE
    //==================================================================================================================

    // PERMISSÃO TESTADA: ROLE_DEV
    // ENDPOINT: 2 de endereco-controller
    // CAMINHO: /endereco/deletar-se
    // RESULTADO DO TESTE: fixme 403 no endpoint - não está deletando endereço do usuário no teste da aplicação pelo Swagger
    // Conversado sobre com a equipe, checaremos as autorizações e depois refarei o código do teste.

    //==================================================================================================================
    //                                                 GET
    //==================================================================================================================

    //todo
}
