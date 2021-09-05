/*
*  Copyright ShifterPro and contributors.
*  Use of this source code is governed by the Apache 2.0 license.
*
*  https://github.com/bapness/shifterpro
*/

package com.baptistecarlier.shifterpro.extension

import android.content.res.Resources

val Int.dp: Int
    get() = (this / Resources.getSystem().displayMetrics.density).toInt()
val Int.px: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()
val Float.dp: Int
    get() = (this / Resources.getSystem().displayMetrics.density).toInt()
val Float.px: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()
