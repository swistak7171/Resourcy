package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat
import pl.kamilszustak.resourcy.R

data class DrawableResource(
    @DrawableRes override val id: Int,
) : Resource<Drawable>() {

    companion object : HasDefaultValue<Drawable> {
        override val default: Resource<Drawable>
            get() = DrawableResource(R.color.default_value_color)
    }

    override fun get(context: Context): Drawable {
        return ResourcesCompat.getDrawable(context.resources, id, context.theme)
            ?: throw Resources.NotFoundException("Drawable with ID $id not found")
    }
}