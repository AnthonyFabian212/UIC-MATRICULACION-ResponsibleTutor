package responsibleTutor.api_responsibleTutor.Estudiante;

import lombok.Data;

@Data
public class EstudianteDTO {
    private Long id;
    private String nombre;
    private String cedula;
    private String tipo;
}
