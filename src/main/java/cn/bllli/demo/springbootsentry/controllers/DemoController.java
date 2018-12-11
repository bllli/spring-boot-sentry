package cn.bllli.demo.springbootsentry.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bllli
 */
@RestController
public class DemoController {

    @GetMapping("/div-zero")
    public Object divZero() {
        return 1 / 0;
    }
}
