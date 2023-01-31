package learn.sfgpetclinic.services

import learn.sfgpetclinic.model.Vet

interface VetService {
    fun findByID(id:Long): Vet
    fun save(vet: Vet): Vet
    fun findAll(): Set<Vet>
}