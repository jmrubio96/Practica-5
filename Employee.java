/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Usuario
 */
public class Employee {

    private String name;
    private String surname_1;
    private String surname_2;
    private int age;
    private int salary;
    private String gender;
    private String marital_status;

    //GETTERS
//Usamos los getter para que nos devuelva el valor de los atributos
    public String getName() {
        return name;
    }

    public String getSurname_1() {
        return surname_1;
    }

    public String getSurname_2() {
        return surname_2;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    public String getMarital_status() {
        return marital_status;
    }
//Creamos el constructor para asignar un parametro a cada variable.
    public Employee(String name, String surname_1, String surname_2, int age, int salary, String gender, String marital_status) {
        setName(name);
        setAge(age);
        setGender(gender);
        setMarital_status(marital_status);
        setSurname_1(surname_1);
        setSurname_2(surname_2);
        setSalary(salary);
    }
        //SETTERS
        //Utilizamos los setters para asignar valores a los atributos.
    public void setName(String name){
        if ((name.length()<50)&& (name.length()>0))
        this.name=name;
    }
    
    public void setAge( int age){
        if ((age >=18 && age <67)){
            this.age=age;
        }
        
    }
    
    public void setGender(String gender){
        if ((gender.equals("male"))|| (gender.equals("female"))|| (gender.equals("non-binary"))){
            this.gender=gender;
        }
        
        
    }
    
    public void setMarital_status(String marital_status){
        if ((marital_status.equals("married"))|| (marital_status.equals("widowed"))|| (marital_status.equals("single"))
                || (marital_status.equals("divorced")) ){
            this.marital_status=marital_status;
        }
        
    }
    
    public void setSurname_1(String surname_1){
        if ((surname_1.length()<50)&& (surname_1.length()>0)){
            this.surname_1=surname_1;
        }
        
    }
    
    public void setSurname_2(String surname_2){
        if ((surname_2.length()<50)&& (surname_2.length()>0)){
            this.surname_2=surname_2;
        }
        
    }
    
    public void setSalary(int salary){
        if ((salary >950)){
            this.salary=salary;
        }
        
    }
    
    
    
 @Override
        //Usamos el toString para que nos muestre los datos del usuario
    public String toString() {
        String message = "Nombre completo: " + " "+ getSurname_1()+ " "  +  getSurname_2()+" "  +  getName() + "\n";
        message += "Edad: " +  getAge() + "\n";
        message += "Salario: " +  getSalary() + "\n";
        message += "Género: " +  getGender() + "\n";
        message += "Estado civil: " +  getMarital_status()+ "\n";
        return message;
    }    
                
}
   













