package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import androidx.annotation.ArrayRes
import pl.kamilszustak.resourcy.R

data class IntegerArrayResource(
    @ArrayRes override val id: Int,
) : Resource<IntArray>() {

    override fun get(context: Context): IntArray {
        return context.resources.getIntArray(id)
    }

    companion object : HasDefaultValue<IntArray> {
        override val default: Resource<IntArray>
            get() = IntegerArrayResource(R.array.default_value_integer_array)
    }
}