/*
 *  Copyright ShifterPro and contributors.
 *  Use of this source code is governed by the Apache 2.0 license.
 *
 *  https://github.com/bapness/shifterpro
 */

package com.baptistecarlier.shifterpro.extension

import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.toJavaLocalDateTime
import java.time.format.DateTimeFormatter

fun LocalDateTime.format(pattern: String, default: String): String {
    val javaLocalDateTime = this.toJavaLocalDateTime()
    val formatter = DateTimeFormatter.ofPattern(pattern)
    return formatter.format(javaLocalDateTime) ?: default
}

