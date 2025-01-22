package com.example.movieBookingSystem.RequestDtos;

import lombok.Data;

@Data
public class ShowSeatEntryDto {
    private Integer showId;
    private Integer priceOfPremiumSeat;
    private Integer priceOfClassicSeat;
}
