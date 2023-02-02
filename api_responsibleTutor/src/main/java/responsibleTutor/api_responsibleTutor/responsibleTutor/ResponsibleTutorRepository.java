package responsibleTutor.api_responsibleTutor.responsibleTutor;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ResponsibleTutorRepository extends CrudRepository<ResponsibleTutor, Long>{
    
    List<ResponsibleTutor> findAll();

}
