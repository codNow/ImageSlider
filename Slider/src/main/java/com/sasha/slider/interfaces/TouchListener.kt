package com.sasha.slider.interfaces

import com.sasha.slider.constants.ActionTypes


/**
 * Created by Ryan Samte on 7/29/2022.
 * ryansamte07@gmail.com
 * zogam
 */
interface TouchListener {
    /**
     * Click listener touched item function.
     *
     * @param  touched  slider boolean
     */
    fun onTouched(touched: ActionTypes)
}