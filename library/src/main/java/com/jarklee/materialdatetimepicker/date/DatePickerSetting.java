/*
 * ******************************************************************************
 *  Copyright Ⓒ 2017. Dotohsoft.com. All right reserved
 *  Author TrinhQuan. Create on 2017/1/9
 * ******************************************************************************
 */

package com.jarklee.materialdatetimepicker.date;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class DatePickerSetting {

    private static DatePickerSetting instance;

    public static DatePickerSetting getInstance() {
        if (instance == null) {
            instance = new DatePickerSetting();
        }
        return instance;
    }

    private DatePickerSetting() {
        SimpleDateFormat YEAR_FORMAT = new SimpleDateFormat("yyyy", mLocale);
        DatePickerDialog.YEAR_FORMAT = YEAR_FORMAT;
        DayPickerView.YEAR_FORMAT = YEAR_FORMAT;
        DatePickerDialog.DAY_FORMAT = new SimpleDateFormat("dd", mLocale);
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
            SimpleDateFormat YEAR_FORMAT = new SimpleDateFormat("yyyy", locale);
            DatePickerDialog.YEAR_FORMAT = YEAR_FORMAT;
            DayPickerView.YEAR_FORMAT = YEAR_FORMAT;
            DatePickerDialog.DAY_FORMAT = new SimpleDateFormat("dd", locale);
            return true;
        }
        return false;
    }
}
