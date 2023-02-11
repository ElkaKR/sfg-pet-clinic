package learn.sfgpetclinic.services.map

import learn.sfgpetclinic.model.Owner
import learn.sfgpetclinic.services.OwnerService

class OwnerServiceMap:AbstractMapService<Owner, Long?>(), OwnerService {
    override fun findByLastName(lastName: String): Owner {
        TODO("Not yet implemented")
    }

    override fun findByID(id: Long): Owner {
        return this.findByID(id)
    }

    override fun save(data: Owner): Owner {
        return super.save(data.id, data)
    }

    override fun deleteById(id: Long) {
        return super.deleteByID(id)
    }


}