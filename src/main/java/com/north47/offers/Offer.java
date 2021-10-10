package com.north47.offers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Offer {
    @Id
    @GeneratedValue
    private Long id;

    private String offerName;

    private String currency;

    private Integer price;
}
