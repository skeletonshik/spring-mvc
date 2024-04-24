package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
@RequestMapping("/cars")
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String showAll(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {
        count = Math.min(count, 5);
        model.addAttribute("cars", carService.showByParameter(count));
        return "cars";
    }
}
