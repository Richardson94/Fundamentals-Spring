package mx.com.gm.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

import java.io.Serializable;

@Entity
@Data
@Table(name="rol")
public class Rol implements Serializable {
    private static final long servialVersionUID = 1L;

    @Id
    @Generated(strategy=GenerationType.IDENTITY)
    private Long idRol;

    @NotEmpty
    private String name;
}
