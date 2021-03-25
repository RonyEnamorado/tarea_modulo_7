/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_.modulo_7;


public class procesos_calculadora {

  private double Valor_1;
    private double Valor_2;
    private String Operacion;
    private double Resultado;
    public double getValor_1() {
        return Valor_1;
    }

   
    public void setValor_1(double Valor_1) {
        this.Valor_1 = Valor_1;
    }

   
    public double getValor_2() {
        return Valor_2;
    }

   
    public void setValor_2(double Valor_2) {
        this.Valor_2 = Valor_2;
    }

   
    public String getOperacion() {
        return Operacion;
    }

   
    public void setOperacion(String Operacion) {
        this.Operacion = Operacion;
    }

 
    public double getResultado() {
        return Resultado;
    }

 
    public void setResultado(double Resultado) {
        this.Resultado = Resultado;
    }
  
    
    public String Resultado_operacion(){
        String resultado = null;
        String operacion=getOperacion();
        double Calculo;
        double valor_1= getValor_1();
        double valor_2= getValor_2();
        
        switch (operacion){
              
            case "suma":
                    Calculo=valor_1+valor_2;
                    resultado=" "+valor_1+" + " +valor_2+" = "+Calculo;
            break;
             case "resta":
                    Calculo=valor_1-valor_2;
                    resultado=" "+valor_1+" - " +valor_2+" = "+Calculo;
            break;
            case "multiplicacion":
                    Calculo=valor_1*valor_2;
                    resultado=" "+valor_1+" * " +valor_2+" = "+Calculo;
            break;
           
            case "divicion":
                    Calculo=valor_1/valor_2;
                    resultado=" "+valor_1+" / " +valor_2+" = "+Calculo;
            break;
            
            default:
            resultado = "Ingrese la operacion";
                          }
        
    
    return resultado;
    }
    
}
