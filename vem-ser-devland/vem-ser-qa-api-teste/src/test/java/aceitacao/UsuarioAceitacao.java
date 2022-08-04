package aceitacao;

import aceitacao.dto.UsuarioDTO;
import aceitacao.service.AuthService;
import aceitacao.service.UsuarioService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UsuarioAceitacao {


    UsuarioService usuarioService = new UsuarioService();


    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    }


    //==================================================================================================================
    //                                                 PUT
    //==================================================================================================================

    // Teste feito som a permissão ROLE_DEV
    // Enpoint 8 de usuario-controller  -  /usuario/editar-se
    // RESULTADO: fixme não rodou - revisar


    @Test
    public void editarUsuario() throws IOException {

        // Iniciando o ciclo adicionando um usuario
        AuthService.cadastrarUsuario("src/test/resources/data/usuario.json");


        // Inserindo o parâmetro necessário para editar
        Integer idContato = 10;

        // Leitura da massa de dados
        String jsonBody = lerJson("src/test/resources/data/usuarioEditado.json");


        UsuarioDTO resultService = usuarioService.editarUsuario(jsonBody);

        // VALIDAÇÃO
        Assert.assertEquals(resultService.getEmail(), "quintanilla@gmail.com");

        //deletar
        //permissão está com problema
    }

    //==================================================================================================================
    //                                                 POST
    //==================================================================================================================

    //==================================================================================================================
    //                                                 GET
    //==================================================================================================================
    @Test
    public void consultarUsuário() throws IOException {

        // Iniciando o ciclo adicionando um user
        //incluirUser();

        UsuarioDTO[] resultService = usuarioService.consultarUsuario();

        // VALIDAÇÃO
        Assert.assertEquals(resultService[0].getNome(), "Selena");


        // Finalizando o ciclo excluindo o user adicionado
        //permissão está com problema
    }
    //==================================================================================================================
    //                                                 DELETE
    //==================================================================================================================


}
