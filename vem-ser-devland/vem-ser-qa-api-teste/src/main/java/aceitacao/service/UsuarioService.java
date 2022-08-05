package aceitacao.service;

import aceitacao.dto.UsuarioDTO;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class UsuarioService {

    String tokenDev = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJkZXZsYW5kLWFwaSIsImp0aSI6MTcsInJvbGVzIjpbIlJPTEVfREVWIl0sImlhdCI6MTY1OTU2ODg2NywiZXhwIjoxNjU5NjU1MjY3fQ.r1qyx1D5CsSPznbye89Vnk96n72SY2n56YJpJPC1mW0";

    //==================================================================================================================
    //                                                 PUT
    //==================================================================================================================

    // PERMISSÃO TESTADA: ROLE_DEV
    // ENDPOINT: 8 de usuario-controller
    // CAMINHO: /usuario/editar-se
    // RESULTADO: fixme não rodou - revisar

    public UsuarioDTO editarUsuario(String jsonBody) {

        String Url = "https://devland-postgres.herokuapp.com/usuario/editar-se/";

        UsuarioDTO result = given()
                .header("Authorization", tokenDev)
                .contentType(ContentType.JSON)
                .log().all()
                .body(jsonBody)
                .when()
                .put(Url)
                .then()
                .log().all() //
                .statusCode(200)
                .extract().as(UsuarioDTO.class);

        return result;
    }

    //==================================================================================================================
    //                                                 POST
    //==================================================================================================================

    //==================================================================================================================
    //                                                 GET
    //==================================================================================================================
    public UsuarioDTO[] consultarUsuario() {

        String Url = "https://devland-postgres.herokuapp.com/usuario/listar-se/";

        UsuarioDTO[] result = given()
                .header("Authorization", tokenDev)
                .contentType(ContentType.JSON)
                .log().all()
                .when()
                .get(Url)
                .then()
                .log().all() //
                .statusCode(200)
                .extract().as(UsuarioDTO[].class);

        return result;
    }


    //==================================================================================================================
    //                                                 DELETE
    //==================================================================================================================

}



