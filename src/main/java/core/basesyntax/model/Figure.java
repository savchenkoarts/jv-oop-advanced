package core.basesyntax.model;

import core.basesyntax.service.AreaCalculator;
import core.basesyntax.service.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;

    protected Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}