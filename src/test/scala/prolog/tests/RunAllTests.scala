package prolog.tests

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by Ganesh on 4/11/2017.
  */
class RunAllTests extends FlatSpec with Matchers{

  "RunAllOldTests" must "Succeed" in{
    prolog.tests.Test.main(Array(""))
    prolog.tests.Tests.main(Array(""))
  }
}
