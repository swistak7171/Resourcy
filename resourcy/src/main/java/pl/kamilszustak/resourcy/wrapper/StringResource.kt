package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import androidx.annotation.StringRes
import pl.kamilszustak.resourcy.R

data class StringResource(
    @StringRes override val id: Int,
    val arguments: Array<Any> = emptyArray(),
) : Resource<String>() {

    companion object : HasDefaultValue<String> {
        override val default: Resource<String>
            get() = StringResource(R.string.default_value_string)
    }

    override fun get(context: Context): String {
        return if (arguments.isEmpty()) {
            context.getString(id)
        } else {
            context.getString(id, *arguments)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as StringResource

        if (id != other.id) return false
        if (!arguments.contentEquals(other.arguments)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + arguments.contentHashCode()

        return result
    }
}