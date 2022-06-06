package pl.camp.it;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Component3 implements IComponent3 {

    public void cos() {
        System.out.println("Metoda cos z komponentu 3");
    }
}
