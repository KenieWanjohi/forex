public class Convert {
    public static void main(String[] args) {
        double kenya_shillings = 560.5;
        double rate = 129;
        double US_dollars = kenya_shillings / rate;

        System.out.println("Value of kenya-shilling : " + kenya_shillings);
        System.out.println("Value of rate: " + rate);
        System.out.println("Value of US dollars: " + US_dollars);
    }
}