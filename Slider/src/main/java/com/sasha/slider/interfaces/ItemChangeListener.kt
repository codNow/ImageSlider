package com.sasha.slider.interfaces
/**
 * Created by Ryan Samte on 7/29/2022.
 * ryansamte07@gmail.com
 * zogam
 */
interface ItemChangeListener {
    /**
     * Click listener changed item function.
     *
     * @param  position  changed item position
     */
    fun onItemChanged(position: Int)
}