/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Menu {
    Employee empleado=new Employee("Jose Manuel", "Rubio", "Serrano", 24, 2500, "male", "single");
    Scanner user_input = new Scanner(System.in);
    Scanner user_input_string = new Scanner(System.in);
    
    public void execute(){
        int option;
        do{
            option = selectOption();

            switch(option){
                case 0:
                    showInfo();
                    pause();
                    break;
                case 1:
                    modifyName();
                    break;
                case 2:
                    modifyAge();
                    break;
                case 3:
                    increaseSalary();
                    break;
                case 4:
                    degreaseSalary();
                    break;
                case 5:
                    modifyGender();
                    break;
                case 6:
                    modifyMarital_status();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("[ERROR] Opción no válida.");
                   
                    break;
            }
            
        }while(option != 7);
        
    }
    //Mostramos las opciones disponibles en el menú
    private int selectOption(){
        System.out.println("=================================");
        System.out.println("Gestión de RRHH");
        System.out.println("=================================");
        System.out.println("\t[0] Mostrar la información de la persona contratada");
        System.out.println("\t[1] Modificar el nombre completo");
        System.out.println("\t[2] Modificar la edad");
        System.out.println("\t[3] Aumentar el sueldo");
        System.out.println("\t[4] Bajar el sueldo");
        System.out.println("\t[5] Modificar el género");
        System.out.println("\t[6] Modificar el estado civil");
        System.out.println("\t[7]Salir");
        
        return user_input.nextInt();
    }
    //usamos un método privado para modificar los datos a traves del menú
    private void showInfo(){
        System.out.println(empleado);
        
    }
    
    private void modifyName(){
        System.out.println("Introduzca el nuevo nombre:");
        String new_name = user_input_string.nextLine();
        empleado.setName(new_name);
        System.out.println("Introduzca el nuevo apellido:");
        String new_surname1 = user_input_string.nextLine();
        empleado.setSurname_1(new_surname1);
        System.out.println("Introduzca el nuevo apellido:");
        String new_surname2 = user_input_string.nextLine();
        empleado.setSurname_2(new_surname2);
    }
    
    private void modifyAge(){
        System.out.println("Introduzca la nueva edad:");
        int new_number = user_input.nextInt();
        empleado.setAge(new_number);
        
    }
    
    private void increaseSalary(){
        System.out.println("Introduzca el nuevo sueldo:");
        int new_salary = user_input.nextInt();
        empleado.setSalary(new_salary);
        
    }
    
    private void degreaseSalary(){
        System.out.println("Introduzca el nuevo sueldo:");
        int new_salary = user_input.nextInt();
        empleado.setSalary(new_salary);
        
    }
    
    private void modifyGender(){
        System.out.println("Introduzca el nuevo genero:");
        String new_gender = user_input_string.nextLine();
        empleado.setGender(new_gender);
        
    }
    
    
    private void modifyMarital_status(){
        System.out.println("Introduzca el nuevo estado civil:");
        String new_status = user_input_string.nextLine();
        empleado.setMarital_status(new_status);
        
    }
    
    private void pause(){
         user_input_string.nextLine();
        
    }
    
    
    
}


























