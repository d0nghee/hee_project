package com.toyproject.deliveryking.rider.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RiderEntity {

    private long rider_id;
    private String rider_name;
    private long total_wk_day;
    private String rider_status;

}
