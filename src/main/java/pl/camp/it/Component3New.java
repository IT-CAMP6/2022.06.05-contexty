package pl.camp.it;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Component3New implements IComponent3 {
    public void cos() {
        System.out.println("Metoda cos z komponentu 3 nowa !!!!");
    }
}
