package unitTesting;

import org.junit.Assert;
import org.junit.Test;

public class RaceTest {
    //TODO: TEST ALL THE FUNCTIONALITY OF THE PROVIDED CLASS RaceEntry

    @Test
    public void addMethodShouldWork(){
        Rider rider = new Rider("Gosho",new Motorcycle("Yamaha",100,60.0));
        Race race = new Race();
        race.addRider(rider);
        Assert.assertEquals(1, race.getRiders().size());
    }

    @Test(expected = NullPointerException.class)
    public void riderEqualsNullThrowsException(){
        Rider rider = null;
        Race race = new Race();
        race.addRider(rider);
    }

    @Test(expected = IllegalArgumentException.class)
    public void existingRiderThrowsException(){
        Rider rider = new Rider("Gosho",new Motorcycle("Yamaha",100,60.0));
        Race race = new Race();
        race.addRider(rider);
        race.addRider(rider);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateHorsePowerWithLessThanTwoThrowsException(){
        Rider rider = new Rider("Gosho",new Motorcycle("Yamaha",100,60.0));
        Rider rider1 = new Rider("Pesho",new Motorcycle("Yamaha",200,60.0));
        Race race = new Race();
        race.calculateAverageHorsePower();
    }

    @Test
    public void calculateHorsePowerIsCorrect(){
        Rider rider = new Rider("Gosho",new Motorcycle("Yamaha",100,60.0));
        Rider rider1 = new Rider("Pesho",new Motorcycle("Yamaha",200,60.0));
        Race race = new Race();
        race.addRider(rider);
        race.addRider(rider1);
        double result = race.calculateAverageHorsePower();
        Assert.assertEquals(150.0,result,0);

    }

   @Test(expected = UnsupportedOperationException.class)
    public void unmodifiableCheck(){
       Rider rider = new Rider("Gosho",new Motorcycle("Yamaha",100,60.0));
       Rider rider1 = new Rider("Pesho",new Motorcycle("Yamaha",200,60.0));
       Race race = new Race();
       race.addRider(rider);
       race.addRider(rider1);
       race.getRiders().clear();

   }
}
