
public class Persona {
  
  public String nombre;

  public String apellidos;
  
  public int edad;
  
  public Persona(String nombre,String apellidos,int edad) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
  }
  
  public int Cumpleaños() {
    edad += 1;
    return edad;
  }
  
  public String DatosPersona() {
    String datos = "Nombre: " + nombre + ", Apellidos: " + apellidos + ", Edad: " + edad;
    return datos;
  }

}
