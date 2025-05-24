package flyweight;

public class Particle {

    private SpriteFlyweight sprite;
    private int speed;
    private String vector;
    private String coords;


    public Particle(SpriteFlyweight sprite, int speed, String vector, String coords) {
        this.sprite = sprite;
        this.speed = speed;
        this.vector = vector;
        this.coords = coords;
    }

    public void draw(){
        System.out.println("drawing");
    }

    @Override
    public String toString() {
        return "Particle{" +
                "sprite=" + sprite +
                ", speed=" + speed +
                ", vector='" + vector + '\'' +
                ", coords='" + coords + '\'' +
                '}';
    }
}
