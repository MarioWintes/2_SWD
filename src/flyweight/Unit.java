package flyweight;

public class Unit {
    public void fireAt(){
        Game game = Game.getInstance();
        ParticleFactory pf = ParticleFactory.getInstance();

        game.addParticle(pf.getBullet("1/1", "40", 10));
        game.addParticle(pf.getMissleCoords("2/2", "30", 100));

        game.draw();
    }
}
