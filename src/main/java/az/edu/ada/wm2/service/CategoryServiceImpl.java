package az.edu.ada.wm2.service;

import az.edu.ada.wm2.lab6.model.mapper.ProductMapper;
import az.edu.ada.wm2.lab6.repository.CategoryRepository;
import az.edu.ada.wm2.lab6.repository.ProductRepository;

public class CategoryServiceImpl extends az.edu.ada.wm2.lab6.service.CategoryServiceImpl {
    public CategoryServiceImpl(CategoryRepository categoryRepository,
                               ProductRepository productRepository,
                               ProductMapper productMapper) {
        super(categoryRepository, productRepository, productMapper);
    }
}
