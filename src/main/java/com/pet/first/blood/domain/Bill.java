package com.pet.first.blood.domain;

import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
@Builder
public class Bill {
    private Long id;
    private List<Tag> tags;
    private ZonedDateTime timestamp;
    private Double payment;
    private String currency;
}
