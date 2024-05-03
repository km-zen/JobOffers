package com.jobboard.domain.offer;

class OfferNotFoundException extends RuntimeException {

    OfferNotFoundException(final String offerId) {
        super(String.format("Offer with id %s not found", offerId));
    }
}
