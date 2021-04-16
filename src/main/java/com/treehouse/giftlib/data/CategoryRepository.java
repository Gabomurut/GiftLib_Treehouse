package com.treehouse.giftlib.data;

import com.treehouse.giftlib.model.Category;
import com.treehouse.giftlib.model.Gif;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "People"),
            new Category(2, "Technology"),
            new Category(3, "Destruction")

    );

    public List<Category > getAllCategories() {
        return ALL_CATEGORIES;

    }

    public Category findById(int id) {
        for(Category category: ALL_CATEGORIES) {
            if(category.getId() == id) {
                return category;
            }

        } return null;

    }


}
