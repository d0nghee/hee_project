package com.toyproject.deliveryking.customerhistory;

import lombok.Getter;

import java.sql.Date;

@Getter
public class CustomerHistoryEntity {
    private long history_id;
    private Date order_date;
}
