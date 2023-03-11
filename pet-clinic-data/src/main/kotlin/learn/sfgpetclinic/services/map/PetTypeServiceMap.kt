package learn.sfgpetclinic.services.map

import learn.sfgpetclinic.model.PetType
import learn.sfgpetclinic.services.PetTypeService
import org.springframework.stereotype.Service

@Service
class PetTypeServiceMap:AbstractMapService<PetType,Long>(), PetTypeService {
    override fun findByID(id: Long): PetType {
        return this.findByID(id)
    }

    override fun deleteById(id: Long) {
        return super.deleteByID(id)
    }
}