package learn.sfgpetclinic.services.map

import learn.sfgpetclinic.model.Pet
import learn.sfgpetclinic.services.PetService
import org.springframework.stereotype.Service

@Service
class PetServiceMap:AbstractMapService<Pet, Long>(), PetService {

    override fun findByID(id: Long): Pet {
       return this.findByID(id)
    }

    override fun save(data: Pet): Pet {
        return this.save( data)
    }

    override fun deleteById(id: Long) {
        return super.deleteByID(id)
    }
}