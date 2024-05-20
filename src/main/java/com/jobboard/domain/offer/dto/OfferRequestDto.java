package com.jobboard.domain.offer.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record OfferRequestDto(@NotNull(message = "companyName must not be null")
                              @NotEmpty(message = "companyName must not be empty")
                              String companyName,

                              @NotNull(message = "position must not be null")
                              @NotEmpty(message = "position must not be empty")
                              String position,

                              @NotNull(message = "salary must not be null")
                              @NotEmpty(message = "salary must not be empty")
                              String salary,

                              @NotNull(message = "offerUrl must not be null")
                              @NotEmpty(message = "offerUrl must not be empty")
                              String offerUrl) {

//    "companyName must not be empty",
//            "position must not be empty",
//            "salary must not be empty",
//            "offerUrl must not be null",
//            "offerUrl must not be empty"

//    @NotNull(message = "{companyName.not.null}")
//    @NotEmpty(message = "{companyName.not.empty}")
//    String companyName,
//
//    @NotNull(message = "{position.not.null}")
//    @NotEmpty(message = "{position.not.empty}")
//    String position,
//
//    @NotNull(message = "{salary.not.null}")
//    @NotEmpty(message = "{salary.not.empty}")
//    String salary,
//
//    @NotNull(message = "{offerUrl.not.null}")
//    @NotEmpty(message = "{offerUrl.not.empty}")
//    String offerUrl
}
