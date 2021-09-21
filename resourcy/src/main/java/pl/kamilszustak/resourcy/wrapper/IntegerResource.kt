package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import androidx.annotation.IntegerRes

data class IntegerResource(
    @IntegerRes override val id: Int,
) : Resource<Int>() {

    override fun get(context: Context): Int {
        return context.resources.getInteger(id)
    }
}