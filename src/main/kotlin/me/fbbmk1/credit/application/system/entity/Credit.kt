package me.fbbmk1.credit.application.system.entity

import jakarta.persistence.*
import me.fbbmk1.credit.application.system.enumerator.Status
import java.math.BigDecimal
import java.time.LocalDate
import java.util.*

@Entity
class Credit (
    @Column(nullable = false, unique = true) val creditCode: UUID = UUID.randomUUID(),
    @Column(nullable = false) val creditValue: BigDecimal = BigDecimal.ZERO,
    @Column(nullable = false) val dayFirstInstallment: LocalDate,
    @Column(nullable = false) val numberOfInstallments: Int = 0,
    @Enumerated @Column(nullable = false) val status: Status = Status.IN_PROGRESS,
    @ManyToOne val customer: Customer? = null,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null
)
