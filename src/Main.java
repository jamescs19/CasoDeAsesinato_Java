//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        System.out.println("!Hola detective. Ingrese su nombre");
        String name = sc.nextLine();
        System.out.println("Bienvenido detective "+name);

        String guilty;



        ArrayList<String> aurelio = new ArrayList<>();
        ArrayList<String> victoria = new ArrayList<>();
        ArrayList<String> bruno = new ArrayList<>();
        ArrayList<String> simon = new ArrayList<>();
        ArrayList<Forense>forense = new ArrayList<>();
        ArrayList<Policia>policia = new ArrayList<>();

        ArrayList<ArrayList<String>> interrogatorios = new ArrayList<>();
        interrogatorios.add(aurelio);
        interrogatorios.add(victoria);
        interrogatorios.add(bruno);
        interrogatorios.add(simon);

        ArrayList<Integer> cluesList = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        names.add("Aurelio Vasquez");
        names.add("victoria Mendoza");
        names.add("Bruno Castellano");
        names.add("Simon Quiroga");


        System.out.println("Ingrese su edad");
        int age = sc.nextInt();

        if (age <=11) {
            System.out.println("Eres muy joven para ser detective");
        }else if (age>=12 && age <=17) {
            System.out.println("Puedes ser detective junior");
        }else if (age>=18 && age<=59) {
            System.out.println("Bienvenido al equipo de detctives");
        }else{
            System.out.println("Detective senior con experiencia");
        }

        int clues=0;
        if (age>=18) {
            System.out.println("cuantas pistas encontrastes");
            clues =sc.nextInt();
        }

        if (clues >=5 ) {
            System.out.println("Eres un detective experto");
            System.out.println("puedes reolver el caso");


            for(int i = 0; i< names.size(); i++){
                System.out.println("Cuantas pistas inculpables encontrastes para "+names.get(i));
                int clue = sc.nextInt();
                cluesList.add(clue);
            }



            for(int i =0; i<cluesList.size(); i++){
                System.out.println("Pistas inculpables de "+names.get(i)+": "+cluesList.get(i));
            }

            boolean menu = true;
            do{
                System.out.println("====DESPACHO=====");
                System.out.println("1: Revisar pistas");
                System.out.println("2: Informacion extra");
                System.out.println("3: Interrogar sospechoso");
                System.out.println("4: Revisar expediente");
                System.out.println("5: Resolver el caso");
                System.out.println("6: Salir");

                System.out.println();
                System.out.println("Ingrese una opcion");
                int option= sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 1:
                        System.out.println("Ingrese el numero del sospechoso que quiere añadirle pistas");
                        System.out.println("1: Aurelio vasquez");
                        System.out.println("2: Victoria Mendoza");
                        System.out.println("3: Bruno Castellano");
                        System.out.println("4: Simon Quiroga");

                        int select= sc.nextInt();
                        sc.nextLine();


                        if (select >=1 && select <=4) {
                            System.out.println("Cuantas pistas extras encontrate de "+names.get(select-1));
                            int newClues = sc.nextInt();
                            sc.nextLine();
                            cluesList.set(select-1,cluesList.get(select-1)+newClues);
                        } else {
                            System.out.println("Error: Ingrese una opcion de 1 a 4");
                        }
                        break;

                    case 2:
                        boolean menu2 = true;
                        do {
                            System.out.println("-----QUIEN TIENE INFORMACION EXTRA?-----");
                            System.out.println("1: Forense");
                            System.out.println("2: Policia");
                            System.out.println("3: Salir");
                            int extra =sc.nextInt();
                            sc.nextLine();

                            if (extra ==1){
                                Forense f = Forense.addForense();
                                if(f !=null) {
                                    forense.add(f);
                                    System.out.println("Datos agregados correctamente");
                                }
                            }else if (extra == 2){
                                Policia p = Policia.addPolicia();
                                if(p !=null) {
                                    policia.add(p);
                                    System.out.println("Datos agregados correctamente");
                                }
                            } else if(extra ==3){
                                System.out.println("SALIENDO...");
                                menu2 = false;
                            }else {
                                System.out.println("Error: ingrese una opcion de 1 a 3");
                            }
                        }while (menu2);

                        break;


                    case 3:

                        boolean exit = true;
                        do {
                            System.out.println("A quien desea interrogar? Presione '5' para salir");
                            System.out.println("1: Aurelio Vasquez\n" +
                                    "2: Victoria Mendoza\n" +
                                    "3: Bruno Castellano\n" +
                                    "4: Simon Quiroga");
                            int suspect = sc.nextInt();
                            sc.nextLine();
                            if (suspect == 1 || suspect == 2 || suspect == 3 || suspect == 4) {
                                System.out.println("Ingrese la pregunta a " + names.get(suspect - 1));
                                String question = sc.nextLine();
                                System.out.println("Ingrese la respuesta");
                                String answer = sc.nextLine();
                                if (suspect == 1) {
                                    aurelio.add(question + "||" + answer);
                                } else if (suspect == 2) {
                                    victoria.add(question + "||" + answer);
                                } else if (suspect == 3) {
                                    bruno.add(question + "||" + answer);
                                } else if (suspect == 4) {
                                    simon.add(question + "||" + answer);
                                }

                            } else if (suspect == 5) {
                                exit = false;
                            }else {
                                System.out.println("Error: opcion invalida");
                            }

                        }while (exit);


                        break;

                    case 4:

                        for (int i = 0; i < names.size(); i++) {
                            System.out.println(names.get(i));
                            System.out.println("Pistas: " + cluesList.get(i));
                            System.out.println("INTERROGATORIOS");
                            for (String d: interrogatorios.get(i)) {
                                System.out.println(d);
                                System.out.println();

                            }
                        }

                        System.out.println("=====DATOS EXTRAS=====");
                        for (var f: forense){
                            f.showInformation();
                            System.out.println();
                        }

                        for (var p: policia){
                            p.showInformation();
                            System.out.println();
                        }

                        break;

                    case 5:
                        System.out.println("Ingrese su veredicto");
                        guilty= sc.nextLine();
                        System.out.println("El veredicto final es: "+guilty);
                        menu = false;
                        break;

                    case 6:
                        System.out.println("SALIENDO....");
                        menu = false;
                        break;
                    default:
                        System.out.println("Ingrese una opcion de 1 a 6");
                        break;
                }

            }while(menu);




        }else if (clues >=3) {
            System.out.println("Buen trabajo, detective");
            System.out.println("Necesitas una pista mas");
        }else if (clues >=1) {
            System.out.println("vas por buen camino");
            System.out.println("Sigue investigando");

        }else {
            System.out.println("No has enocntrado nada o no tienes la edad minima para ser detective (18)");
        }
    }
}