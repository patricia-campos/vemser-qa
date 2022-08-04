package aceitacao.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class AuthPayloadDTO {


    private String login;
    private String senha;
    private UserLoginDTO usuarioCreateDTO;
}
