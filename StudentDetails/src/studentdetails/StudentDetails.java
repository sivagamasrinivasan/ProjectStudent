/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetails;

/**
 *
 * @author sivagamasrinivasan
 */
public class StudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // define and print 3 studnet 
    Student s1 = new Student();
    s1.setName("ridham");
    s1.setAge(19);
    Student s2 = new Student();
    s2.setName("mansi");
    s2.setAge(19);
    Student s3 = new Student();
    s3.setName("kaur");
    s3.setAge(19);
    Student[] list = new Student[3];// array of object declaration
    // store object of student class
    list[0]=s1; //stored object in array
    list[1]=s2;
    list[2]=s3;
    for(int i=0;i<list.length;i++)
    {
       System.out.println(list[i].getName() + " "+list[i].getAge());
    }
    }
    
}
