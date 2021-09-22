package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import androidx.annotation.DimenRes

data class DimensionResource(
    @DimenRes override val id: Int,
) : Resource<Float>() {

    override fun get(context: Context): Float {
        return context.resources.getDimension(id)
    }
}