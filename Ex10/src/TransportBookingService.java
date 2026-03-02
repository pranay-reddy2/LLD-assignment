public class TransportBookingService {

    private final DistanceService distanceService;
    private final DriverService driverService;
    private final PaymentService paymentService;
    private final PricingPolicy pricingPolicy;

    public TransportBookingService(DistanceService distanceService,
                                   DriverService driverService,
                                   PaymentService paymentService,
                                   PricingPolicy pricingPolicy) {

        this.distanceService = distanceService;
        this.driverService = driverService;
        this.paymentService = paymentService;
        this.pricingPolicy = pricingPolicy;
    }

    public void book(TripRequest request) {

        System.out.println("=== Transport Booking ===");

        double distance =
                distanceService.distance(request.from, request.to);

        System.out.println("DistanceKm=" + distance);

        String driver =
                driverService.assignDriver(request);

        System.out.println("Driver=" + driver);

        double fare =
                pricingPolicy.computeFare(distance);

        String txn =
                paymentService.charge(fare);

        System.out.println("Payment=PAID txn=" + txn);

        BookingReceipt receipt =
                new BookingReceipt("R-501", fare);

        System.out.println(
                "RECEIPT: " + receipt.id +
                " | fare=" + String.format("%.2f", receipt.fare)
        );
    }
}