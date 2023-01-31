package learn.sfgpetclinic.services

import learn.sfgpetclinic.model.Owner
import kotlin.collections.Set

interface OwnerService {
    fun findByLastName(lastName:String):Owner
    fun findByID(id:Long):Owner
    fun save(owner: Owner):Owner
    fun findAll(): Set<Owner>
}