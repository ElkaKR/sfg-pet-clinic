package learn.sfgpetclinic.services.map

import learn.sfgpetclinic.model.Owner
import learn.sfgpetclinic.services.OwnerService
import learn.sfgpetclinic.services.PetService
import learn.sfgpetclinic.services.PetTypeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class OwnerServiceMap:AbstractMapService<Owner, Long>(), OwnerService {

    @Autowired
    lateinit var petTypeService:PetTypeService
    @Autowired
    lateinit var petService: PetService

    override fun findByID(id: Long): Owner {
        return this.findByID(id)
    }

    override fun deleteById(id: Long) {
        return super.deleteByID(id)
    }

    override fun save(data: Owner): Owner {
        data.pets.forEach{
            if (it.petType != null){
               if (it.petType!!.id == null) {
                   petTypeService.save(it.petType!!)
               }
            } else throw RuntimeException("Required Pet Type")
            if (it.id == null) petService.save(it)
        }
        return super.save(data)
    }


}