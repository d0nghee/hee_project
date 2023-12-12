package com.toyproject.deliveryking.store;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoreEntity {
    private long store_id;
    private String store_address;
    private String store_status;
}
