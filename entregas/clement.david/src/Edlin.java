import java.util.Scanner;

public class Edlin {
    public static void main(String[] args) {
        String[] lineas = new String[10];
        for (int i = 0; i < 10; i++) {
            lineas[i] = "";
        }

        int lineaActiva = 0;
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            // Mostrar las líneas
            System.out.println("\nBienvenidos al editor EDLIN");
            for (int i = 0; i < 10; i++) {
                if (i == lineaActiva) {
                    System.out.println(i + ":*| " + lineas[i]);
                } else {
                    System.out.println(i + ": | " + lineas[i]);
                }
            }
            System.out.println("Comandos: [L]inea activa | [E]ditar | [I]ntercambiar | [B]orrar | [S]alir");
            System.out.print("Ingrese comando: ");
            String comando = sc.nextLine().trim().toUpperCase();

            switch (comando) {
                case "L":
                    System.out.print("Ingrese número de línea (0-9): ");
                    try {
                        int nuevaLinea = Integer.parseInt(sc.nextLine());
                        if (nuevaLinea >= 0 && nuevaLinea < 10) {
                            lineaActiva = nuevaLinea;
                        } else {
                            System.out.println("Línea fuera de rango.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida.");
                    }
                    break;
                case "E":
                    System.out.print("Nuevo texto para la línea " + lineaActiva + ": ");
                    lineas[lineaActiva] = sc.nextLine();
                    break;
                case "B":
                    lineas[lineaActiva] = "";
                    System.out.println("Línea " + lineaActiva + " borrada.");
                    break;
                case "I":
                    System.out.print("Ingrese número de línea para intercambiar con la actual (" + lineaActiva + "): ");
                    try {
                        int otraLinea = Integer.parseInt(sc.nextLine());
                        if (otraLinea >= 0 && otraLinea < 10 && otraLinea != lineaActiva) {
                            String temp = lineas[lineaActiva];
                            lineas[lineaActiva] = lineas[otraLinea];
                            lineas[otraLinea] = temp;
                            System.out.println("Líneas intercambiadas.");
                        } else {
                            System.out.println("Línea fuera de rango o igual a la activa.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida.");
                    }
                    break;
                case "S":
                    salir = true;
                    System.out.println("Saliendo del editor EDLIN.");
                    break;
                default:
                    System.out.println("Comando no reconocido.");
            }
        }
        sc.close();
    }
}