package az.edu.ada.wm2.lab6.model.mapper;

import az.edu.ada.wm2.lab6.model.Category;
import az.edu.ada.wm2.lab6.model.dto.CategoryRequestDto;
import az.edu.ada.wm2.lab6.model.dto.CategoryResponseDto;

public final class CategoryMapper {
    private CategoryMapper() {
    }

    public static Category toEntity(CategoryRequestDto dto) {
        if (dto == null) {
            return null;
        }

        return Category.builder()
                .name(dto.getName())
                .build();
    }

    public static CategoryResponseDto toResponseDto(Category category) {
        if (category == null) {
            return null;
        }

        return CategoryResponseDto.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }
}
