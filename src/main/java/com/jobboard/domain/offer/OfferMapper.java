package com.jobboard.domain.offer;

import com.jobboard.domain.offer.dto.JobOfferResponse;
import com.jobboard.domain.offer.dto.OfferRequestDto;
import com.jobboard.domain.offer.dto.OfferResponseDto;

class OfferMapper {

    public static OfferResponseDto mapFromOfferToOfferDto(Offer offer) {
        return OfferResponseDto.builder()
                .id(offer.id())
                .companyName(offer.companyName())
                .position(offer.position())
                .salary(offer.salary())
                .offerUrl(offer.offerUrl())
                .build();
    }

    public static Offer mapFromOfferDtoToOffer(OfferRequestDto offerDto) {
        return Offer.builder()
                .companyName(offerDto.companyName())
                .position(offerDto.position())
                .salary(offerDto.salary())
                .offerUrl(offerDto.offerUrl())
                .build();
    }

    public static Offer mapFromJobOfferResponseToOffer(JobOfferResponse jobOfferDto) {
        return Offer.builder()
                .offerUrl(jobOfferDto.offerUrl())
                .salary(jobOfferDto.salary())
                .position(jobOfferDto.title())
                .companyName(jobOfferDto.company())
                .build();
    }
}
