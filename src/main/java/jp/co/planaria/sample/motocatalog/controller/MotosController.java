package jp.co.planaria.sample.motocatalog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.planaria.sample.bean.Brand;
import jp.co.planaria.sample.bean.Motorcycle;

@Controller
public class MotosController {
    
    @GetMapping("/motos")
    public String motos(Model model){

        // ブランド
        List<Brand> brands = new ArrayList<Brand>();
        brands.add(new Brand("01", "ホンダ"));
        brands.add(new Brand("02", "カワサキ"));
        brands.add(new Brand("03", "スズキ"));
        brands.add(new Brand("04", "ヤマハ"));

        // バイク
        List<Motorcycle> motos = new ArrayList<Motorcycle>();
        motos.add(new Motorcycle(1, "Z945435H", 899, 1,"空冷", 1111115, "カッコイイ", new Brand("01", "ホンダ"), 1, null, null));
        motos.add(new Motorcycle(2, "BAAA2", 222, 2, "空冷", 554645654, "めっちゃイイ", new Brand("02", "カワサキ"), ２, null, null));
        motos.add(new Motorcycle(3, "34AA22", 22, 1, "空冷", 5545654, "まぁまぁかな", new Brand("03", "スズキ"), 3, null, null));
        motos.add(new Motorcycle(4, "54654KAA22", 252, 2, "空冷", 4645654, "値段が安い", new Brand("04", "ヤマハ"), 1, null, null));
        motos.add(new Motorcycle(4, "ヤマハ１１", 452, 1, "空冷", 955465654, "めっちゃ高いよ", new Brand("02", "カワサキ"), 4, null, null));

        model.addAttribute("brands", brands);
        model.addAttribute("motos", motos);

        return "moto_list.html";
    }
}
