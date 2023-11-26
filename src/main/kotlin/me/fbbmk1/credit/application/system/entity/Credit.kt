package me.fbbmk1.credit.application.system.entity

import me.fbbmk1.credit.application.system.enumerator.Status
import java.math.BigDecimal
import java.time.LocalDate
import java.util.*

class Credit (
    val creditCode: UUID = UUID.randomUUID(),
    val creditValue: BigDecimal = BigDecimal.ZERO,
    val dayFirstInstallment: LocalDate,
    val numberOfInstallments: Int = 0,
    val status: Status = Status.IN_PROGRESS,
    val customer: Customer? = null,
    val id: Long? = null
)
