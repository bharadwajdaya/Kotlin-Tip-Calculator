package com.vavy.tipcalculator.util

fun calculateTip(totalBill: Double, tipPercentage: Int): Double {
    if(totalBill>1 && totalBill.toString().isNotEmpty()){
        return (totalBill*tipPercentage)/100
    }
    else
    {
        return 0.0
    }
}

fun calculateTotalPerPerson(
    totalBill: Double,
    splitBy: Int,
    tipPercentage: Int
): Double{
    val bill=calculateTip(totalBill=totalBill,tipPercentage=tipPercentage)+totalBill;
    return (bill/splitBy);
}