package ua.profitsoft.hw6be.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class MathExamplesService {
    public List<String> getExamples(int count) {
        Random r = new Random();
        List<String> examples = new ArrayList<>();
        String[] symbols = {" - ", " + ", " / ", " * "};
        for (int i = 0; i < count; i++)
            examples.add(r.nextInt(100) + symbols[r.nextInt(symbols.length)] + r.nextInt(100));
        return examples;
    }
}
