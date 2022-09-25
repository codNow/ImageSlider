package com.sasha.slider.interfaces
/**
 * Created by Ryan Samte on 7/29/2022.
 * ryansamte07@gmail.com
 * zogam
 */
interface ItemClickListener {
    /**
     * Click listener selected item function.
     *
     * @param  position  selected item position
     */
    fun onItemSelected(position: Int)
}