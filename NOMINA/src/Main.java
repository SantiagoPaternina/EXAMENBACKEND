import MODELOS.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main
{
    public Main() {
    }

    public static void main(String[] args)
    {
        System.out.println("\n BIENVENIDO !!!");

        Scanner lea = new Scanner(System.in);
        Sucursal sucursal = new Sucursal();

        System.out.println("Nombre de la sucursal: ");
        sucursal.setNombre(lea.nextLine());
        System.out.println("Direccion de la sucursal: ");
        sucursal.setDireccion(lea.nextLine());
        System.out.println("Ciudad de la sucursal: ");
        sucursal.setCiudad(lea.nextLine());
        System.out.println("Codigo postal de la sucursal: ");
        sucursal.setCodigoPostal(lea.nextLine());
        System.out.println("Pais de la sucursal: ");
        sucursal.setPais(lea.nextLine());
        System.out.println("Telefono de atencion: ");
        sucursal.setTelefono(lea.nextLine());
        System.out.println("Correo de la sucursal: ");
        sucursal.setCorreo(lea.nextLine());
        System.out.println("Horas de atencion de la sucursal: ");
        sucursal.setHorasAtencion(lea.nextLine());
        System.out.println("Numero de empleados operando: ");
        sucursal.setNumeroEmpleados(lea.nextLine());

        Sucursal sucursal1 = new Sucursal(32203020L, "OnlyPan", "calle 2b #81a", "Medellin", "11-25", "Colombia", "210021002", "santi@gmail.com", "11 AM - 8 PM", "18");

        Beneficiario beneficiario = new Beneficiario();

        System.out.println("Nombre beneficiario: ");
        beneficiario.setNombre(lea.nextLine());
        System.out.println("Apellido beneficiario: ");
        beneficiario.setApellidos(lea.nextLine());
        System.out.println("Seguro de vida: ");
        beneficiario.setSeguro(lea.nextLine());
        System.out.println("Direccion del beneficiario: ");
        beneficiario.setDireccion(lea.nextLine());
        System.out.println("Correo del beneficiario: ");
        beneficiario.setCorreo(lea.nextLine());
        System.out.println("Telefono del beneciario: ");
        beneficiario.setTelefono(lea.nextLine());
        System.out.println("Tipo de beneficio: ");
        beneficiario.setTipoBeneficio(lea.nextLine());
        System.out.println("Valor del beneficio: ");
        beneficiario.setValorBeneficio(lea.nextLine());
        System.out.println("En que año naciste: ");
        Integer anio = lea.nextInt();
        System.out.println("En que mes naciste: ");
        Integer mes = lea.nextInt();
        System.out.println("En que dia naciste: ");
        Integer dia = lea.nextInt();

        beneficiario.setFechaNacimiento(LocalDate.of(anio, mes, dia));

        Beneficiario beneficiario1 = new Beneficiario( 21L,"Santiago", "Paternina", LocalDate.now(), "MUCHOS AÑOS", "Calle 3b #01b", "beneficiario10@gmail.com", "2020202020", "Beneficio economico", "2100000");

        Empleado empleado = new Empleado(21L, "Serna", "Rodriguez", "serna@gmail.com", "2020202020", LocalDate.now(), "100030403040", "Calle 1b #21a", "Colombia", "Jefe", "Soltero", 2100000, "Indefinido", "Diciembre");

        Area area = new Area(1L, LocalDate.now(), "calle 4b #21", "torre 2", "210 equipos", "Microsoft", Boolean.FALSE, Boolean.TRUE, "500 personas", 120);

        Nomina nomina = new Nomina(400L, 210000.0, 40000.9, 20000.2, 2100000.1, LocalDate.MIN, LocalDate.MAX, LocalDate.now(), 500000.1, "efectivo");
    }

}