package aceitacao;

import aceitacao.dto.TecnologiasDTO;
import aceitacao.service.TecnologiasService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TecnologiasAceitacao {

    TecnologiasService tecnologiasService = new TecnologiasService();

    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    }

    //==================================================================================================================
    //                                                 POST
    //==================================================================================================================

    // PERMISSÃO TESTADA: ROLE_DEV
    // ENDPOINT: 3 de tecnologias-controller
    // CAMINHO: /tecnologia
    // RESULTADO DO TESTE: ok
    // OBS.: Conversado com a equipe para checar parâmetro por path, pois o endpoint não utiliza param uma vez que busca
    // direto o usuário logado.
    // Após a alteração feita no endpoint, o teste rodou corretamente :)

    @Test
    public void incluirTecnologia() throws IOException {

        String jsonBody = lerJson("src/test/resources/data/tecnologias.json");

        TecnologiasDTO resultService = tecnologiasService.adicionarTecnologia(jsonBody);

        // VALIDAÇÃO
        Assert.assertEquals(resultService.getNomeTecnologia(), "JavaScript");

    }

    //==================================================================================================================
    //                                                 GET
    //==================================================================================================================

    //todo

    //==================================================================================================================
    //                                                DELETE
    //==================================================================================================================

    //todo
}

