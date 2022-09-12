package com.aardvark.kranek.presentation.common

data class State(
    val number1: String = "",
    val number2: String = "",
    val operation: Action.Operation? = null
)