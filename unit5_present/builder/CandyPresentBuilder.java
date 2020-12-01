package by.epam.unit5.builder;
import by.epam.unit5.action.CustomerAction;
import by.epam.unit5.entity.Wrap;

import java.util.ArrayList;


public class CandyPresentBuilder extends PresentBuilder {

    @Override
    void buildName() {
        String name = CustomerAction.checkInputName();
        present.setName(name);
    }

    @Override
    void buildPrice() {
        System.out.println("What price do you want to buy a present for?");
        double price = CustomerAction.checkInputPrice();
        present.setPrice(price);
    }

    @Override
    void buildWrap() {
        Wrap wrap = CustomerAction.chooseWrap();
        present.setWrap(wrap);
    }

    @Override
    void buildProducts() {
        present.setProducts(new ArrayList<>());
    }
}
