package org.example

import java.math.BigDecimal

interface PaymentSystem {
    fun pay(amountOfMoney: BigDecimal)
}

class CashPayment : PaymentSystem {
    override fun pay(amountOfMoney: BigDecimal) {
        println("Paying $amountOfMoney using cash")
    }
}

class CardPayment : PaymentSystem {
    override fun pay(amountOfMoney: BigDecimal) {
        println("Paying $amountOfMoney using card")
    }
}

class CryptoPayment : PaymentSystem {
    override fun pay(amountOfMoney: BigDecimal) {
        println("Paying $amountOfMoney using crypto")
    }
}

abstract class Market(val paymentSystem: PaymentSystem) {
    abstract fun pay()
}

class Supermarket(paymentSystem: PaymentSystem) : Market(paymentSystem) {
    override fun pay() {
        paymentSystem.pay(BigDecimal(100))
    }
}

class GroceryStore(paymentSystem: PaymentSystem) : Market(paymentSystem) {
    override fun pay() {
        paymentSystem.pay(BigDecimal(50))
    }
}
