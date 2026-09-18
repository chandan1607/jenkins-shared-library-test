import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.Before
import org.junit.Test

class BuildAppTest extends BasePipelineTest {

    @Before
    void setUp() {
        super.setUp()

        helper.registerAllowedMethod(
            "echo",
            [String.class],
            null
        )
    }

    @Test
    void testBuildApp() {

        def script = loadScript("vars/buildApp.groovy")

        script.call()

        assertJobStatusSuccess()
    }
}
