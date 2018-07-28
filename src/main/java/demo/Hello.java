package demo;

import demo.models.Feature;
import demo.models.Item;
import org.rythmengine.Rythm;

import java.io.File;
import java.util.List;

import static com.github.freewind.lostlist.Lists.list;

public class Hello {

    public static void main(String[] args) {

        List<Item> items = list(
                new Item("Item 1", "$19.99", list("good", "item", "new"), list(new Feature("New!"), new Feature("Awesome!"))),
                new Item("Item 2", "$29.99", list("old", "item", "bad"), list(new Feature("Old."), new Feature("Ugly.")))
        );

        System.out.println(Rythm.render(new File("src/main/resources/hello.rythm"), items));
    }

}

