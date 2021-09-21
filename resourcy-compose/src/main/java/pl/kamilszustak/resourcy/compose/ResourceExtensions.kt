@file:Suppress("NOTHING_TO_INLINE")
package pl.kamilszustak.resourcy.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.platform.LocalContext
import pl.kamilszustak.resourcy.wrapper.Resource

@Composable
@ReadOnlyComposable
inline fun <T> Resource<T>.get(): T {
    return get(LocalContext.current)
}

@Composable
@ReadOnlyComposable
inline fun <T> Resource<T>.getOrNull(): T? {
    return getOrNull(LocalContext.current)
}