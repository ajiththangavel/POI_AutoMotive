package com.randstad.poi_automotive

import androidx.car.app.CarAppService
import androidx.car.app.validation.HostValidator


class TheService : CarAppService() {
    override fun createHostValidator(): HostValidator {
        return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
    }

    override fun onCreateSession(): TheSession {
        return TheSession()
    }

}