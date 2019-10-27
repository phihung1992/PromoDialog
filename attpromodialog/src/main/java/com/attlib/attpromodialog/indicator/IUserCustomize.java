package com.attlib.attpromodialog.indicator;

import android.support.v4.view.ViewPager;

public interface IUserCustomize {
    void setViewPager(ViewPager viewPager);

    void setAnimateDuration(long duration);

    /**
     * @param radius: radius in pixel
     */
    void setRadiusSelected(int radius);

    /**
     * @param radius: radius in pixel
     */
    void setRadiusUnselected(int radius);

    /**
     * @param distance: distance in pixel
     */
    void setDistanceDot(int distance);
}
