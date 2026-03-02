public class SimplePricingPolicy implements PricingPolicy {

    @Override
    public double computeFare(double distanceKm) {
        return distanceKm * 15.0;
    }
}