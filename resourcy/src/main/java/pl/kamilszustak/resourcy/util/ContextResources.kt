@file:Suppress("NOTHING_TO_INLINE")
package pl.kamilszustak.resourcy.util

import android.content.Context
import pl.kamilszustak.resourcy.wrapper.Resource

inline fun <T> Context.getResource(resource: Resource<T>): T {
    return resource.get(this)
}

inline fun <T> Context.getResourceOrNull(resource: Resource<T>): T? {
    return resource.getOrNull(this)
}