package pl.camp.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Component2 {

    public void cos() {
        System.out.println("Cos z komponentu 2");
    }
}
