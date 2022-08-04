package aceitacao.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class EnderecoDTO {

    private String tipo;
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;
    private String idEndereco;

}


//json - a entrada dos dados - campo em branco
//dto - o retorno - response entity