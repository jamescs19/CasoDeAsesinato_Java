import java.util.Scanner;
public class Policia extends Agente{

    String armament, status;

    public Policia (String id,String name, int age , String gender, String nacionality,
    String agency, double salary, String armament, String status) {
        super(id, name, age, gender, nacionality, agency, salary);
        setArmament(armament);
        setStatus(status);

    }

    public void setArmament(String armament) {
        if (armament == null || armament.isBlank()){
            throw new IllegalArgumentException("Error");
        }else {
            this.armament = armament;
        }
    }

    public void setStatus(String status) {
        if (status.equalsIgnoreCase("activo")||status.equalsIgnoreCase("retirado")){
            this.status = status;
        }else {
            throw new IllegalArgumentException("Error: debe estar 'activo' o 'retirado'");
        }
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Armamento: "+armament);
        System.out.println("Estado: "+status);
    }

    public static Policia addPolicia(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ID");
        String id = sc.nextLine();
        System.out.println("Ingrese el nombre");
        String name = sc.nextLine();
        System.out.println("Ingrese la edad");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el genero");
        String gender = sc.nextLine();
        System.out.println("Ingrese la nacionalidad");
        String nacionality = sc.nextLine();
        System.out.println("Ingrese la agencia");
        String agency = sc.nextLine();
        System.out.println("Ingrese el salario");
        double salary =sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese que tipo de armamento carga");
        String armament = sc.nextLine();
        System.out.println("Ingrese el estado (Activo o Retirado)");
        String status = sc.nextLine();

        try {
            Policia p = new Policia(id,name,age,gender,nacionality,agency,salary,armament,status);
            return p;
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        return null;
    }
}
