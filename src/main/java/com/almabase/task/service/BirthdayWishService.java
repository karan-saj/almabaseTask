package com.almabase.task.service;

public interface BirthdayWishService {

    /**
     * Get customized birthday wish using user name
     * @param name User name
     * @return Customized birthday wish
     */
    String getBirthdayWishesForUser(String name);
}
