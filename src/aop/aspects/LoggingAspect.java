package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
   /* @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFronUmiLibrary() {

    }

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {

    }

    @Pointcut("allMethodsFronUmiLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary() {

    }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice() {
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
    }*/
/*    @Pointcut("execution(* aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {
    }

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    public void allGetAndReturnMethodsFromUniLibrary() {

    }

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: Log #3");
    }*/


      @Before("aop.aspects.MyPointcuts.allAddMethods()")
      public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
         /* MethodSignature signature = (MethodSignature) joinPoint.getSignature();
          System.out.println("methodSignature = " + signature);
          System.out.println("method = " + signature.getMethod());
          System.out.println("return type = " + signature.getReturnType());
          System.out.println("name method = " + signature.getName());

          if (signature.getName().equals("addBook")) {
              Object[] arguments = joinPoint.getArgs();
              for (Object obj : arguments) {
                  if (obj instanceof Book) {
                      Book myBook = (Book) obj;
                      System.out.println("Информация о книге: " +
                              "название - " + myBook.getName() +
                              ", автор - " + myBook.getAuthor() +
                              ", год издания - " + myBook.getYearOfPublication());
                  } else if (obj instanceof String) {
                      System.out.println("Книгу в библиотеку добавляет " + obj);
                  }
              }
          }*/
          System.out.println("beforeGetBookAdvice: логирование " +
                  "попытки получить книгу/журнал");
          System.out.println("-------------------------------------------");
      }



}
