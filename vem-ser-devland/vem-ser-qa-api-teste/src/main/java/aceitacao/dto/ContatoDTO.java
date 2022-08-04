package aceitacao.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class ContatoDTO {

    private String idUsuario;
    private String numero;
    private String descricao;
    private String tipo;
    private String idContato;

}

