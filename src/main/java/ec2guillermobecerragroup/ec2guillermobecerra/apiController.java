package ec2guillermobecerragroup.ec2guillermobecerra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.String;


@Controller
@RequestMapping(path="/api/curso") 
public class apiController {
  @Autowired
  private CursoRepository cursoRepository;


  @PostMapping(path="/nuevo")
  public @ResponseBody String addNewCurso (@RequestParam String nombre
      , @RequestParam int creditos) {


    Curso n = new Curso();
    n.setNombre(nombre);
    n.setCreditos(creditos);
    cursoRepository.save(n);
    return "Saved";
  }

  @GetMapping(path="/listar") 
  public @ResponseBody Iterable<Curso> getAllCursos() {
    return cursoRepository.findAll();
  }


  @DeleteMapping(path="/eliminar")
  public @ResponseBody String deleteCurso(@RequestParam Integer id) {
    Curso n = new Curso();
    n.setId(id);
    cursoRepository.delete(n);
    return "Deleted";
  }


  
}