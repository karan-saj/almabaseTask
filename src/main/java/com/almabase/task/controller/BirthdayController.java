package com.almabase.task.controller;

import com.almabase.task.service.BirthdayWishService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags= "An API the exposes user birthday wishes service")
@RestController
@RequestMapping(value = "/birthday-wishes")
public class BirthdayController {

    @Autowired
    BirthdayWishService birthdayWishService;

    /**
     * Get customized birthday wish using user name
     * @param name User name
     * @return Customized birthday wish
     */
    @ApiOperation("Get user customized birthday wish")
    @GetMapping("/name")
    public String getBirthdayWishesForUser(@RequestParam(value = "name") String name) {
        return  birthdayWishService.getBirthdayWishesForUser(name);
    }
}
