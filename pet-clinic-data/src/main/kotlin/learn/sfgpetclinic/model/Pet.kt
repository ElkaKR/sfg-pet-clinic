package learn.sfgpetclinic.model

import java.time.LocalDate

class Pet:BaseEntity() {
    val birthday:LocalDate? = null
    val petType:PetType? = null
    val owner:Owner? = null
}