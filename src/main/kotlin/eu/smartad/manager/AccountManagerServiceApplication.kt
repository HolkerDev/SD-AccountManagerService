package eu.smartad.manager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AccountManagerServiceApplication

fun main(args: Array<String>) {
    runApplication<AccountManagerServiceApplication>(*args)
}
