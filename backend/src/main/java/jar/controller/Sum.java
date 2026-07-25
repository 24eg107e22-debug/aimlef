package jar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jar.dto.SumDto;
import jar.dto.Sumdto;

@RestController
public class Sum {

    @GetMapping("/sum/{a}")
    public Sumdto sum(
            @PathVariable int a) {

        Sumdto obj = new Sumdto();
        obj.setS(a);
        return obj;
    }
}
