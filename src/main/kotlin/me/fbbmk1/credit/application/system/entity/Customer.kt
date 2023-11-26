package me.fbbmk1.credit.application.system.entity

import java.net.Inet4Address

data class Customer(
    var firstName: String = "",
    var lastName: String = "",
    val cpf: String = "",
    var email: String = "",
    var password: String = "",
    var address: Address = Address(),
    var credits: List<Credit>,
    val id: Long? = null
)
