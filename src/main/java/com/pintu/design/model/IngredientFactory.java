package com.pintu.design.model;

import com.pintu.design.utils.DoughType;

public interface IngredientFactory {

    String getSauseType();

    DoughType getCrust();

    String getSeasonings();
}
