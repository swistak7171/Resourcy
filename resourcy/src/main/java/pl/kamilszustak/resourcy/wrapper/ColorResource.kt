package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.core.content.res.ResourcesCompat

data class ColorResource(
    @ColorRes override val id: Int,
) : Resource<Int>() {

    @ColorInt
    override fun get(context: Context): Int {
        return ResourcesCompat.getColor(context.resources, id, context.theme)
    }
}