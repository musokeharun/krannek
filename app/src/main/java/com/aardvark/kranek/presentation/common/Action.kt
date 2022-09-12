package com.aardvark.kranek.presentation.common

sealed class Action {
    data class Number(val number: Int) : Action()
    object Clear : Action()
    object Delete : Action()
    data class Operation(val operation: Operation?) : Action()
    object Calculate : Action()
    object Decimal : Action()
}