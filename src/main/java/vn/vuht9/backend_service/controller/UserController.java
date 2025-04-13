package vn.vuht9.backend_service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@RestController
@RequestMapping("/test")
public class UserController {
    @Operation(summary = "test API")
    @GetMapping("hello")
    public String getMethodName(@RequestParam String param) {
        log.info("helooo");
        return new String("hello nha");
    }
    
}
