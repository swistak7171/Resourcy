package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat

data class DrawableResource(
    @DrawableRes override val id: Int,
) : Resource<Drawable>() {

    override fun get(context: Context): Drawable {
        return ResourcesCompat.getDrawable(context.resources, id, context.theme)
            ?: throw Resources.NotFoundException("Drawable with ID $id not found")
    }
}