package data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopController {

    @GetMapping("/")
    public String start() {
        return "redirect:shop/list";
    }

    @GetMapping("/shop/list")
    public ModelAndView list() {
        ModelAndView model = new ModelAndView();
        model.setViewName("gitshop/shoplist"); // 이 경로는 prefix와 suffix에 의해 완성됩니다.
        return model;
    }
}
