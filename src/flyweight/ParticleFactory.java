package flyweight;

import java.util.HashMap;

public class ParticleFactory {

    private HashMap<String, SpriteFlyweight> spriteCache = new HashMap<>();
    private static ParticleFactory instance;

    private ParticleFactory(){
    }

    public HashMap<String, SpriteFlyweight> getSpriteCache() {
        return spriteCache;
    }

    public static ParticleFactory getInstance() {
        return instance;
    }

    private SpriteFlyweight getSprite(String sprite, String color){
        if (!spriteCache.containsKey(sprite)){
            spriteCache.put(sprite, new SpriteFlyweight(sprite, color));
        }
        return spriteCache.get(sprite);
    }

    public Particle getMissleCoords(String coords, String vector, int speed){
        return new Particle(getSprite("missle", "blue"), speed, vector, coords);
    }

    public Particle getBullet(String coords, String vector, int speed){
        return new Particle(getSprite("bullet", "green"), speed, vector, coords);
    }
}
