package com.pintu.design;

import com.pintu.design.config.Config;
import com.pintu.design.model.CheesePizza;
import com.pintu.design.model.NYIngredientsFactory;
import com.pintu.design.model.PepparoniPizza;
import com.pintu.design.model.SausagePizza;
import com.pintu.design.service.ChicagoPizzaStore;
import com.pintu.design.service.ServiceImpl;
import com.pintu.design.utils.PizzaType;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final var context = new AnnotationConfigApplicationContext(Config.class);
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter the order:
                1. Sausage pizza
                2. Cheese Pizza
                3. Pepparoni Pizza
        """);
        int option = scanner.nextInt();
        final var pizza = switch (option) {
            case 1 -> new ChicagoPizzaStore().orderLocalizedPizza(PizzaType.Cheese);
            case 2 -> new CheesePizza(new NYIngredientsFactory());
            case 3 -> new PepparoniPizza(new NYIngredientsFactory());

            default -> throw new IllegalStateException("Unexpected value: " + option);
        };

        System.out.println(pizza);
    }
}
