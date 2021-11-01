public class BonusMilesService {
    public int calculate(int ticketPrice){
        int addMiles = 0;
        int milesPrice = 20;

        if (ticketPrice >= 20){
            addMiles = ticketPrice / milesPrice;
        }
        return addMiles;
    }
}