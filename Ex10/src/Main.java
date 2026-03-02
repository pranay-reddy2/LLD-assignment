public class Main {

    public static void main(String[] args) {

        TripRequest request =
                new TripRequest(
                        "501",
                        new GeoPoint(0, 0),
                        new GeoPoint(3, 3)
                );

        DistanceService distance = new DistanceCalculator();
        DriverService driver = new DriverAllocator();
        PaymentService payment = new PaymentGateway();
        PricingPolicy pricing = new SimplePricingPolicy();

        TransportBookingService service =
                new TransportBookingService(
                        distance,
                        driver,
                        payment,
                        pricing
                );

        service.book(request);
    }
}