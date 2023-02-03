package learn.sfgpetclinic.services

import kotlin.collections.Set

interface CrudService<T,ID> {
    fun findAll(): Set<T>
    fun findByID(id: ID):T
    fun save(data: T):T
    fun delete(data: T)
    fun deleteById(id:ID)
}