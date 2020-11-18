package org.sks.project

//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification;

@SpringBootTest
class Basic_REST_Project_Tests extends Specification
{
    def setupSpec()
    {
        reportHeader """
            Specified below are strict tests covering the basic behavior
            of this little REST service!
            Have fun !
        """
    }

    //@Test <- Not needed because Spock knows that this is a test!
    def 'Hello Test-Suite!'()
    {
        given : 'We print a greeting for our testsuite...'
            print("Hello test suite!")
        expect : 'Spock will make sure that true is true!'
            true
    }

}
