package dev.starichkov.java.spring.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 03.09.2024 18:38
 */
@RestController
@RequestMapping("/samples")
public class SampleController {

    private final SampleService sampleService;

    @Autowired
    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/name/{id}")
    public String getNameById(@PathVariable int id) {
        return sampleService.getNameById(id);
    }
}
