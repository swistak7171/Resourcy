package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import androidx.annotation.IntegerRes
import pl.kamilszustak.resourcy.R

data class IntegerResource(
    @IntegerRes override val id: Int,
) : Resource<Int>() {

    override fun get(context: Context): Int {
        return context.resources.getInteger(id)
    }

    companion object : HasDefaultValue<Int> {
        override val default: Resource<Int>
            get() = IntegerResource(R.integer.default_value_integer)
    }
}