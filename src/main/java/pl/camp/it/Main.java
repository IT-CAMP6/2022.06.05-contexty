package pl.camp.it;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        Component1 component1 = context.getBean(Component1.class);
        component1.doSomething();
    }
}
