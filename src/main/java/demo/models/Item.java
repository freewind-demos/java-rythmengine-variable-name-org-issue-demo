package demo.models;

import java.util.List;

public class Item {
    public final String name;
    public final String price;
    public final List<String> keywords;
    public final List<Feature> features;
    public Item(String name, String price, List<String> keywords, List<Feature> features) {
        this.name = name;
        this.price = price;
        this.keywords = keywords;
        this.features = features;
    }
}
