package com.cabolabs

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class ScopedServiceSpec extends Specification implements ServiceUnitTest<ScopedService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
