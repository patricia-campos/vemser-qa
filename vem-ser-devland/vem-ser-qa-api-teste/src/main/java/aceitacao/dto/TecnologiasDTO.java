package aceitacao.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class TecnologiasDTO {

    private String nomeTecnologia;
    private String idTecnologias;

}
