package com.north47.offers;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService {
    private OfferRepository offerRepository;


    public OfferService(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    public List<Offer> getAllOffers() {
        return offerRepository.findAll();
    }
}
