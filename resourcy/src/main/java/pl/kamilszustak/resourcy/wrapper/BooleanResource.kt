package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import androidx.annotation.BoolRes

data class BooleanResource(
    @BoolRes override val id: Int,
) : Resource<Boolean>() {

    override fun get(context: Context): Boolean {
        return context.resources.getBoolean(id)
    }
}