package aceitacao.service;

import aceitacao.dto.TecnologiasDTO;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class TecnologiasService {

    String tokenDev = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJkZXZsYW5kLWFwaSIsImp0aSI6MTcsInJvbGVzIjpbIlJPTEVfREVWIl0sImlhdCI6MTY1OTU2ODg2NywiZXhwIjoxNjU5NjU1MjY3fQ.r1qyx1D5CsSPznbye89Vnk96n72SY2n56YJpJPC1mW0";


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


    public TecnologiasDTO adicionarTecnologia(String jsonBody) {

        String baseUrl = "https://devland-postgres.herokuapp.com/tecnologia/";

        TecnologiasDTO result = given()
                .header("Authorization", tokenDev)
                .contentType(ContentType.JSON)
                .log().all()
                .body(jsonBody)
                .when()
                .post(baseUrl)
                .then()
                .log().all() //
                .statusCode(200)
                .extract().as(TecnologiasDTO.class);

        return result;
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
