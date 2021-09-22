package pl.kamilszustak.resourcy.wrapper

import android.content.Context
import androidx.annotation.PluralsRes
import pl.kamilszustak.resourcy.R

data class PluralStringResource(
    @PluralsRes override val id: Int,
    val quantity: Int,
    override val arguments: Array<Any> = emptyArray(),
) : ResourceWithArguments<String>() {

    companion object : HasDefaultValue<String> {
        override val default: Resource<String>
            get() = PluralStringResource(R.plurals.default_value_plurals, 0)
    }

    override fun get(context: Context): String {
        return if (arguments.isEmpty()) {
            context.resources.getQuantityString(id, quantity, quantity)
        } else {
            context.resources.getQuantityString(id, quantity, *arguments)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PluralStringResource

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