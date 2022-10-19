package enemies;

public class MothMan extends Enemy{

    public String musicalInstrument;
    public String prophecy;

    public MothMan(String name, String race, int healthPoints, String musicalInstrument, String prophecy) {
        super(name, race, healthPoints);
        this.musicalInstrument = musicalInstrument;
        this.prophecy = prophecy;
    }

    public String getMusicalInstrument() {
        return musicalInstrument;
    }

    public String getProphecy() {
        return prophecy;
    }

    public void makeProphecy(){
        System.out.println(this.prophecy);
        this.increaseHealth(20);
    }

}
