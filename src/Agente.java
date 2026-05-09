public class Agente {

    String id, name,  gender, nacionality, agency;
    int age;
    double salary;



    public Agente(String id,String name, int age , String gender, String nacionality, String agency, double salary){
        setId(id);
        setName(name);
        setAge(age);
        setGender(gender);
        setNacionality(nacionality);
        setAgency(agency);
        setSalary(salary);
    }

    public void setName(String name) {
        if (name.length()>0 && name.length()<30){
            this.name = name;
        }else {
            throw new IllegalArgumentException("Error: el nombre debe tener minimo 3 caracteres y maximo 30");
        }
    }

    public void setId(String id) {
        if (id.length() > 5 && id.length() <15){
            this.id =id;
        }else {
            throw new IllegalArgumentException("Error: el id debe tener 10 numeros");
        }
    }

    public void setAge(int age) {
        if (age >0 && age <100){
            this.age = age;
        }else {
            throw new IllegalArgumentException("Error");
        }
    }

    public void setSalary(double salary) {
        if (salary>0){
            this.salary = salary;
        }else {
            throw new IllegalArgumentException("Error");
        }
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("masculino")|| gender.equalsIgnoreCase("femenino")) {
            this.gender = gender;
        }else {
            throw new IllegalArgumentException("Erorr: El genero debe ser 'masculino' o 'femenino'");
        }
    }

    public void setAgency(String agency) {
        if (agency == null || agency.isBlank()){
            throw new IllegalArgumentException("Error");
        }else {
            this.agency = agency;
        }
    }

    public void setNacionality(String nacionality) {
        if (nacionality == null || nacionality.isBlank()){
            throw new IllegalArgumentException("Error");
        }else {
            this.nacionality = nacionality;
        }
    }

    public void showInformation(){
        System.out.println("Id: "+id);
        System.out.println("Nombre: "+name);
        System.out.println("Edad: "+age);
        System.out.println("Genero: "+gender);
        System.out.println("Nacionalidad: "+nacionality);
        System.out.println("Agencia: "+agency);
        System.out.println("Salario: "+salary);
    }


}
