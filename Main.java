public class Main {
    
    public static void main (String[] args) {

        Linea linea1 = new Linea ("Smarthphone","Samsung", 1433768971, "AT&T", "Prepago", 10, 5); 
        Linea linea2 = new Linea ("Fijo","Siemens", 545454545, "Telmex", "Plan de renta", 50, 0); 
        
        System.out.println("Informacion de linea 1");
        System.out.println(linea1.toString()+"\n");
        System.out.println("Informacion de linea 2");
        System.out.println(linea1.toString()+"\n");

        System.out.println();

        System.out.println("Acciones linea 1");
        linea1.realizar_Llamada(" 555-1234567\n");
        System.out.println("Mensajes");
        linea1.recibir_mensaje(" 555-1234566 ", "Hola buen dia");
        linea1.enviar_mensaje("555-9988776 ", " Prueba de mensaje");

        System.out.println("\nAcciones Linea 2");
        linea2.realizar_Llamada("555-9876543\n");
        linea2.recibir_Llamada("555-0987654\n");

        






        
    }
}
