package com.jobboard.domain.offer;

import java.util.List;
import java.util.Optional;

public interface OfferRepository {
    List<Offer> findAll();

    boolean existByOfferUrl(String s);

    List<Offer> saveAll(List<Offer> offers);

    Optional<Offer> findById(String id);

    Offer save(Offer offer);

    Optional<Offer> findByOfferUrl(String offerUrl);
}
