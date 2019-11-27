package com.pintu.design.model;

import com.pintu.design.utils.DoughType;

public class NYIngredientsFactory extends BaseIngredients {
    @Override
    public String getSauseType() {
        return "red";
    }

    @Override
    public DoughType getCrust() {
        return DoughType.THIN;
    }

    @Override
    public String getSeasonings() {
        return "Spicy";
    }
}
