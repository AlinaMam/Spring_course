package spring_introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
public class Dog implements Pet {
//    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

   /* public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    /*@PostConstruct
    public void init() {
        System.out.println("Clss Dog: init() метод");
    }

    @PreDestroy
    protected void destroy() {
        System.out.println("Class Dog: destory() метод");
    }*/
}
