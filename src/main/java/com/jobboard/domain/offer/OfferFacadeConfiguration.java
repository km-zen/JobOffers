package com.jobboard.domain.offer;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@Configuration
class OfferFacadeConfiguration {

    @Bean
    OfferFacade offerFacade(OfferFetchable offerFetchable, OfferRepository offerRepository) {
        OfferService offerService = new OfferService(offerFetchable, offerRepository);
        return new OfferFacade(offerRepository, offerService);
    }
}
