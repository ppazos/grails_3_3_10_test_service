package com.cabolabs

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class DummyDomainSpec extends Specification implements DomainUnitTest<DummyDomain> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
