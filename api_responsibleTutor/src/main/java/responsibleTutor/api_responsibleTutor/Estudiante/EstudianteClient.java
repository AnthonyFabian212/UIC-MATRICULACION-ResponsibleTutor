package responsibleTutor.api_responsibleTutor.Estudiante;

    import java.util.List;
    import org.springframework.cloud.openfeign.FeignClient;
    import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

    @FeignClient(name = "bff.estudiante", url = "http://localhost:8000/api/estudiante")
    public interface EstudianteClient {

        @GetMapping("/{id}/")
        EstudianteDTO findById(@PathVariable("id") Long id);

        @GetMapping("/")
        List<EstudianteDTO> findAll();


    }
