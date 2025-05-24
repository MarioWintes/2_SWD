package flyweight;

public class SpriteFlyweight {

    private String color;
    private String sprite;

    public SpriteFlyweight(String color, String sprite) {
        this.color = color;
        this.sprite = sprite;
    }

    public String getSprite() {
        return sprite;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "SpriteFlyweight{" +
                "color='" + color + '\'' +
                ", sprite='" + sprite + '\'' +
                '}';
    }
}
