package com.tsaryk.android_lesson_app

import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answer: Boolean)