package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import androidx.annotation.ArrayRes

data class IntegerArrayResource(
    @ArrayRes override val id: Int,
) : Resource<IntArray>() {

    override fun get(context: Context): IntArray {
        return context.resources.getIntArray(id)
    }
}