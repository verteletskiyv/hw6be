package ua.profitsoft.hw6be.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.profitsoft.hw6be.service.MathExamplesService;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/math/examples/")
public class MathExamplesController {
    private final MathExamplesService service;

    @GetMapping
    public List<String> getExamples(@RequestParam("count") int count) {
        return service.getExamples(count);
    }
}
