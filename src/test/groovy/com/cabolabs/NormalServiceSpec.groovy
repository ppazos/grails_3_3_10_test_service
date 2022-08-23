package com.cabolabs

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class NormalServiceSpec extends Specification implements ServiceUnitTest<NormalService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
