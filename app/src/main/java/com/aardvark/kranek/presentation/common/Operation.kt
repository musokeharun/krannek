package com.aardvark.kranek.presentation.common

sealed class Operation(val symbol: String) {
    object Add : Operation("+")
    object Subtract : Operation("-")
    object Multiply : Operation("x")
    object Divide : Operation("/")
}