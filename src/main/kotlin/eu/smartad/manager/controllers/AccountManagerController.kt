package eu.smartad.manager.controllers

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AccountManagerController {
    private val log = LoggerFactory.getLogger(AccountManagerController::class.java)

    @GetMapping("/test")
    fun test(): ResponseEntity<*> {
        return ResponseEntity.ok("Account controller works fine. Test is done")
    }
}