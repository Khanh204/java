package Phone;

import java.util.ArrayList;

public abstract class Phone {

    public abstract void insertPhone(String name,String phone);
    public abstract void removePhobe(String name);
    public abstract void updatePhone(String name,String oldPhone,String newPhone);
    public abstract void searchPhone(String name);
    abstract void sort();
}
