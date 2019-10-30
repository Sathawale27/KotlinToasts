@file:Suppress("NOTHING_TO_INLINE")

package com.sarveshathawale.kotlintoasts

import android.content.Context
import android.widget.Toast

/**
 * Display the simple Toast message with the [Toast.LENGTH_LONG] duration.
 *
 * @param message The actual message to show in toast
 */
inline fun Context.longToast(message: () -> String): Toast = Toast
    .makeText(this, message(), Toast.LENGTH_SHORT)
    .apply {
        show()
    }

/**
 * Display the simple Toast message with the [Toast.LENGTH_SHORT] duration.
 *
 * @param message The actual message to show in toast
 */
inline fun Context.shortToast(message: () -> String): Toast = Toast
    .makeText(this, message(), Toast.LENGTH_SHORT)
    .apply {
        show()
    }
