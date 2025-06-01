package factory;

import factory.framework.Product;
import factory.idcard.IdCardFactory;

public class Main {
    public static void main(String[] args) {
        IdCardFactory factory = new IdCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");

        System.out.println();

        card1.use();
        card2.use();
        card3.use();
    }
}
