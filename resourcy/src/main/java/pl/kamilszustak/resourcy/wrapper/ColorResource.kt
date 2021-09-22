package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.core.content.res.ResourcesCompat
import pl.kamilszustak.resourcy.R

data class ColorResource(
    @ColorRes override val id: Int,
) : Resource<Int>() {

    companion object : HasDefaultValue<Int> {
        override val default: Resource<Int>
             get() = ColorResource(R.color.default_value_color)
    }

    @ColorInt
    override fun get(context: Context): Int {
        return ResourcesCompat.getColor(context.resources, id, context.theme)
    }
}