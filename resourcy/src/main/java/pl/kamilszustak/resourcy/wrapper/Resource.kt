package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import android.content.res.Resources

abstract class Resource<T> {
    abstract val id: Int

    abstract fun get(context: Context): T

    open fun getOrNull(context: Context): T? {
        return try {
            get(context)
        } catch (exception: Resources.NotFoundException) {
            null
        }
    }
}