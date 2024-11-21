package com.grimgaiden.cooking

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<CookingApplication>().with(TestcontainersConfiguration::class).run(*args)
}
