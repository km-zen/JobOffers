package com.jobboard.domain.offer;

import com.jobboard.domain.offer.dto.JobOfferResponse;

import java.util.List;

class InMemoryFetcherTestImpl implements OfferFetchable{

    List<JobOfferResponse> listOfOffers;

    InMemoryFetcherTestImpl(final List<JobOfferResponse> listOfOffers) {
        this.listOfOffers = listOfOffers;
    }

    @Override
    public List<JobOfferResponse> fetchOffers() {
        return listOfOffers;
    }
}
