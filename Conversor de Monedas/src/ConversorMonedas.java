import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        boolean continuar = true;

        System.out.println("Bienvenidos, Al Challenge Conversor de Monedas!");

    while(continuar)
    {


        System.out.println("1. PESOS MEXICANOS A DOLARES");
        System.out.println("2. DOLARES A PESOS MEXICANOS");
        System.out.println("3. PESOS COLOMBIANOS A DOLARES");
        System.out.println("4. DOLARES A PESOS COLOMBIANOS");
        System.out.println("5. SOLES PERUANOS A DOLARES");
        System.out.println("6. DOLARES A SOLES PERUANOS");
        System.out.println("7. SALIR");
        System.out.print("SELECCIONE UNA OPCION:  ");

        int opcion = scanner.nextInt();

        if (opcion == 7)
        {
            continuar = false;
            System.out.println("GRACIAS, POR USAR MI CONVERSOR. HASTA LUEGO!");
            continue;
        }

        if (opcion < 1 || opcion > 6)
        {
            System.out.println("OPCION NO VALIDA. POR FAVOR INTENTE DE NUEVO.");
            continue;
        }

        System.out.println("INGRESE LA CANTIDAD A CONVERTIR:  ");
        double cantidad = scanner.nextDouble();

        double resultado = 0;
        String monedaOrigen = "";
        String monedaDestino = "";

        switch (opcion)
        {
            case 1:
                resultado = cantidad * 0.058;

                monedaOrigen = "PESOS MEXICANOS";
                monedaDestino = "DOLARES";
                break;
            case 2:
                resultado = cantidad * 17.24;

                monedaOrigen = "DOLARES";
                monedaDestino = "PESOS MEXICANOS";
                break;
            case 3:
                resultado = cantidad * 0.00026;

                monedaOrigen = "PESOS COLOMBIANOS";
                monedaDestino = "DOLARES";
                break;
            case 4:
                resultado = cantidad * 3847.50;

                monedaOrigen = "DOLARES";
                monedaDestino = "PESOS COLOMBIANOS";
                break;
            case 5:
                resultado = cantidad * 0.27;

                monedaOrigen = "SOLES PERUANOS";
                monedaDestino = "DOLARES";
                break;
            case 6:
                resultado = cantidad * 3.70;

                monedaOrigen = "DOLARES";
                monedaDestino = "SOLES PERUANOS";
                break;
        }

        System.out.println("\n" + cantidad + " " + monedaOrigen + " EQUIVALEN A "
        + df.format(resultado) + " " + monedaDestino + "\n");
    }

    scanner.close();
    }
}