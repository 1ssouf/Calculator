package be.issouf.calculatorapp

data class UiState(
    val calculationExpression: String = "",
    val firstNumber: String = "0",
    val seconNumber: String = "0",
    val currentOperator: CalculationOperator = CalculationOperator.NONE,
    val answer: String = ""
)
