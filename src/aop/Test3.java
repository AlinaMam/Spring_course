package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Метод main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);
        String s = uniLibrary.returnBook();
        System.out.println("В библиотеку вернули книгу: " + s);
        context.close();
        System.out.println("Метод main ends");
    }
}
