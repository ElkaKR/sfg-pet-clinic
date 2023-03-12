package learn.sfgpetclinic.services.map

import learn.sfgpetclinic.model.Speciality
import learn.sfgpetclinic.services.SpecialityService
import org.springframework.stereotype.Service

@Service
class SpecialityMapService:AbstractMapService<Speciality, Long>(),SpecialityService {
    override fun findByID(id: Long): Speciality {
        return this.findByID(id)
    }

    override fun deleteById(id: Long) {
        return super.deleteByID(id)
    }

    override fun save(data: Speciality): Speciality {
        return super.save(data)
    }

    override fun findAll(): Set<Speciality> {
        return super.findAll()
    }
}