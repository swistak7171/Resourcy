package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import androidx.annotation.ArrayRes

data class StringArrayResource(
    @ArrayRes override val id: Int,
) : Resource<Array<String>>() {

    override fun get(context: Context): Array<String> {
        return context.resources.getStringArray(id)
    }
}