package flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Game {

    private List<Particle> particles = new ArrayList<>();
    private static Game instance;

    private Game() {
    }

    public void draw(){
        for (Particle particle : particles) {
            particle.draw();
        }
    }

    public void addParticle(Particle p){
        particles.add(p);
    }

    public static Game getInstance() {
        return instance;
    }
}
