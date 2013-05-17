package cz.pavelhoral;

import java.util.List;

public class SomeOtherBeanImpl {

    private List<MyInterface> listOfMyBeans;

    public void setListOfMyBeans(List<MyInterface> listOfMyBeans) {
        this.listOfMyBeans = listOfMyBeans;
    }
    public List<MyInterface> getListOfMyBeans() {
        return listOfMyBeans;
    }

}
