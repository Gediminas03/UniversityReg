package UniRegSys;

import mainApp.Course;
import mainApp.Module;
import mainApp.Student;
import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Registration {
    public static void main(String[] args){

        LocalDate dateStart = new LocalDate(2015, 9, 1);
        LocalDate dateFinish = new LocalDate(2019, 8, 31);

        List<Module> moduleDataECE = new ArrayList<Module>();
        List<Module> moduleDataCSIT = new ArrayList<Module>();
        HashMap<Course, List<Module>> courseModules = new HashMap<Course, List<Module>>();
        HashMap<Student, String> studentInfo = new HashMap<Student, String>();
//        HashMap<Student, HashMap<Course, List<Module>>> studentInfo = new HashMap<Student, HashMap<Course, List<Module>>>();

        Module module1 = new Module("Telecommunications Software Applications", "EE453");
        Module module2 = new Module("System on Chip Design I", "EE451");
        Module module3 = new Module("Digital Signal Processing", "EE445");
        Module module4 = new Module("Engineering Electromagnetics", "EE348");
        Module module5 = new Module("Advanced Professional Skills", "CT436");
        Module module6 = new Module("Artificial Intelligence", "CT421");
        Module module7 = new Module("Software Engineering III", "CT417");
        Module module8 = new Module("Machine Learning & Data Mining", "CT475");

        Course courseECE = new Course("Electronic and Computer Eng", dateStart, dateFinish);
        Course courseCSIT = new Course("Computer Science and IT", dateStart, dateFinish);

        LocalDate DOB1;
        Student student1 = new Student("Pamela", DOB1 = new LocalDate(1996, 5, 11),15104568);
        LocalDate DOB2;
        Student student2 = new Student("Daniel", DOB2 = new LocalDate(1994, 6, 01),15104515);
        LocalDate DOB3;
        Student student3 = new Student("David", DOB3 = new LocalDate(1997, 7, 19),15104565);
        LocalDate DOB4;
        Student student4 = new Student("Simon", DOB4 = new LocalDate(1994, 10, 14),15104578);
        LocalDate DOB5;
        Student student5 = new Student("Adam", DOB5 = new LocalDate(1995, 12, 13),15104599);

        moduleDataECE.add(module1);
        moduleDataECE.add(module2);
        moduleDataECE.add(module3);
        moduleDataECE.add(module4);
        moduleDataCSIT.add(module5);
        moduleDataCSIT.add(module6);
        moduleDataCSIT.add(module7);
        moduleDataCSIT.add(module8);

        courseModules.put(courseECE, moduleDataECE);
        courseModules.put(courseCSIT,moduleDataCSIT);

        studentInfo.put(student1, courseECE.getName());
        studentInfo.put(student2, courseECE.getName());
        studentInfo.put(student3, courseECE.getName());
        studentInfo.put(student4, courseCSIT.getName());
        studentInfo.put(student5, courseCSIT.getName());

        List<Student> studentList = Arrays.asList(student1, student2, student3, student4, student5);

        System.out.println("========  Course Name: \n" + courseECE.getName());
        System.out.println("========  Modules: ");
        List<Module> returnECE = courseModules.get(courseECE);
        for (Module modECE : returnECE){
            System.out.println(modECE.getName());
        }
        System.out.println("========  Registered Students: ");

        for (Student student : studentList){
            if (studentInfo.get(student).equals(courseECE.getName())) {
                System.out.println(student.getName());
            };
        }

        System.out.println("==============================================");

        System.out.println("========  Course Name: \n" + courseCSIT.getName());
        System.out.println("========  Modules: ");
        List<Module> returnCSIT = courseModules.get(courseCSIT);
        for (Module modCSIT : returnECE){
            System.out.println(modCSIT.getName());
        }
        System.out.println("========  Registered Students: ");

        for (Student student : studentList){
            if (studentInfo.get(student).equals(courseCSIT.getName())) {
                System.out.println(student.getName());
            };
        }

    }
}