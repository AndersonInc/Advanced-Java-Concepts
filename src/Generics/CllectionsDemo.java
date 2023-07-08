package Generics;

import java.util.List;

public class CllectionsDemo<T extends List> {

    public T name;
    public void setName(T name) {
        this.name = name;
        name.add(getName());
    }
    public T getName() {
        return name;
    }
}
