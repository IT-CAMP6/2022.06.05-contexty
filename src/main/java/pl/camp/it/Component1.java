package pl.camp.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Component1 {

    private String name;

    @Autowired
    private Component2 component2;

    @Autowired
    private IComponent3 comp;

    public void doSomething() {
        System.out.println("Cos fajnego robie");
        component2.cos();
        comp.cos();
    }

    public Component2 getComponent2() {
        return component2;
    }

    public void setComponent2(Component2 component2) {
        this.component2 = component2;
    }

    public IComponent3 getComp() {
        return comp;
    }

    public void setComp(IComponent3 comp) {
        this.comp = comp;
    }
}
