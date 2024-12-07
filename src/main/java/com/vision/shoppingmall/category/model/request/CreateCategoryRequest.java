package com.vision.shoppingmall.category.request;


import jakarta.validation.constraints.NotBlank;
import lombok.Setter;

@Setter
public class CreateCategoryRequest {

    @NotBlank(message = "카테고리 이름은 비어있을 수 없습니다.")
    private String categoryName;
}
