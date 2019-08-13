
package ejemplosobreescritura;

/**
 *
 * @author john hernandez
 */
public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    @Override
     public String obtenerDetalles(){
         return "Nombre :" + nombre +
                 "sueldo :" + sueldo +
                 "Departamento :"+ departamento;
     }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
     
}
