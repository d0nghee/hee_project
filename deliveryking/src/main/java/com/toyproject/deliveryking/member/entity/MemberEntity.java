package com.toyproject.deliveryking.member.entity;


import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberEntity {
    private long user_id;
    private String user_name;
    private String password;
    private String email;

}
