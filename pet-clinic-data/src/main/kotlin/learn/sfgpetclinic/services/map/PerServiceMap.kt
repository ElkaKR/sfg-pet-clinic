package learn.sfgpetclinic.services.map

import learn.sfgpetclinic.model.Pet
import learn.sfgpetclinic.services.CrudService

class PerServiceMap:AbstractMapService<Pet, Long>(), CrudService<Pet, Long> {

    override fun findByID(id: Long): Pet {
       return this.findByID(id)
    }

    override fun save(data: Pet): Pet {
        return super.save(data.id, data)
    }

    override fun deleteById(id: Long) {
        return super.deleteByID(id)
    }
}