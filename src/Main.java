import com.alura.reto.models.Conversiones;
import com.alura.reto.models.ConversorMoneda;
import com.alura.reto.models.Moneda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConversorMoneda conversor = new ConversorMoneda();
        List<Conversiones> historial = new ArrayList<>();

        while (true){
            System.out.println("""
                    *************************************************
                    Bienvenido al conversor de moneda de alura :)
                    
                    Seleccione la opcion de la conversion que desea realizar
                    
                    1) Dólar --> Peso Colombiano
                    2) Peso Colombiano --> Dólar
                    3) Dólar --> Peso Argentino
                    4) Peso Argentino --> Dólar
                    5) Dólar --> Real Brasileño
                    6) Real Brasileño --> Dólar
                    7) Mostrar historial de conversiones
                    8) Salir
                    
                    Seleccione la opcion valida:
                    
                    *************************************************
                    """);

            int opcion = teclado.nextInt();

            String base = "";
            String destino = "";

            switch (opcion){
                case 1 -> {
                    base = "USD";
                    destino = "COP";
                }
                case 2 -> {
                    base = "COP";
                    destino = "USD";
                }
                case 3 -> {
                    base = "USD";
                    destino = "ARS";
                }
                case 4 -> {
                    base = "ARS";
                    destino = "USD";
                }
                case 5 -> {
                    base = "USD";
                    destino = "BRL";
                }
                case 6 -> {
                    base = "BRL";
                    destino = "USD";
                }
                case 7 ->{
                    if (historial.isEmpty()){
                        System.out.println("No se han realizado conversiones de moneda");
                        continue;
                    }
                    System.out.println("\n***********Historial de conversiones***********");
                    for (Conversiones c : historial) {
                        System.out.printf(
                                "%.2f %s → %.2f %s | Fecha: %s%n",
                                c.cantidad(),
                                c.base(),
                                c.resultado(),
                                c.destino(),
                                c.fecha()
                        );
                    }
                    continue;
                }
                case 8 ->{
                    System.out.println("Gracias por usar nuestro conversor de moneda alura");
                    return;
                }
                default -> {
                    System.out.println("Opcion incorrecta, por favor ingrese una opcion valida");
                    continue;
                }
            }

            System.out.println("Ingrese la cantidad que desea convertir");

            double cantidad = teclado.nextDouble();

            Moneda moneda = conversor.obtenerTasa(base,destino);

            double resultado = conversor.conversion(cantidad, moneda.conversion_rate());

            Conversiones conversionHistorial = new Conversiones(
                    base,
                    destino,
                    cantidad,
                    resultado,
                    LocalDateTime.now());

            historial.add(conversionHistorial);

            System.out.printf(
                    "%.2f %s equivalen a %.2f %s%n",
                    cantidad, base, resultado, destino
            );
        }
    }
}
