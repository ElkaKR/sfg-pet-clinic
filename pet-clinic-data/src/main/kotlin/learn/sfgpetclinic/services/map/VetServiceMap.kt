package learn.sfgpetclinic.services.map

import learn.sfgpetclinic.model.Vet
import learn.sfgpetclinic.services.CrudService

class VetServiceMap:AbstractMapService<Vet, Long>(), CrudService<Vet, Long> {
    override fun findByID(id: Long): Vet {
       return this.findByID(id)
    }

    override fun save(data: Vet): Vet {
        return super.save(data.id, data)
    }

    override fun deleteById(id: Long) {
        return super.deleteByID(id)
    }
}