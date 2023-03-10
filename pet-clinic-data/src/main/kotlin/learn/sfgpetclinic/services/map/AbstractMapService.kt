package learn.sfgpetclinic.services.map

import learn.sfgpetclinic.model.BaseEntity

abstract class AbstractMapService<T:BaseEntity, ID:Long>{
    protected val map:MutableMap<Long, T> = hashMapOf()
    open fun findAll(): Set<T> {
        return HashSet(map.values)
    }
    open fun save(data:T):T{
        val idToSave = data.id ?: getNextId().also { data.id = it }
        return map.put(idToSave, data).let { data }
    }
    open fun deleteByID(id:ID){
        map.remove(id)
    }
    open fun delete(data:T){
        map.entries.removeIf { entry -> entry.value?.equals(data) ?:false }
    }

    fun getNextId():Long{
        return map.keys.ifEmpty{setOf(0L)}.max() + 1
    }
}