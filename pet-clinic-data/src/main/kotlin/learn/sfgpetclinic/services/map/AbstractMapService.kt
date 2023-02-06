package learn.sfgpetclinic.services.map

import learn.sfgpetclinic.services.CrudService

abstract class AbstractMapService<T, ID>{
    protected val map:MutableMap<ID?, T> = hashMapOf()
    fun findAll(): Set<T> {
        return HashSet(map.values)
    }
    fun save(id:ID?, data:T):T?{
        map.put(id, data)
        return data
    }
    fun deleteByID(id:ID){
        map.remove(id)
    }
    fun delete(data:T){
        map.entries.removeIf { entry -> entry.value?.equals(data) ?:false }
    }
}