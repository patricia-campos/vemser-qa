package aceitacao.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class UserLoginDTO {

    private String nome;
    private String email;
    private String areaAtuacao;
    private String cpfCnpj;
    private String foto;
    private String genero;
    private String tipoUsuario;
}
