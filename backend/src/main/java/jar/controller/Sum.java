package jar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jar.dto.SumDto;

@RestController
public class Sum {

    @GetMapping("/sum/{a}/{b}")
    public SumDto sum(
            @PathVariable int a,
            @PathVariable int b) {

        return new SumDto(a, b);
    }
}