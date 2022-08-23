package com.cabolabs

import grails.gorm.transactions.Transactional

@Transactional
class ScopedService {

    static scope = "request"

    def serviceMethod() {

    }
}
