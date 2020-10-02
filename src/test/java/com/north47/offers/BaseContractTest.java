package com.north47.offers;


import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BaseContractTest {
    @Before
    public void setup() {
        List<Offer> offers = Arrays.asList(new Offer(1L, "Hulk Pop", "CHF", 10),
                new Offer(2L, "Darth Vader Pop", "EUR", 12),
                new Offer(3L, "Merlin Pop", "MKD", 600));

        OfferService offerServiceMock = mock(OfferService.class);
        when(offerServiceMock.getAllOffers()).thenReturn(offers);

        RestAssuredMockMvc.standaloneSetup(new OfferController(offerServiceMock));
    }

}
