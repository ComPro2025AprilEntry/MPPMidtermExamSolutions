package shipment;

sealed public interface Shipment permits StandardShipment, ExpressShipment, OvernightShipment {
    String getTrackingDetails();
}
