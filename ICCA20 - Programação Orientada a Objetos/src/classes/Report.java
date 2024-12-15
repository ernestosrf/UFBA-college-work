package classes;

import java.util.ArrayList;
import java.util.List;

public class Report<T> {
    private List<T> itens;

    public Report() {
        this.itens = new ArrayList<>();
    }

    public void addItem(T item) {
        itens.add(item);
    }

    public void showReport() {
        for (T item: itens) {
            System.out.println(item.toString());
        }
    }
}
