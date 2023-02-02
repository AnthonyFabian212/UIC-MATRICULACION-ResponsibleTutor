package responsibleTutor.api_responsibleTutor.responsibleTutor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/responsibletutor")
@CrossOrigin({"*"})
public class ResponsibleTutorController {
    
    @Autowired ResponsibleTutorService responsibleTutorService;

    @GetMapping("/")
    public List<ResponsibleTutor> findAll(){
        return responsibleTutorService.findAll();
    }

    @GetMapping("/{id}/")
    public ResponsibleTutor findById(@PathVariable Long id){
        return responsibleTutorService.findById(id);
    }

    @PostMapping("/")
    public ResponsibleTutor save(@RequestBody ResponsibleTutor entity){
        return responsibleTutorService.save(entity);
    }

    @PutMapping("/{id}/")
    public ResponsibleTutor update(@RequestBody ResponsibleTutor entity){
        return responsibleTutorService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        responsibleTutorService.deleteById(id);
    }

}
