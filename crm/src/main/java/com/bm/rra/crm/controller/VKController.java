package com.bm.rra.crm.controller;


import com.bm.rra.crm.service.integration.VKTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VKController {

    @Autowired
    private VKTokenService vktokenService;

    @RequestMapping("/vkapp")
    public String getVKCode() {
        return vktokenService.getVKCode();
    }

    @RequestMapping("/vkappsa")
    public String getVKSAToken() {
        return vktokenService.getVKSAToken();
    }

    @RequestMapping("/vk/callback")
    public ModelAndView saveUserData(@RequestParam(value = "code", required = false) String code,
                                     WebRequest req) {
        vktokenService.saveTokenByCode(code); // сохраняю токен что бы потом можно его было использовать, а не создавать каждый раз

        // TODO:  В vktokenService сделать метод который возвращает персональные данные юзера. Телефон, почту, день рождение, имя фамилию в формате String JSON,
        // конвертировать в юзера и сохранить в базу. Недостающие поля добавить в юзера. Почитать https://vk.com/dev/methods
        return new ModelAndView("redirect:/crm/list");
    }
}
