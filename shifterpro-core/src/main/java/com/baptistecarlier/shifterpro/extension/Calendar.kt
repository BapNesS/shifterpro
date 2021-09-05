/*
 *  Copyright ShifterPro and contributors.
 *  Use of this source code is governed by the Apache 2.0 license.
 *
 *  https://github.com/bapness/shifterpro
 */

package com.baptistecarlier.shifterpro.extension

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.format(pattern: String): String =
    SimpleDateFormat(pattern, Locale.getDefault()).format(this.timeInMillis)