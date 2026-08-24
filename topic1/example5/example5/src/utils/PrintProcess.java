package utils;

public class PrintProcess {
    public static void welcome() {
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║                                                    ║");
        System.out.println("║  ███████╗███╗   ███╗██████╗ ██╗      ██████╗ ██╗   ██╗███████╗███████╗");
        System.out.println("║  ██╔════╝████╗ ████║██╔══██╗██║     ██╔═══██╗╚██╗ ██╔╝██╔════╝██╔════╝");
        System.out.println("║  █████╗  ██╔████╔██║██████╔╝██║     ██║   ██║ ╚████╔╝ █████╗  █████╗  ");
        System.out.println("║  ██╔══╝  ██║╚██╔╝██║██╔═══╝ ██║     ██║   ██║  ╚██╔╝  ██╔══╝  ██╔══╝  ");
        System.out.println("║  ███████╗██║ ╚═╝ ██║██║     ███████╗╚██████╔╝   ██║   ███████╗███████╗");
        System.out.println("║  ╚══════╝╚═╝     ╚═╝╚═╝     ╚══════╝ ╚═════╝    ╚═╝   ╚══════╝╚══════╝");
        System.out.println("║                                                    ║");
        System.out.println("║           MANAGEMENT SYSTEM - v1.0                ║");
        System.out.println("║                                                    ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
        System.out.println();
        System.out.println("*********************************************");
        System.out.println("*   Bienvenido a Employee Management System   *");
        System.out.println("*********************************************");
        System.out.println();
    }

    public static void register() {
        System.out.println("** Registrar empleados ** ");
        System.out.println("** Registre los Datos en este orden ** ");
        System.out.println("** Nombre ** ");
        System.out.println("** Apellidos ** ");
        System.out.println("** Ci ** ");
        System.out.println("** Edad ** ");
    }

    public static void remove() {
        System.out.println("** Para borrar un empleado, debe escriba el ci  ** ");
        System.out.println("** del empleado que quiere borrar ** ");
    }

    public static void list() {
        System.out.println("** Lista de empleados  ** ");
    }

    public static void search() {
        System.out.println("** Para buscar un empleado, debe escriba el ci  ** ");
        System.out.println("** del empleado que quiere buscar ** ");
    }

    public static void notFound() {
        System.out.println("** Empleado no encontrado  ** ");
    }

    public static void printOptions() {
        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║      GESTIÓN DE EMPLEADOS         ║");
        System.out.println("╠═══════════════════════════════════╣");
        System.out.println("║  1.-) Registrar empleado          ║");
        System.out.println("║  2.-) Borrar empleado             ║");
        System.out.println("║  3.-) Listar empleados            ║");
        System.out.println("║  4.-) Buscar empleado             ║");
        System.out.println("║  5.-) Salir                       ║");
        System.out.println("╚═══════════════════════════════════╝");
        System.out.print("Seleccione una opción: ");
    }
}
