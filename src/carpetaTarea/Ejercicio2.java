package carpetaTarea;
import java.util.Objects;
import java.util.Scanner;
public class Ejercicio2 {
    static Scanner lea = new Scanner(System.in);

    static int op;
    static int op3;
    static String op4;
    static String[] datosUsuario = new String[4];
    static String name;
    static String apellido;
    static String email;
    static String clave;
    static String name2;
    static String apellido2;
    static String email2;
    static String clave2;
    private static char cate;

    public static void main(String[] args) {

        registroValidacion();

    }

    public static void registroValidacion() {

        while (op !=3) {

            System.out.println("Elija una opción:");
            System.out.println("\n1.Registrarse \n2.Iniciar Sesion \n3.Cerrar");
            op = lea.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.println("Registre su nombre:");
                    name = lea.next();
                    datosUsuario[0] = name;

                    System.out.println("Registre su apellido:");
                    apellido = lea.next();
                    datosUsuario[1] = apellido;

                    System.out.println("Registre correo:");
                    email = lea.next();
                    datosUsuario[2] = email;

                    System.out.println("Registre la clave:");
                    clave = lea.next();
                    datosUsuario[3] = clave;
                    break;
                }

                case 2->{
                    iniciarSesion();
                    if((Objects.equals(name, name2) && Objects.equals(apellido, apellido2)
                            && Objects.equals(email, email2) && Objects.equals(clave, clave2))){
                        datosDeUsuario();
                        opciones();
                    }
                    else {
                        System.out.println("\nUn campo no ha coincidido, intente nuevamente");
                    }
                    break;
                }

            }
        }

    }

    public static void iniciarSesion() {

        System.out.println("Ingrese su nombre");
        name2 = lea.next();

        System.out.println("Ingrese su apellido");
        apellido2 = lea.next();

        System.out.println("Ingrese correo");
        email2 = lea.next();

        System.out.println("Ingrese la clave");
        clave2 = lea.next();

    }
    public static void datosDeUsuario(){
        System.out.println("Datos ingresados: ");
        for (int i = 0; i < datosUsuario.length; i++) {
            System.out.println(datosUsuario[i]);
        }
    }
    public static void opciones() {

        while (op3 != 3) {
            System.out.println("\nElija una opción:");
            System.out.println("\n1.Validar categoría \n2.Ver beneficios \n3.Salir");
            op3 = lea.nextInt();

            switch (op3) {

                case 1 -> {
                    System.out.println("\nSe encuentra afiliado?(true/false)");
                    boolean afiliado = lea.nextBoolean();

                    System.out.println("\nDigite su salario mensual");
                    double salario = lea.nextDouble();

                    double salarioMinimo = 1300000;

                    if ((salario < salarioMinimo && salario < 2 * salarioMinimo) && afiliado == true) {
                        System.out.println("\nCategoria A");
                    } else if ((salario > 2 * salarioMinimo && salario < 3.5 * salarioMinimo) && afiliado == true) {
                        System.out.println("\nCategoria B");

                    } else if ((salario > 3.5 * salarioMinimo) && afiliado == true) {
                        System.out.println("\nCategoria C");
                    } else {
                        System.out.println("\nCategoria D");
                    }
                    break;
                }
                case 2 -> {
                    System.out.println("\nPara ver sus beneficios debe conocer" +
                            " su categoria, si aun no lo hace \n le recomendamos volver" +
                            " al anterior menu y seleccionar la primera opcion ¿Desea volver? (SI/NO)");
                    op4 = lea.next();

                    if ((Objects.equals(op4, "No")) || (Objects.equals(op4, "no"))) {
                        System.out.println("\nDigite su categoria de la A a la D");
                        cate = lea.next().charAt(0);

                        switch (cate) {

                            case 'A', 'a' -> {
                                System.out.println("\nBeneficios categoria A \n(Ya no es una decepción para su papá)");
                                break;
                            }
                            case 'B', 'b' -> {
                                System.out.println("\nBeneficios categoria B \n(Es un papucho tallado por los mismos angeles)");
                                break;
                            }
                            case 'C', 'c' -> {
                                System.out.println("\nBeneficios categoria C \n(Se le van a declarar mañana)");
                                break;
                            }
                            case 'D', 'd' -> {
                                System.out.println("\nPrecios categoria D \n(Le va a crecer medio centimetro)");
                                break;
                            }
                            default -> {
                                System.out.println("\nIngrese una categoria valida \n");
                                break;
                            }
                        }
                    }
                }
            }

        }

    }
}