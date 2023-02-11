package learn.sfgpetclinic.bootstrap

import learn.sfgpetclinic.model.Owner
import learn.sfgpetclinic.model.Vet
import learn.sfgpetclinic.services.OwnerService
import learn.sfgpetclinic.services.VetService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataLoader : CommandLineRunner {
    @Autowired
    lateinit var ownerService: OwnerService
    @Autowired
    lateinit var vetService: VetService

    override fun run(vararg args: String?) {
        Owner().apply {
            firstName = "Michael"
            lastName = "Weston"
        }.also { ownerService.save(it) }
        Owner().apply {
            firstName = "Fiona"
            lastName = "Glenanne"
        }.also { ownerService.save(it) }
        println("Loaded owners...")
        Vet().apply {
            firstName = "Sam"
            lastName = "Axe"
        }.also { vetService.save(it) }
        Vet().apply {
            firstName = "John"
            lastName = "Silver"
        }.also { vetService.save(it) }
        println("Loaded vets...")
    }
}