package aceitacao.service;

import aceitacao.dto.ContatoDTO;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class ContatoService {

    String tokenDev = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJkZXZsYW5kLWFwaSIsImp0aSI6MTcsInJvbGVzIjpbIlJPTEVfREVWIl0sImlhdCI6MTY1OTU2ODg2NywiZXhwIjoxNjU5NjU1MjY3fQ.r1qyx1D5CsSPznbye89Vnk96n72SY2n56YJpJPC1mW0";


    //==================================================================================================================
    //                                                 POST
    //==================================================================================================================

    // PERMISSÃO TESTADA: ROLE_DEV
    // ENDPOINT: 6 de contato-controller
    // CAMINHO: /contato/adicionar-se
    // RESULTADO DO TESTE: ok

    public ContatoDTO adicionarContato(String jsonBody) {

        String Url = "https://devland-postgres.herokuapp.com/contato/adicionar-se";

        ContatoDTO result = given()
                .header("Authorization", tokenDev)
                .contentType(ContentType.JSON)
                .log().all()
                .body(jsonBody)
                .when()
                .post(Url)
                .then()
                .log().all() //
                .statusCode(200)
                .extract().as(ContatoDTO.class);

        return result;
    }

    //==================================================================================================================
    //                                                 PUT
    //==================================================================================================================

    // PERMISSÃO TESTADA: ROLE_DEV
    // ENDPOINT: 7 de contato-controller
    // CAMINHO: /contato/editar-se
    // RESULTADO DO TESTE: ok

    public ContatoDTO editarContato(Integer idContato, String jsonBody) {

        String Url = "https://devland-postgres.herokuapp.com/contato/editar-se/" + idContato;

        ContatoDTO result = given()
                .header("Authorization", tokenDev)
                .contentType(ContentType.JSON)
                .log().all()
                .body(jsonBody)
                .when()
                .put(Url)
                .then()
                .log().all() //
                .statusCode(200)
                .extract().as(ContatoDTO.class);

        return result;
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
