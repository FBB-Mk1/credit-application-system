package me.fbbmk1.credit.application.system.entity

import jakarta.persistence.Entity
import jakarta.persistence.*


@Entity
data class Customer(
    @Column(nullable = false) var firstName: String = "",
    @Column(nullable = false) var lastName: String = "",
    @Column(nullable = false, unique = true) val cpf: String = "",
    @Column(nullable = false, unique = true) var email: String = "",
    @Column(nullable = false) var password: String = "",
    @Column(nullable = false) @Embedded var address: Address = Address(),
    @Column(nullable = false) @OneToMany(fetch = FetchType.LAZY,
        cascade = [CascadeType.REMOVE, CascadeType.PERSIST],
        mappedBy = "customer"
    ) var credits: List<Credit>,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null
)
