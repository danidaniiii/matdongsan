package com.ssafy.matdongsan.domain.review.dto;

import com.ssafy.matdongsan.domain.account.model.Account;
import com.ssafy.matdongsan.domain.account.model.PersonTag;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReviewFindAllResponseDto {
    private Long id;
    private double kindnessRating;
    private double tasteRating;
    private String content;
    private String visitDate;
    private Integer restaurantId;
    private List<AccountSaveReviewRequestDto> accountReviews;
    private List<PersonTagSaveReviewRequestDto> reviewPersonTags;


    public ReviewFindAllResponseDto(Long id, double kindnessRating, double tasteRating, String content, String visitDate, Integer restaurantId, List<AccountSaveReviewRequestDto> accountReviews, List<PersonTagSaveReviewRequestDto> reviewPersonTags) {
        this.id = id;
        this.kindnessRating = kindnessRating;
        this.tasteRating = tasteRating;
        this.content = content;
        this.visitDate = visitDate;
        this.restaurantId = restaurantId;
        this.accountReviews = accountReviews;
        this.reviewPersonTags = reviewPersonTags;
    }
}
