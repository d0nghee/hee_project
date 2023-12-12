package com.toyproject.deliveryking.manger.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ManagerEntity {
    private long manager_id;
    private String manager_name;
}
