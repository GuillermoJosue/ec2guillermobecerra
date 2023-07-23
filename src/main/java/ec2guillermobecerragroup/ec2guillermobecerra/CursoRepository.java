package ec2guillermobecerragroup.ec2guillermobecerra;

import org.springframework.data.repository.CrudRepository;
//Nuevos import
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;


//import ec2guillermobecerragroup.ec2guillermobecerra.Curso;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

//Se agrega esta anotación y un nuevo extends PagingAndSortingRepository. Y Dentro colocar un Lista
@RepositoryRestResource(collectionResourceRel = "cursos", path = "cursos")
public interface CursoRepository extends PagingAndSortingRepository<Curso, Integer>, CrudRepository<Curso, Integer> {

    //agregar una Lista de Cursos
    List<Curso> findByNombre(@Param("nombre") String nombre);

}