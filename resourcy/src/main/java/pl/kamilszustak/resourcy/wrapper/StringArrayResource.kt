package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import androidx.annotation.ArrayRes
import pl.kamilszustak.resourcy.R

data class StringArrayResource(
    @ArrayRes override val id: Int,
) : Resource<Array<String>>() {

    companion object : HasDefaultValue<Array<String>> {
        override val default: Resource<Array<String>>
            get() = StringArrayResource(R.array.default_value_string_array)
    }

    override fun get(context: Context): Array<String> {
        return context.resources.getStringArray(id)
    }
}