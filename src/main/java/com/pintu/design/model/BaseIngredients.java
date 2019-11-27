package com.pintu.design.model;

import com.pintu.design.utils.DoughType;

public class BaseIngredients implements IngredientFactory {
    @Override
    public String getSauseType() {
        return "Bland";
    }

    @Override
    public DoughType getCrust() {
        return DoughType.NONE;
    }

    @Override
    public String getSeasonings() {
        return "none";
    }
}
