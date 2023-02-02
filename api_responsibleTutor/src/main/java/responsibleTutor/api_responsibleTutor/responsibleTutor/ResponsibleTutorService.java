package responsibleTutor.api_responsibleTutor.responsibleTutor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ResponsibleTutorService {
    @Autowired ResponsibleTutorRepository responsibleTutorRepository;

    public ResponsibleTutor save(ResponsibleTutor entity){
        return responsibleTutorRepository.save(entity);
    }

    public ResponsibleTutor findById( Long id){
        return responsibleTutorRepository.findById(id).orElse(new ResponsibleTutor());
    }

    public void deleteById(Long id){
        responsibleTutorRepository.deleteById(id);
    }

    public List<ResponsibleTutor> findAll(){
        return responsibleTutorRepository.findAll();
    }

    

}
