package es.ifp.programación.uf1.reto;

import java.util.Scanner;

public class Programa_Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mes;
        int dia = 0;
        boolean diaBien = true; // Variable para verificar si el día es válido
        String salidaMeses = null;
        String[] nombreMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        // Pedimos el mes que desea trabajar
        System.out.print("Introduzca el número del mes que desea trabajar: ");//salida consola
        mes = Integer.parseInt(sc.nextLine());// Parseamos ya que nos devuelve un string y necesitamos un entero.

        // Validamos que los meses entroducidos no son menor que 1 ni mayores 12
        if (mes < 1 || mes > 12) {
            diaBien = true; // Marcar el día como no válido
        } else {
            salidaMeses = nombreMeses[mes - 1];

            System.out.print("Introduzca el día del mes que desea trabajar: ");
            dia = Integer.parseInt(sc.nextLine());
        }

        switch (mes) {
            case 1:
                if (dia >= 1 && dia <= 31) { 
                    System.out.println("Se ha introducido el dia " + dia + " de " + salidaMeses);
                }
                break;

            case 2:
                diaBien = (dia >= 1 && dia <= 28);
                System.out.println("Se ha introducido el dia " + dia + " de " + salidaMeses);
                break;

            case 3:
                diaBien = (dia >= 1 && dia <= 31);
                System.out.println("Se ha introducido el dia " + dia + " de " + salidaMeses);
                break;

            case 4:
                diaBien = (dia >= 1 && dia <= 30);
                System.out.println("Se ha introducido el dia " + dia + " de " + salidaMeses);
                break;

            case 5:
                diaBien = (dia >= 1 && dia <= 31);
                System.out.println("Se ha introducido el dia " + dia + " de " + salidaMeses);
                break;

            case 6:
                diaBien = (dia >= 1 && dia <= 30);
                System.out.println("Se ha introducido el dia " + dia + " de " + salidaMeses);
                break;

            case 7:
                diaBien = (dia >= 1 && dia <= 31);
                System.out.println("Se ha introducido el dia " + dia + " de " + salidaMeses);
                break;

            case 8:
                diaBien = (dia >= 1 && dia <= 31);
                System.out.println("Se ha introducido el dia " + dia + " de " + salidaMeses);
                break;

            case 9:
                diaBien = (dia >= 1 && dia <= 30);
                System.out.println("Se ha introducido el dia " + dia + " de " + salidaMeses);
                break;

            case 10:
                diaBien = (dia >= 1 && dia <= 31);
                System.out.println("Se ha introducido el dia " + dia + " de " + salidaMeses);
                break;

            case 11:
                diaBien = (dia >= 1 && dia <= 30);
                System.out.println("Se ha introducido el dia " + dia + " de " + salidaMeses);
                break;

            case 12:
                diaBien = (dia >= 1 && dia <= 31);
                System.out.println("Se ha introducido el dia " + dia + " de " + salidaMeses);
                break;
        }

        // Mostrar el mensaje de acuerdo a la validez del día
        if (!diaBien) {
            System.out.println("La fecha introducida es incorrecta.");
        }
    }
}
