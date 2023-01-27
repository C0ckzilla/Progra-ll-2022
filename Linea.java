package Adicional;

public class Linea extends Telefono{

    int num;
    String operador;
    String contrato;
    int llamadas;
    int mensajes;
    

    Linea(String tipo, String marca, int num, String operador, String contrato, int llamadas, int mensajes ) {
        super(tipo, marca);

        this.num = num;
        this.operador = operador;
        this.contrato = contrato;
        this.llamadas = llamadas;
        this.mensajes = mensajes;
        

    }
 
    public String toString() {

        return this.tipo + "\n" + this.marca + "\n" + this.num + "\n" + this.contrato + "\n" + this.operador + "\n" + this.llamadas + "\n" + this.mensajes;
    }
    void realizar_Llamada(String destinatario) {
       
        System.out.println("Realizando llamada a:" + destinatario);

    }
    void recibir_Llamada(String string) {
        System.out.println("Llamada entrante de " + string);

    }
    void enviar_mensaje(String destinatario, String mensaje) {
        System.out.println(mensaje + destinatario);

    }

    void recibir_mensaje(String origen, String mensaje) {
        System.out.println(origen + " Dice " + mensaje);

    }

    void historial_mensajes (String mensaje) {
         System.out.println(mensaje);
    }
    
}
   
   

    


   

