package com.fatec.project.cardapioeletronico.models;

//Dados dos trabalhadores da empresa
public class ModelEmployee {
    private String employee_Name;
    private String employee_Post;
    private String employee_Expertise;
    private double employee_Salary;
    private String actuation_Time; //quando obter o tempo de atuação do trabalhdor, lembrar de converter para String, pois estará no formato Time


    public String getEmployee_Name() {
        return employee_Name;
    }
    public void setEmployee_Name(String employee_Name) {
        this.employee_Name = employee_Name;
    }
    public String getEmployee_Post() {
        return employee_Post;
    }
    public void setEmployee_Post(String employee_Post) {
        this.employee_Post = employee_Post;
    }
    public String getEmployee_Expertise() {
        return employee_Expertise;
    }
    public void setEmployee_Expertise(String employee_Expertise) {
        this.employee_Expertise = employee_Expertise;
    }
    public double getEmployee_Salary() {
        return employee_Salary;
    }
    public void setEmployee_Salary(double employee_Salary) {
        this.employee_Salary = employee_Salary;
    }
    public String getActuation_Time() {
        return actuation_Time;
    }
    public void setActuation_Time(String actuation_Time) {
        this.actuation_Time = actuation_Time;
    }

    
    
}
