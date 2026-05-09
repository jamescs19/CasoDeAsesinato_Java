import java.util.Scanner;

public class Forense extends Agente{

    int solved_cases, clues;

    public Forense(String id,String name, int age , String gender, String nacionality,
                  String agency, double salary, int solved_cases,int clues){
                    super(id,name,age,gender,nacionality,agency,salary);

                    setClues(clues);
                    setSolved_cases(solved_cases);

    }

    public void setClues(int clues) {
        if (clues <0){
            throw new IllegalArgumentException("Error: No puede ser menor a 0");
        }else {
            this.clues=clues;
        }
    }

    public void setSolved_cases(int solved_cases) {
        if (solved_cases <0){
            throw new IllegalArgumentException("Error: No puede ser menor a 0");
        }else {
            this.solved_cases=solved_cases;
        }
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Pistas encontradas de este caso: "+clues);
        System.out.println("Casos resueltos en total: "+solved_cases);
    }


    public static Forense addForense(){
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
        System.out.println("Ingrese las pistas encontradas en este caso");
        int clues = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese los casos resueltos en total");
        int solved_cases = sc.nextInt();
        sc.nextLine();

        try {
            Forense f = new Forense(id,name,age,gender,nacionality,agency,salary,solved_cases,clues);
            return f;
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        return null;
    }
}
