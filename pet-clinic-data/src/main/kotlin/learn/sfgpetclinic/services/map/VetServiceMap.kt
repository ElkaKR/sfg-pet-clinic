package learn.sfgpetclinic.services.map

import learn.sfgpetclinic.model.Vet
import learn.sfgpetclinic.services.VetService
import org.springframework.stereotype.Service

@Service
class VetServiceMap:AbstractMapService<Vet, Long?>(), VetService {
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