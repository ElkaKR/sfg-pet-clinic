package learn.sfgpetclinic.model

import java.time.LocalDate

class Pet:BaseEntity() {
    var name:String? = null
    var birthday:LocalDate? = null
    var petType:PetType? = null
    var owner:Owner? = null
}