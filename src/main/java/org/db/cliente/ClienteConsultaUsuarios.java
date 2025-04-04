package org.db.cliente;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.db.configuracao.ConfiguracaoAmbienteTestes.configurarRequisicao;

public class ClienteConsultaUsuarios {

    public static Response consultarUsuarios() {
        return configurarRequisicao()
                .get("/users");
    }
}
