package pl.kamilszustak.resourcy.wrapper

interface HasDefaultValue<T> {
    val default: Resource<T>
}