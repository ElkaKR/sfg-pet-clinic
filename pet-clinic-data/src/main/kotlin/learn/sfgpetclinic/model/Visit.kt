package learn.sfgpetclinic.model

import java.time.LocalDate

class Visit:BaseEntity() {
    var date: LocalDate = LocalDate.now()
    var description:String? = null
    var pet:Pet? = null

}