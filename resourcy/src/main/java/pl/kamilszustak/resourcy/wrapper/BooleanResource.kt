package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import androidx.annotation.BoolRes
import pl.kamilszustak.resourcy.R

data class BooleanResource(
    @BoolRes override val id: Int,
) : Resource<Boolean>() {

    override fun get(context: Context): Boolean {
        return context.resources.getBoolean(id)
    }

    companion object : HasDefaultValue<Boolean> {
        override val default: Resource<Boolean>
            get() = BooleanResource(R.bool.default_value_bool)
    }
}