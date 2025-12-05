package cl.duoc.ms_products_db.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UsuarioDTO {

    @JsonProperty(value = "usuario_id")
    private Long idUsuario;

    @JsonProperty(value = "usuario_nombre")
    private String nombreUsuario;

    @JsonProperty(value = "usuario_correo")
    private String correo;

    @JsonProperty(value = "usuario_password")
    private String password;
}