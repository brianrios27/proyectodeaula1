package Proyecto_aula;
import java.util.Scanner;
import java.text.DecimalFormat;

//import javax.tools.Diagnostic;

public class Devengado {
    Scanner sc = new Scanner(System.in);
    Trabajador e=new Trabajador();
    private int sueldo;
    private int aux_transporte;
    private double horas_extras;
    private int comisiones;
    private double total_devengado;
    private double IBC;
    private double salud;
    private double fsp;
    private double pension;
    private double deducido_total;
    private double pago_neto;

    public Devengado(){
        this.sueldo=sueldo;
        this.aux_transporte=aux_transporte;
        this.horas_extras=horas_extras;
        this.total_devengado=total_devengado;
    }

    String patron = "#,###";
    DecimalFormat formato = new DecimalFormat(patron); 

    
    public void calcular_sueldo(int salario,int dias_trabajados){
        this.sueldo=(salario/30)*dias_trabajados;
    }
    public String mostrar_sueldo(){
        return "Su sueldo correspondiente a sus días de trabajo es de "+sueldo+" $";
    }


    //Horas extra.
    public void calcular_hextras(int salario,int hextra_diurna,int hextra_nocturna,int hextra_domdiurna,int hextra_domnocturna){
        int valor_hora=salario/240;
        double fhed=1.25;
        double fhen=1.75;
        double fhedd=2; 
        double fhedn=2.5;
        this.horas_extras=((valor_hora*1.25)*hextra_diurna)+((valor_hora*fhen)*hextra_nocturna)+
        ((valor_hora*fhedd)*hextra_domdiurna)+((valor_hora*fhedn)*hextra_domnocturna);
    }


    public String h_extras(){

        return "El valor de sus horas extras trabajadas es de "+formato.format(horas_extras)+" $";
        
    }
    //Aux.de transporte ,>hasta 2salarios minimos salarios vig.
    int SMLV=1000000;
    public void Aux_transporte(int salario){
        
        if(salario<(SMLV*2)){
            aux_transporte=117172;
            System.out.println("Su auxilio de transporte es de "+formato.format(aux_transporte)+" $");
        }else{
            System.out.println("Usted no tiene derecho a un auxilio de transporte");
            aux_transporte=0;
        }
    }

    public void devengado(){
        this.total_devengado=this.sueldo+this.aux_transporte+this.horas_extras;
    }
    public String devengadoTotal(){

        return "Este es el total devengado "+formato.format(total_devengado) +" $";
    }   

    //===========================================0
    //Deducidos. Ibc,salud,pension,fsp,deducionx
    

    public String ibc_(){
        IBC=total_devengado-aux_transporte;     
        return "Su ibc correspondiente es de "+formato.format(IBC) +" $";
    }

    //salud

    public String salud(){
        salud=(IBC*0.04);
        return "Su descuento a salud es de "+ formato.format(salud) +" $";

    }
    //pension
    public String pension(){
        pension=(IBC*0.04);
        return"Su descuento a pension es de "+ formato.format(pension) +" $";

    }
    //fondo de solidaridad pensional
    public void FSP(){
        if(IBC>=(SMLV*4) && IBC<=(SMLV*16)){
            fsp=IBC*0.01;
            System.out.println("Aporte a fondo de solidaridad "+fsp);

        }else if(IBC>(SMLV*16) && IBC<=(SMLV*17)){
            fsp=IBC*0.012;
            System.out.println("Aporte a fondo de solidaridad "+fsp);

        }else if(IBC>(SMLV*17) && IBC<=(SMLV*18)){
            fsp=IBC*0.014;
            System.out.println("Aporte a fondo de solidaridad "+fsp);

        }else if(IBC>(SMLV*18) && IBC<=(SMLV*19)){

            fsp=IBC*0.016;
            System.out.println("Aporte a fondo de solidaridad "+fsp);

        }else if(IBC>(SMLV*19) && IBC<=(SMLV*20)){
            fsp=IBC*0.018;
            System.out.println("Aporte a fondo de solidaridad "+fsp);
        
        }else if(IBC>(SMLV*20)){
            fsp=IBC*0.02;
            System.out.println("Aporte a fondo de solidaridad "+fsp);
        }else{
            fsp=0;
            System.out.println("No aporta al fondo de solidaridad "+ formato.format(fsp) +" $");
        }
    }
    //Deducido total
    public void calculodeducido(){
        deducido_total=salud+pension+fsp;
    }
    public String totalDeducido(){
        return"Su deducido total es "+ formato.format(deducido_total) +" $";
    }

    //Neto a pagar
    public String neto_pagar(){
        pago_neto=total_devengado-deducido_total;
        return "El sueldo neto del trabajador es "+ formato.format(pago_neto)+" $";
    }



}

