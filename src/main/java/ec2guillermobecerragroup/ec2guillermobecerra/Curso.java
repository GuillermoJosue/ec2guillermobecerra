package ec2guillermobecerragroup.ec2guillermobecerra;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//import añadidos
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;

@Entity
@Table(name = "curso")
public class Curso {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String nombre;

  private int creditos;

  //vinculando carrera

  @ManyToOne(cascade=CascadeType.ALL)
  @JoinColumn(name = "id_carrera")
  private Carrera carrera;

  public Carrera getCarrera() {
      return carrera;
  }

  public void setCarrera(Carrera carrera) {
      this.carrera = carrera;
  }

  //fin de vinculacion



  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCreditos() {
    return creditos;
  }

  public void setCreditos(int creditos) {
    this.creditos = creditos;
  }
}