package entities;


public class Employee {
    public String id;
    public String name;
    public Double salary;

    public String toString(){
        return id
        + ", " 
        + name
        + ", "
        + salary;
    }
}