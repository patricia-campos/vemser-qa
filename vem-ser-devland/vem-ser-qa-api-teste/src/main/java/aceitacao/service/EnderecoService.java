package aceitacao.service;

import aceitacao.dto.EnderecoDTO;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class EnderecoService {

    String tokenDev = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJkZXZsYW5kLWFwaSIsImp0aSI6MTcsInJvbGVzIjpbIlJPTEVfREVWIl0sImlhdCI6MTY1OTU2ODg2NywiZXhwIjoxNjU5NjU1MjY3fQ.r1qyx1D5CsSPznbye89Vnk96n72SY2n56YJpJPC1mW0";


    //==================================================================================================================
    //                                                 POST
    //==================================================================================================================

    // PERMISSÃO TESTADA: ROLE_DEV
    // ENDPOINT: 8 de endereco-controller
    // CAMINHO: /endereco/adicionar-meu-endereco
    // RESULTADO DO TESTE: ok


    public EnderecoDTO adicionarEndereco(String jsonBody) {

        String baseUrl = "https://devland-postgres.herokuapp.com/endereco/adicionar-meu-endereco";

        EnderecoDTO result = given()
                .header("Authorization", tokenDev)
                .contentType(ContentType.JSON)
                .log().all()
                .body(jsonBody)
                .when()
                .post(baseUrl)
                .then()
                .log().all() //
                .statusCode(200)
                .extract().as(EnderecoDTO.class);

        return result;
    }

    //==================================================================================================================
    //                                                 PUT
    //==================================================================================================================

    // PERMISSÃO TESTADA: ROLE_DEV
    // ENDPOINT: 9 de endereco-controller
    // CAMINHO: /endereco/editar-se
    // RESULTADO DO TESTE: ok

    public EnderecoDTO editarEndereco(Integer idEndereco, String jsonBody) {

        String baseUrl = "https://devland-postgres.herokuapp.com/endereco/editar-se/" + idEndereco;

        EnderecoDTO result = given()
                .header("Authorization",tokenDev)
                .contentType(ContentType.JSON)
                .log().all()
                .body(jsonBody)
                .when()
                .put(baseUrl)
                .then()
                .log().all() //
                .statusCode(200)
                .extract().as(EnderecoDTO.class);

        return result;
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
