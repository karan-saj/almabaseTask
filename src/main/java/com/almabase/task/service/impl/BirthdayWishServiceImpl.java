package com.almabase.task.service.impl;

import com.almabase.task.constant.BirthdayConstants;
import com.almabase.task.service.BirthdayWishService;
import org.springframework.stereotype.Service;

@Service
public class BirthdayWishServiceImpl implements BirthdayWishService {

    /**
     * Get customized birthday wish using user name
     * @param name User name
     * @return Customized birthday wish
     */
    @Override
    public String getBirthdayWishesForUser(String name) {
        return BirthdayConstants.BIRTHDAY_WISH_STARTING + name + BirthdayConstants.BIRTHDAY_WISH_ENDING;
    }
}
