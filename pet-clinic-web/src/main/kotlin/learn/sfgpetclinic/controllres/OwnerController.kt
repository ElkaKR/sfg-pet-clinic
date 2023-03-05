package learn.sfgpetclinic.controllres


import learn.sfgpetclinic.services.OwnerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/owners")
@Controller
class OwnerController {
    @Autowired
    lateinit var ownerService: OwnerService
    @GetMapping("", "/","/index","/index.html")
    fun listOwners(model: Model):String{
        model.addAttribute("owners", ownerService.findAll())
        return "owners/index"
    }
}