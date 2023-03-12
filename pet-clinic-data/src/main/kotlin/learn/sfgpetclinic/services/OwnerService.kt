package learn.sfgpetclinic.services

import learn.sfgpetclinic.model.Owner
import learn.sfgpetclinic.services.CrudService

interface OwnerService: CrudService <Owner, Long> {

}