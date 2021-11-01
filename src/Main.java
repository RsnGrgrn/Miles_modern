public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int addMiles = service.calculate(37650);
        System.out.println("Количество бонусных миль = " + addMiles);
    }
}