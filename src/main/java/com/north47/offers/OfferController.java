package com.north47.offers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OfferController {
    private OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping(value = "/offers")
    public List<Offer> getOffers() {
        return offerService.getAllOffers();
    }
}
