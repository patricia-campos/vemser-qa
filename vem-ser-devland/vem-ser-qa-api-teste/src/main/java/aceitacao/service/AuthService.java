package aceitacao.service;

import aceitacao.dto.UsuarioDTO;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class AuthService {




    //==================================================================================================================
    //                                                 POST
    //==================================================================================================================

    // PERMISSÃO TESTADA: ROLE_DEV
    // ENDPOINT: 3 de auth-controller
    // CAMINHO: /auth/cadstro
    // RESULTADO DO TESTE: ok

    public static UsuarioDTO cadastrarUsuario(String jsonBody) {

        String baseUrl = "https://devland-postgres.herokuapp.com/auth/cadastro";

        UsuarioDTO result = given() //given - dado
                .contentType(ContentType.JSON)
                .log().all()
                .body(jsonBody)
                .when() //when - quando
                .post(baseUrl)
                .then() //then -então
                .log().all()
                .statusCode(200) //statusCode - resultado
                .extract().as(UsuarioDTO.class);

        return result;
    }

    //==================================================================================================================

    // PERMISSÃO TESTADA: ROLE_EMPRESA
    // ENDPOINT: 3 de auth-controller
    // CAMINHO: /auth/cadstro
    // RESULTADO DO TESTE: ok

    public static UsuarioDTO cadastrarUsuarioEmpresa(String jsonBody) {

        String baseUrl = "https://devland-postgres.herokuapp.com/auth/cadastro";

        UsuarioDTO result = given() //given - dado
                .contentType(ContentType.JSON)
                .log().all()
                .body(jsonBody)
                .when() //when - quando
                .post(baseUrl)
                .then() //then -então
                .log().all()
                .statusCode(200) //statusCode - resultado
                .extract().as(UsuarioDTO.class);

        return result;
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
