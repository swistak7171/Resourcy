@file:Suppress("NOTHING_TO_INLINE")
package pl.kamilszustak.resourcy.util

import androidx.fragment.app.Fragment
import pl.kamilszustak.resourcy.wrapper.Resource

inline fun <T> Fragment.getResource(resource: Resource<T>): T {
    return requireContext().getResource(resource)
}

inline fun <T> Fragment.getResourceOrNull(resource: Resource<T>): T? {
    return requireContext().getResourceOrNull(resource)
}