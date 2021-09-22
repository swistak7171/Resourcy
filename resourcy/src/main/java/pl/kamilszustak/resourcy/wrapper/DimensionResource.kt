package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import androidx.annotation.DimenRes
import pl.kamilszustak.resourcy.R

data class DimensionResource(
    @DimenRes override val id: Int,
) : Resource<Float>() {

    override fun get(context: Context): Float {
        return context.resources.getDimension(id)
    }

    companion object : HasDefaultValue<Float> {
        override val default: Resource<Float>
            get() = DimensionResource(R.dimen.default_value_dimen)
    }
}