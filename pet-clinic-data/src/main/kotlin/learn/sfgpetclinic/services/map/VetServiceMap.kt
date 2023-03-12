package learn.sfgpetclinic.services.map

import learn.sfgpetclinic.model.Vet
import learn.sfgpetclinic.services.SpecialityService
import learn.sfgpetclinic.services.VetService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class VetServiceMap:AbstractMapService<Vet, Long>(), VetService {
    @Autowired
    lateinit var specialtyService:SpecialityService
    override fun findByID(id: Long): Vet {
       return this.findByID(id)
    }

    override fun deleteById(id: Long) {
        return super.deleteByID(id)
    }

    override fun save(data: Vet): Vet {
        data.specialities.forEach {
            if (it.id == null) specialtyService.save(it)
        }
        return super.save(data)
    }
}