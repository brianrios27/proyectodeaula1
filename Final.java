package Proyecto_aula;
import java.util.Scanner;

public class Final {

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Devengado calculo=new Devengado();
    Trabajador e;
    String nombre;
    long identificacion;
    int salario;
    int dias_trabajados;
    boolean salir= false;
    int f;
    while(!salir){


    System.out.println("Escriba el nombre del trabajador ");
    nombre=sc.nextLine();
    System.out.println("Escriba la identificación de "+nombre);
    identificacion=sc.nextInt();
    System.out.println("Escriba los dias trabajados ");
    dias_trabajados=sc.nextInt();
    System.out.println("Escriba el salario del trabajador");
    salario=sc.nextInt();
    //Recoleccion de datos.

    // Horas extras. ====================================================================
    
    System.out.println("Tuvo alguna hora extra diurna? de otro modo marque 'no'");
    String variable =sc.next();
    int hextra_diurna, hextra_nocturna, hextra_domdiurna, hextra_domnocturna;
   
    if (variable.trim().equalsIgnoreCase("no")){
        hextra_diurna=0;
        //System.out.println("Para el caso no trabajo hora extra");
    }else{
        hextra_diurna=Integer.parseInt(variable);
        
    }

    System.out.println("Tuvo alguna hora extra nocturna? de otro modo marque 'no'");
    variable =sc.next()+"\n";
    if (variable.trim().equalsIgnoreCase("no")){
        hextra_nocturna=0;
    } else{
            hextra_nocturna=Integer.parseInt(variable);
            System.out.println("hora nocturna "+hextra_nocturna);
    }
    
    System.out.println("Tuvo alguna hora extra dominical diurna? de otro modo marque 'no'" );

    variable =sc.next()+"\n";
    if (variable.trim().equalsIgnoreCase("no")){
        hextra_domdiurna=0;
    }else{
        hextra_domdiurna=Integer.parseInt(variable);
    }

    System.out.println("Tuvo alguna hora extra dominical nocturna? de otro modo marque 'no'");
    variable =sc.next()+"\n";
    if (variable.trim().equalsIgnoreCase("no")){
        hextra_domnocturna=0;
    }else{
        hextra_domnocturna=Integer.parseInt(variable);
    }

    System.out.println("=================================================================");
    
    calculo.calcular_sueldo(salario,dias_trabajados);
    e=new Trabajador();
    e.setdias_trabajados(dias_trabajados);
    System.out.println(calculo.mostrar_sueldo());
    
    //Horas extras
    calculo.calcular_hextras(salario,hextra_diurna, hextra_nocturna, hextra_domdiurna, hextra_domnocturna);
    System.out.println(""+calculo.h_extras());
   
    //===============================================================================================
    //AuxTransporte

    calculo.Aux_transporte(salario);

    //=================================================================================================
    //DEvengado total:
    calculo.devengado();
    System.out.println(calculo.devengadoTotal());

    System.out.println("============================== Descuentos ======================================");
    //IBC
   System.out.println(calculo.ibc_());

   //salud y //pension

   System.out.println(calculo.salud());
   System.out.println(calculo.pension());
   
   //fsp
   calculo.FSP();

   System.out.println("============================== Totales ======================================");
    //Deducido
    calculo.calculodeducido();
    System.out.println(calculo.totalDeducido());

   //Neto a pagar.
    System.out.println(calculo.neto_pagar());

    //Falta redactar mejor los resultados.
   
   
   
   
   
    System.out.println("Ingrese 1 si desea salir, 2 si desea continuar liquidando a otro empleado.");
    f=sc.nextInt();
    if(f==1){
        salir=true;
    }else{
        salir=false;
    }





    }
    }
}
