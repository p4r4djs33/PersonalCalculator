package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculator {
    @GetMapping("")
    public String Calculator() {
        return "index";
    }
    @PostMapping("/calculate")
    public String calculate(@RequestParam int firstOperand,@RequestParam int secondOperand,@RequestParam String operator, Model model) {
        int result = 0;
        switch (operator) {
            case "Addition":
                result = firstOperand + secondOperand;
                break;
            case "Subtraction":
                result = firstOperand - secondOperand;
                break;
            case "Multiplication":
                result = firstOperand * secondOperand;
                break;
            case "Division":
                try {
                    result = firstOperand/secondOperand;
                    break;
                } catch (ArithmeticException e){
                    throw new ArithmeticException("Khong the chia cho 0");
                }
        }

        model.addAttribute("result", result);
        return "result";
    }
}
