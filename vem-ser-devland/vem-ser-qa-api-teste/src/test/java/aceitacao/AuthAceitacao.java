package aceitacao;

import aceitacao.dto.UsuarioDTO;
import aceitacao.service.AuthService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AuthAceitacao {

    AuthService authService = new AuthService();

    // MASSA DE DADOS PARA O SERVICE
    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    }


    //==================================================================================================================
    //                                                 POST
    //==================================================================================================================

    // PERMISSÃO TESTADA: ROLE_DEV
    // ENDPOINT: 3 de auth-controller
    // CAMINHO: /auth/cadstro
    // RESULTADO DO TESTE: ok

    @Test
    public void cadastrarUsuario() throws IOException {

        String jsonBody = lerJson("src/test/resources/data/auth.json");

        UsuarioDTO resultService = authService.cadastrarUsuario(jsonBody);

        // VALIDAÇÃO
        Assert.assertEquals(resultService.getNome(), "Selena");
        Assert.assertEquals(resultService.getEmail(), "comolaflor@gmail.com");
        Assert.assertEquals(resultService.getAreaAtuacao(), "Java");
        Assert.assertEquals(resultService.getCpfCnpj(), "02510742000");
        Assert.assertEquals(resultService.getFoto(), "https://i.imgur.com/3zry15Q.jpg");
        Assert.assertEquals(resultService.getGenero(), "FEMININO");
        Assert.assertEquals(resultService.getTipoUsuario(), "DEV");
    }

    //==================================================================================================================

    // PERMISSÃO TESTADA: ROLE_EMPRESA
    // ENDPOINT: 3 de auth-controller
    // CAMINHO: /auth/cadstro
    // RESULTADO DO TESTE: ok

    @Test
    public void cadastrarUsuarioEmpresa() throws IOException {

        String jsonBody = lerJson("src/test/resources/data/authEmpresa.json");

        UsuarioDTO resultService = authService.cadastrarUsuario(jsonBody);

        // VALIDAÇÃO
        Assert.assertEquals(resultService.getTipoUsuario(), "EMPRESA");
    }

    //==================================================================================================================
    //                                                 GET
    //==================================================================================================================


    //==================================================================================================================
    //                                                 PUT
    //==================================================================================================================


    //==================================================================================================================
    //                                                DELETE
    //==================================================================================================================

}
