package pl.kamilszustak.resourcy.wrapper

abstract class ResourceWithArguments<T> : Resource<T>() {
    abstract val arguments: Array<Any>
}