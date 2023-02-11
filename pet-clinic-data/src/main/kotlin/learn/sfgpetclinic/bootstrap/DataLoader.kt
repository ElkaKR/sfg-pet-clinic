package learn.sfgpetclinic.bootstrap

import learn.sfgpetclinic.model.Owner
import learn.sfgpetclinic.model.Vet
import learn.sfgpetclinic.services.OwnerService
import learn.sfgpetclinic.services.VetService
import learn.sfgpetclinic.services.map.OwnerServiceMap
import learn.sfgpetclinic.services.map.VetServiceMap
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataLoader : CommandLineRunner {

    private final val ownerService: OwnerService = OwnerServiceMap()
    private final val vetService: VetService = VetServiceMap()

    override fun run(vararg args: String?) {
        Owner().apply {
            id = 1L
            firstName = "Michael"
            lastName = "Weston"
        }.also { ownerService.save(it) }
        Owner().apply {
            id = 2L
            firstName = "Michael"
            lastName = "Weston"
        }.also { ownerService.save(it) }
        println("Loaded owners...")
        Vet().apply {
            id = 1L
            firstName = "Sam"
            lastName = "Axe"
        }.also { vetService.save(it) }
        Vet().apply {
            id = 2L
            firstName = "John"
            lastName = "Silver"
        }.also { vetService.save(it) }
        println("Loaded vets...")
    }
}