package co.edu.cesde;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        List<Accountant> accountant = new ArrayList<>();
        List<Watchman> watchmen = new ArrayList<>();
        List<CleaningStaff> cleaningStaff = new ArrayList<>();
        List<Admin> admin = new ArrayList<>();

        System.out.println("¿Que perfil desea acceder?");
        System.out.println("1) Administrador");
        System.out.println("2) Contador");
        System.out.println("3) Vigilante");
        System.out.println("4) Personal de Limpieza");
        System.out.println(" ");
        int answer = Integer.parseInt(inputData.nextLine());
        switch (answer) {

            case 1:
                System.out.println("Que desea hacer?");
                System.out.println("1) Crear nuevo perfil");
                System.out.println("2) Ver perfiles creados");
                System.out.println(" ");
                int answer2 = Integer.parseInt(inputData.nextLine());
                if (answer2 == 1) {
                    Admin person = new Admin();
                    System.out.println("ingrese el nombre: ");
                    person.setName(inputData.nextLine());
                    System.out.println("ingrese la identificacion: ");
                    person.setIdentification(inputData.nextLine());
                    System.out.println("ingrese la edad: ");
                    person.setAge(Integer.parseInt(inputData.nextLine()));
                    System.out.println("ingrese el lider de esta persona");
                    person.setLeader(inputData.nextLine());
                    System.out.println("ingrese el estacionamiento");
                    person.setParking(inputData.nextLine());
                    admin.add(person);

                    System.out.println("desea continuar? si/no");
                    String answer3 = inputData.nextLine();
                    if (answer3.equalsIgnoreCase("no")) {
                        break;
                    }

                }
                if (answer2 == 2) {
                    for (int i = 0; i < admin.size(); i++) {
                        System.out.println("Nombre: " + admin.get(i).getName());
                        System.out.println("Identificacion: "+admin.get(i).getIdentification());
                        System.out.println("Edad: "+admin.get(i).getAge());
                        System.out.println("Lider: "+admin.get(i).getLeader());
                        System.out.println("Estacionamiento: "+admin.get(i).getParking());
                    }

                    System.out.println("desea continuar? si/no");
                    String answer3 = inputData.nextLine();
                    if (answer3.equalsIgnoreCase("no")) {
                        break;
                    }

                }
            case 2:
                System.out.println("Que desea hacer?");
                System.out.println("1) Crear nuevo perfil");
                System.out.println("2) Ver perfiles creados");
                int answer4 = Integer.parseInt(inputData.nextLine());
                if (answer4 == 1) {
                    Accountant person = new Accountant();
                    System.out.println("ingrese el nombre: ");
                    person.setName(inputData.nextLine());
                    System.out.println("ingrese la identificacion: ");
                    person.setIdentification(inputData.nextLine());
                    System.out.println("ingrese la edad: ");
                    person.setAge(Integer.parseInt(inputData.nextLine()));
                    System.out.println("ingrese el lider de esta persona");
                    person.setLeader(inputData.nextLine());
                    System.out.println("ingrese el estacionamiento");
                    person.setParking(inputData.nextLine());
                    accountant.add(person);

                    System.out.println("desea continuar? si/no");
                    String answer3 = inputData.nextLine();
                    if (answer3.equalsIgnoreCase("no")) {
                        break;
                    }

                }
                if (answer4 == 2) {
                    for (int i = 0; i < accountant.size(); i++) {
                        System.out.println("Nombre: " + accountant.get(i).getName());
                        System.out.println("Identificacion: "+accountant.get(i).getIdentification());
                        System.out.println("Edad: "+accountant.get(i).getAge());
                        System.out.println("Lider: "+accountant.get(i).getLeader());
                        System.out.println("Estacionamiento: "+accountant.get(i).getParking());
                    }

                    System.out.println("desea continuar? si/no");
                    String answer3 = inputData.nextLine();
                    if (answer3.equalsIgnoreCase("no")) {
                        break;
                    }
                }
            case 3: System.out.println("Que desea hacer?");
                System.out.println("1) Crear nuevo perfil");
                System.out.println("2) Ver perfiles creados");
                int answer5 = Integer.parseInt(inputData.nextLine());
                if(answer5 ==1){
                    Watchman person = new Watchman();
                    System.out.println("ingrese el nombre: ");
                    person.setName(inputData.nextLine());
                    System.out.println("ingrese la identificacion: ");
                    person.setIdentification(inputData.nextLine());
                    System.out.println("ingrese la edad: ");
                    person.setAge(Integer.parseInt(inputData.nextLine()));
                    System.out.println("ingrese el arma de el vigilante");
                    person.setWeapon(inputData.nextLine());
                    System.out.println("ingrese el dia de trabajo");
                    person.setWorkday(inputData.nextLine());
                    watchmen.add(person);

                    System.out.println("desea continuar? si/no");
                    String answer3 = inputData.nextLine();
                    if (answer3.equalsIgnoreCase("no")){
                        break;
                    }

                }
                if(answer5==2) {
                    for (int i = 0; i < watchmen.size(); i++) {
                        System.out.println("Nombre: " + watchmen.get(i).getName());
                        System.out.println("Identificacion: "+watchmen.get(i).getIdentification());
                        System.out.println("Edad: "+watchmen.get(i).getAge());
                        System.out.println("Arma: "+watchmen.get(i).getWeapon());
                        System.out.println("Dia de trabajo: "+watchmen.get(i).getWorkday());
                    }

                    System.out.println("desea continuar? si/no");
                    String answer3 = inputData.nextLine();
                    if (answer3.equalsIgnoreCase("no")) {
                        break;
                    }
                }
            case 4: System.out.println("Que desea hacer?");
                System.out.println("1) Crear nuevo perfil");
                System.out.println("2) Ver perfiles creados");
                int answer6 = Integer.parseInt(inputData.nextLine());
                if(answer6 ==1){
                    CleaningStaff person = new CleaningStaff();
                    System.out.println("ingrese el nombre: ");
                    person.setName(inputData.nextLine());
                    System.out.println("ingrese la identificacion: ");
                    person.setIdentification(inputData.nextLine());
                    System.out.println("ingrese la edad: ");
                    person.setAge(Integer.parseInt(inputData.nextLine()));
                    System.out.println("ingrese el dia de descanso: ");
                    person.setDayOff(inputData.nextLine());
                    cleaningStaff.add(person);

                    System.out.println("desea continuar? si/no");
                    String answer3 = inputData.nextLine();
                    if (answer3.equalsIgnoreCase("no")){
                        break;
                    }

                }
                if(answer6==2) {
                    for (int i = 0; i < cleaningStaff.size(); i++) {
                        System.out.println("Nombre: " + cleaningStaff.get(i).getName());
                        System.out.println("Identificacion: "+cleaningStaff.get(i).getIdentification());
                        System.out.println("Edad: "+cleaningStaff.get(i).getAge());
                        System.out.println("Dia de descanso: "+cleaningStaff.get(i).getDayOff());

                    }

                    System.out.println("desea continuar? si/no");
                    String answer3 = inputData.nextLine();
                    if (answer3.equalsIgnoreCase("no")) {
                        break;
                    }
                }
        }


    }
}

