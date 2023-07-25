package be.issouf.calculatorapp

enum class CalculationOperator(val symbols: String? = null) {
    NONE,
    ADDITION("*"),
    SUBSTRACTION("-"),
    MULTUPLICATION("+"),
    DIVISION(":")
}