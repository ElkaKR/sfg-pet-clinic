package learn.sfgpetclinic.services

import learn.sfgpetclinic.model.Pet
import kotlin.collections.Set

interface PetService {
    fun findByID(id:Long): Pet
    fun save(pet: Pet): Pet
    fun findAll(): Set<Pet>
}