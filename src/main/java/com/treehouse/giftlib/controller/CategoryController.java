package com.treehouse.giftlib.controller;
import com.treehouse.giftlib.data.CategoryRepository;
import com.treehouse.giftlib.data.GifRepository;
import com.treehouse.giftlib.model.Category;
import com.treehouse.giftlib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.model.IModel;

import java.time.LocalDate;
import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/categories")
    public String ListCategories(ModelMap modelMap){
        List< Category > categories = categoryRepository.getAllCategories();
        modelMap.put("categories", categories);
        return "categories";

    }

    @RequestMapping("/category/{id}")
    public String category(@PathVariable int id, ModelMap modelMap) {
        Category category = categoryRepository.findById(id);
        modelMap.put("category", category);

        List<Gif> gifs = gifRepository.findByCategoryId(id);
        modelMap.put("gifs", gifs);

        return "category";
    }


}
