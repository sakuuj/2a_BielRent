package by.fpmibsu.bielrent.dto;

import lombok.Builder;
import lombok.Value;

import java.sql.Date;
import java.time.LocalDateTime;

@Value
@Builder
public class FilterDto {
    //private String id;
    private long listingId;

    private String roomCount;
    private String floorCount;
    private String bedroomCount;
    private String balconyCount;
    private String squareArea;
    private String priceMonthly;
    private String buildYear;
    private String hasBathroom;
    //????????????????

    private String rentalPeriodStart;
    private String rentalPeriodEnd;
    //???????????????????
    private String hasWashingMachine;
    private String hasFurniture;
    private String hasWifi;
    private String hasElevator;
}
