package enemies;

import players.ITakeDamage;
import players.fighters.IAttack;

import java.util.Random;

public class MothMan extends Enemy{

    public String musicalInstrument;
    public String prophecy;
    ITakeDamage player;


    public MothMan(String name, String race, int healthPoints, int attackPower, String musicalInstrument, String prophecy) {
        super(name, race, healthPoints, attackPower);
        this.musicalInstrument = musicalInstrument;
        this.prophecy = prophecy;
    }

    public String getMusicalInstrument() {
        return musicalInstrument;
    }

    public String getProphecy() {
        return prophecy;
    }

    public void enemyAttack(ITakeDamage player){
        Random rand = new Random();
        int upperbound = 10;
        int min = 1;
        int diceRoll = rand.nextInt(upperbound-min)+1;
        if(diceRoll >=7){
            System.out.println(this.prophecy);
            this.increaseHealth(20);
            player.takeDamage(50);
        }else{player.takeDamage(this.getAttackPower());}
        System.out.println(diceRoll);
    }

//    public void checkInPassenger(Passenger passenger){
//        if(this.capacity > this.getNumberOfPassengers()){
//            Random rand = new Random();
//            int upperbound = this.capacity;
//            int min = 1;
//            passenger.setFlight(this.flightNumber);
//            passenger.setSeatNumber(rand.nextInt(upperbound-min)+1);
//            this.passengers.add(passenger);}
//    }
//    public void makeProphecy(ITakeDamage player){
//        System.out.println(this.prophecy);
//        this.increaseHealth(20);
//        player.takeDamage(50);
//    }

}
