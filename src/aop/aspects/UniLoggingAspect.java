package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniLoggingAspect {
   /* @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов "
                + "перед методом getStudents()");
    }*/

   /* @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student student = students.get(0);
        String nameSurname = student.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        student.setNameSurname(nameSurname);

        double avgGrade = student.getDoubleAvgGrade();
        avgGrade += 1;
        student.setDoubleAvgGrade(avgGrade);

        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов "
                + "после работы метода getStudents()");
    }*/

    /*@AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturnStudentsLogAdvice(List<Student> students) {
        Student student = students.get(0);
        String nameSurname = student.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        student.setNameSurname(nameSurname);

        double avgGrade = student.getDoubleAvgGrade();
        avgGrade += 1;
        student.setDoubleAvgGrade(avgGrade);
    }*/

   /* @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingStudentsLoggingAdvice: " +
                "логируем выброс исключения " + exception);
    }*/
    /*@After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: " +
                "логируем нормальное окончание работы метода или выброс исключения");
    }*/
}
