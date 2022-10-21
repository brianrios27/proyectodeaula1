package Proyecto_aula;

public class Trabajador {
    private String nombre;
    private int identificacion;
    private int salario;
    private int dias_trabajados;


    public Trabajador(){
    this.nombre=nombre;
    this.identificacion=identificacion;
    this.salario=salario;
    this.dias_trabajados=dias_trabajados;

    }

    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }

    public void setidentificacion(int identificacion){
        this.identificacion=identificacion;
    }
    public int getidentificacion(){
        return identificacion;
    }

    
    public void setsalario(int salario){
        this.salario=salario;
    }
    public int getsalario(){
        return salario;
    }

    public void setdias_trabajados(int dias_trabajados){
        this.dias_trabajados=dias_trabajados;
    }
    public int getdias_trabajados(){
        return dias_trabajados;
    }




}
