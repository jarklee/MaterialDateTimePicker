/*
 * ******************************************************************************
 *  Copyright Ⓒ 2017. Dotohsoft.com. All right reserved
 *  Author TrinhQuan. Create on 2017/1/9
 * ******************************************************************************
 */

package com.jarklee.materialdatetimepicker.time;

import java.util.Locale;

public class TimePickerSetting {

    private static TimePickerSetting instance;

    public static TimePickerSetting getInstance() {
        if (instance == null) {
            instance = new TimePickerSetting();
        }
        return instance;
    }

    private TimePickerSetting() {
    }

    private Locale mLocale = Locale.getDefault();

    public Locale getLocale() {
        return mLocale;
    }

    public boolean updateLocale(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        if (locale != mLocale && !locale.equals(mLocale)) {
            mLocale = locale;
            return true;
        }
        return false;
    }
}
